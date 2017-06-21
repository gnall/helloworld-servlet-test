package com.shotechnology.base.gwterraigae.client.stripe;

import com.shotechnology.base.gwterraigae.client.stripe.Promise;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class Stripe 
{	
	@JsConstructor
	public Stripe(String publishableKey) { }

    public native Elements elements();
    
    public native Promise<TokenCard, Error> createToken(Element element);
}