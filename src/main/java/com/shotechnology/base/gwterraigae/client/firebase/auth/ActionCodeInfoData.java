package com.shotechnology.base.gwterraigae.client.firebase.auth;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface ActionCodeInfoData 
{
    @JsProperty
    String getEmail();
}