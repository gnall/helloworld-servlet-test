package com.shotechnology.base.gwterraigae.client;

import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.gwt.core.client.GWT;

@Templated
@org.jboss.errai.ui.nav.client.local.Page(path = "callback")
public class OauthCallbackPage extends Page 
{	
	@Inject TransitionTo<MainPage> transitionToMainPage;
	
	public OauthCallbackPage() { }
	
	@Override
    public void onPageShown() 
    {
        super.onPageShown();
		
		//TODO: Capture URL Contents here??
		GWT.log("Logged In!");
		
		this.transitionToMainPage.go();
    }
}