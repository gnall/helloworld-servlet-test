package com.shotechnology.base.gwterraigae.client;

import org.jboss.errai.ui.shared.api.annotations.Templated;

@Templated
@org.jboss.errai.ui.nav.client.local.Page(path = "profile")
public class ProfilePage extends Page 
{	
    @Override
    public void onPostConstruct() 
    {
        super.onPostConstruct();
        
        setId("profile-page");
    }
    
    @Override
    public void onPageShown()
    {
    	super.onPageShown();
    }
}