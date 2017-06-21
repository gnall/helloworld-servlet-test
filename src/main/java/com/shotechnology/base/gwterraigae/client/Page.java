package com.shotechnology.base.gwterraigae.client;

import org.jboss.errai.ui.nav.client.local.PageShown;
import com.google.gwt.user.client.ui.Composite;
import javax.annotation.PostConstruct;
import javax.enterprise.event.Event;
import javax.inject.Inject;

public class Page extends Composite
{
    private String id;

    public Page() { }
    
    @Inject
    Event<NavigationEvent> navigationEvent;

    @PostConstruct
    public void onPostConstruct() {}

    @PageShown
    public void onPageShown() {
        this.navigationEvent.fire(new NavigationEvent(this));
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
}