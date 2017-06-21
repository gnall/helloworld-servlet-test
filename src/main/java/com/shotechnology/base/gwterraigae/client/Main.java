package com.shotechnology.base.gwterraigae.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;

import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Templated
public class Main extends Composite 
{
    @Inject
    @DataField
    SimplePanel container;
    
    public Main() { }
    
    @PostConstruct
    public void init() { }

    public SimplePanel getContainer() {
        return container;
    }
}