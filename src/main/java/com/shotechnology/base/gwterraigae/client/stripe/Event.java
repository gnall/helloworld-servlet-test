package com.shotechnology.base.gwterraigae.client.stripe;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Event<T> {

    @JsProperty
    public native T getTarget();
    
    @JsProperty
    public native T getCurrentTarget();
    
}