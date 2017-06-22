package com.shotechnology.base.gwterraigae.client;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.LIElement;
import com.google.gwt.dom.client.UListElement;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.shotechnology.base.gwterraigae.client.firebase.FirebaseImpl;
import com.shotechnology.base.gwterraigae.client.firebase.Fn.Arg;
import com.shotechnology.base.gwterraigae.client.firebase.auth.Messaging;
import com.shotechnology.base.gwterraigae.client.services.*;
import com.shotechnology.base.gwterraigae.client.stripe.Error;

@Templated
@org.jboss.errai.ui.nav.client.local.Page(path = "find")
public class FindPage extends Page 
{
	@Inject
    @DataField
    VerticalPanel upcomingGames;
		
	@Inject TransitionTo<FieldPage> fieldClicked;
	
	@Inject TransitionTo<ProfilePage> profileClicked;
		
	public FindPage() { }
		
    @Override
    public void onPostConstruct() 
    {
        super.onPostConstruct();
                
        setId("find-page");
        
        final UListElement ul = Document.get().createULElement();
        ul.setClassName("list-unstyled gameslist");
        upcomingGames.getElement().appendChild(ul);
        
        ServiceRpc.getGameService().getGames(new AsyncCallback<List<Game>>()
		{
			@Override
			public void onSuccess(List<Game> result) 
			{
				for (final Game game: result)
				{
			        LIElement li = Document.get().createLIElement();
			        
			        li.setInnerHTML(game.getFieldName() + " <span class=\"location\">" + game.getLocation() 
			        	+ "</span><span class=\"time\">" + game.getDateTime() + "</span><span class=\"coach\">"
			        	+ "<i class=\"material-icons\">person_outline</i>" + game.getCoachName() + "</span>");
			        
			        li.setClassName(game.getColor());
			        
			        Event.sinkEvents(li, Event.ONCLICK);
			        
			        Event.setEventListener(li, new EventListener() 
			        {
			             @Override
			             public void onBrowserEvent(Event event) 
			             {
			             	HashMap<String, String> map = new HashMap<String, String>(); 
			                map.put("fieldId", game.getId().toString());
			                Multimap<String, String> mm = Multimaps.forMap(map);
			                  
			                fieldClicked.go(mm);
			             }
			        });
			        
			        ul.appendChild(li);
				}
				requestFirebaseNotifications();
			}
			
			@Override
			public void onFailure(Throwable caught) {
				Window.alert(caught.getMessage());
			}
		});
    }
    

    
    public void requestFirebaseNotifications(){
    	Messaging messaging = FirebaseImpl.getFirebase().messaging();
    	
    	Arg<String> getTokenResolve = new Arg<String>()
		{

			@Override
			public void e(String arg) {
				GWT.log("Got the Token: " + arg);
				consoleLog("Got the token: " + arg);
			}
			
		};
		
		Arg<Error> getTokenError = new Arg<Error>()
		{

			@Override
			public void e(Error error) {
				GWT.log("failed RequestFirebaseNotifications");
				GWT.log(error.getMessage());
				consoleLog("Error getting the token: " + error);
			}
		};
		
    	Arg<Void> onResolve = new Arg<Void>()
		{

			@Override
			public void e(Void arg) {
				GWT.log("success RequestFirebaseNotifications");
				messaging.getToken().then(getTokenResolve,getTokenError);
			}
			
		};
		
    	
    	Arg<Error> onError = new Arg<Error>()
		{

			@Override
			public void e(Error error) {
				GWT.log("failed RequestFirebaseNotifications");
				GWT.log(error.getMessage());
			}
		};
		
    	messaging.requestPermission().then(onResolve,onError);
    }
    
    public native static void consoleLog(String message) /*-{
		console.log(message);
	}-*/;
}
