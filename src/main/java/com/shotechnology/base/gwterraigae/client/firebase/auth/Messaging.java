package com.shotechnology.base.gwterraigae.client.firebase.auth;

import com.shotechnology.base.gwterraigae.client.firebase.Promise;

import com.shotechnology.base.gwterraigae.client.stripe.Error;

import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "firebase.messaging", name = "Messaging")
public class Messaging 
{
    public native Promise<Void, Error> requestPermission();
    
    public native Promise<String, Error> getToken();
}