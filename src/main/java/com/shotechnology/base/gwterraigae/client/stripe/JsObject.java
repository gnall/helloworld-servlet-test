package com.shotechnology.base.gwterraigae.client.stripe;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class JsObject {

    @JsMethod
    public static native <T extends JsObject> void observe(T model, Function<Changed<T>[], Void> fn);
    
    public static native String[] getOwnPropertyNames(Object object);
    
    public native boolean hasOwnProperty(String name);
    
}