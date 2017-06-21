package com.shotechnology.base.gwterraigae.client.stripe;

import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "stripe", name = "Element")
public class Element 
{
    public native void mount(String domElement);
    
    public native void on(String event, EventListener<? extends JsObject> eventListener);
    
    public native void blur();
    
    public native void clear();
    
    public native void focus();
    
    public native void unmount();
    
    //public native void mount(Options options);
}