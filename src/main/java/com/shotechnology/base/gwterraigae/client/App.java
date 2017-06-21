package com.shotechnology.base.gwterraigae.client;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.jboss.errai.ioc.client.api.EntryPoint;
import org.jboss.errai.ui.nav.client.local.Navigation;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.StyleInjector;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.storage.client.Storage;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.googlecode.gwtphonegap.client.PhoneGap;
import com.googlecode.gwtphonegap.client.PhoneGapAvailableEvent;
import com.googlecode.gwtphonegap.client.PhoneGapAvailableHandler;
import com.googlecode.gwtphonegap.client.PhoneGapTimeoutEvent;
import com.googlecode.gwtphonegap.client.PhoneGapTimeoutHandler;
import com.googlecode.gwtphonegap.client.splashscreen.SplashScreen;
import com.shotechnology.base.gwterraigae.client.firebase.FirebaseImpl;
import com.shotechnology.base.gwterraigae.client.firebase.Fn.Arg;
import com.shotechnology.base.gwterraigae.client.firebase.auth.User;
import com.shotechnology.base.gwterraigae.client.firebase.auth.UserCredential;
import com.shotechnology.base.gwterraigae.client.services.ServiceRpc;

@EntryPoint
public class App extends Composite
{
    @Inject
    Navigation navigation;
    
    @Inject
    Main content;
    
    PhoneGap phoneGap;
    
    public App() { } 
    
    @PostConstruct
    public void init()
	{
		this.phoneGap = GWT.create(PhoneGap.class);
		
		this.phoneGap.addHandler(new PhoneGapAvailableHandler() 
		{
	        @Override
	        public void onPhoneGapAvailable(PhoneGapAvailableEvent event) 
	        {
	        	try
	        	{
		        	//http://stackoverflow.com/questions/20339647/phonegap-build-ios-app-has-blank-white-screen-after-splash-screen
		        	final SplashScreen ss = GWT.create(SplashScreen.class);
		        	
		        	//FileOpener fop = (FileOpener) GWT.create(FileOpener.class); 
		        	//fop.initialize(); 
		        	//phoneGap.loadPlugin("fileOpener", fop);
		        	
		        	startApplication();
					
					ss.hide();
	        	}
	        	catch (Exception e)
	        	{
	        		Window.alert(e.getMessage());
	        	}
	        }
		});

		this.phoneGap.addHandler(new PhoneGapTimeoutHandler()
		{
	        @Override
	        public void onPhoneGapTimeout(PhoneGapTimeoutEvent event) {
	        	Window.alert("PhoneGap Timeout Error");
	        }
		});
		
		this.phoneGap.initializePhoneGap();
		
		FirebaseImpl.initializeFirebase();
		
		ClientUtilities.consoleLog("FirebaseImpl.getFirebase().getName(): " + FirebaseImpl.getFirebase().getName());
		
		
		
		// This will be important at some point: https://firebase.google.com/docs/auth/web/cordova
		FirebaseImpl.getFirebase().auth().getRedirectResult().then(new Arg<UserCredential>()
		{
			@Override
			public void e(UserCredential uc) 
			{
				if (uc.getUser() != null)
				{
					if (uc.getCredential() != null)
					{						
						String token = uc.getCredential().getAccessToken();
					
						ClientUtilities.consoleLog("uc.getCredential().getAccessToken(): " + token);
						
						if (token != null && token != "")
							Storage.getLocalStorageIfSupported().setItem("accessToken", token);
					}
					
					User user = uc.getUser();
					
					ClientUtilities.consoleLog("user.getEmail(): " + user.getEmail());
					ClientUtilities.consoleLog("user.getDisplayName(): " + user.getDisplayName());
					ClientUtilities.consoleLog("user.getProviderId(): " + user.getProviderId());
					ClientUtilities.consoleLog("user.getUid(): " + user.getUid());
					ClientUtilities.consoleLog("user.getPhotoURL(): " + user.getPhotoURL());
					ClientUtilities.consoleLog("user.getPhoneNumber(): " + user.getPhoneNumber());
					ClientUtilities.consoleLog("user.getEmailVerified(): " + user.getEmailVerified());
					
					if (user.getEmailVerified() == false)
						user.sendEmailVerification();
				}
				else
				{
					ClientUtilities.consoleLog("Not Logged In");
				}
			}
		});
	}
    
    private void startApplication()
    {
    	ServiceRpc.init(this.phoneGap);
    	
        StyleInjector.inject(AppClientBundle.INSTANCE.appCss().getText());
        
        this.content.getContainer().add(this.navigation.getContentPanel());
        
        RootPanel.get().add(this.content);
        
	    History.addValueChangeHandler(new ValueChangeHandler<String>() 
	    {
	    	public void onValueChange(ValueChangeEvent<String> event) 
	        {
	    		String historyToken = event.getValue();
	    		
	    		GWT.log("historyToken: " + historyToken);
	    		
	    		if (historyToken.equals("activityLog"))
	    		{
	    			
	    		}
	        }
	    });
    }
}