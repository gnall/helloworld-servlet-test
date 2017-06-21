package com.shotechnology.base.gwterraigae.client.firebase;

import com.shotechnology.base.gwterraigae.client.firebase.auth.Auth;
import com.shotechnology.base.gwterraigae.client.firebase.auth.Messaging;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "firebase.app", name = "App")
public class Firebase {

    @JsMethod(namespace = "firebase")
    public static native Firebase initializeApp(Config config);

    @JsProperty
    public native String getName();
    
    public native Auth auth();

    public native Messaging messaging();
    //public native Database database();
}