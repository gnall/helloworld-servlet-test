package com.shotechnology.base.gwterraigae.client.stripe;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface TokenCard
{
    @JsProperty
    public CardToken getToken();
	
    @JsType(isNative = true, namespace = JsPackage.GLOBAL)
    interface CardToken extends Token
    {
        @JsProperty
        public Card getCard();
    }
}
