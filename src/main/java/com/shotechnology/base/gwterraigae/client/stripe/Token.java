package com.shotechnology.base.gwterraigae.client.stripe;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface Token
{
    @JsProperty
    public String getId();
	
    @JsProperty
    public String getObject();
    
    @JsProperty
    public String getClient_ip();
    
    @JsProperty
    public Long getCreated();
    
    @JsProperty
    public Boolean getLivemode();
    
    @JsProperty
    public String getType();
    
    @JsProperty
    public String getUsed();
}