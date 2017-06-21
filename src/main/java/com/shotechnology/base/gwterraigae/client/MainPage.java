package com.shotechnology.base.gwterraigae.client;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.DefaultPage;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.LIElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.storage.client.Storage;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.shotechnology.base.gwterraigae.client.firebase.FirebaseImpl;
import com.shotechnology.base.gwterraigae.client.firebase.Fn.Arg;
import com.shotechnology.base.gwterraigae.client.firebase.auth.Auth;
import com.shotechnology.base.gwterraigae.client.firebase.auth.FacebookAuthProvider;
import com.shotechnology.base.gwterraigae.client.firebase.auth.User;
import com.shotechnology.base.gwterraigae.client.firebase.auth.UserCredential;

@Templated
@Page(path = "main", role = DefaultPage.class)
public class MainPage extends Composite
{
	@Inject
    @DataField
    Anchor find, profile, field, favorite, login;
	

	
	public MainPage() { }
	
	@PostConstruct
    public void onPostConstruct() 
    {}
	
    @EventHandler("login")
    public void goToLoginPage(ClickEvent e) 
    {
    	Auth auth = FirebaseImpl.getFirebase().auth();
    	
    	FacebookAuthProvider fb = new FacebookAuthProvider();

    	auth.signInWithRedirect(fb).then(new Arg<Void>()
		{
			@Override
			public void e(Void arg) 
			{
				auth.getRedirectResult().then(new Arg<UserCredential>()
				{
					@Override
					public void e(UserCredential uc) 
					{
						if (uc.getUser() != null)
						{
							if (uc.getCredential() != null)
							{						
								String token = uc.getCredential().getAccessToken();
							
								ClientUtilities.consoleLog("MainPage.html - uc.getCredential().getAccessToken(): " + token);
								
								if (token != null && token != "")
									Storage.getLocalStorageIfSupported().setItem("accessToken", token);
							}
							
							User user = uc.getUser();
							
							ClientUtilities.consoleLog("MainPage.html - user.getEmail(): " + user.getEmail());
							ClientUtilities.consoleLog("MainPage.html - user.getDisplayName(): " + user.getDisplayName());
							ClientUtilities.consoleLog("MainPage.html - user.getProviderId(): " + user.getProviderId());
							ClientUtilities.consoleLog("MainPage.html - user.getUid(): " + user.getUid());
							ClientUtilities.consoleLog("MainPage.html - user.getPhotoURL(): " + user.getPhotoURL());
							ClientUtilities.consoleLog("MainPage.html - user.getPhoneNumber(): " + user.getPhoneNumber());
							ClientUtilities.consoleLog("MainPage.html - user.getEmailVerified(): " + user.getEmailVerified());
							
							if (user.getEmailVerified() == false)
								user.sendEmailVerification();
						}
						else
						{
							ClientUtilities.consoleLog("MainPage.html - Not Logged In");
						}
					}
				});
			}
		});
    }
	
}