package com.shotechnology.base.gwterraigae.client.firebase.auth;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class Error 
{
    @JsProperty
    public native String getCharge();
    
    @JsProperty
    public native String getType();
    
    @JsProperty
    public native String getMessage();
}
