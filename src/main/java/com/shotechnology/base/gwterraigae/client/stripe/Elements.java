package com.shotechnology.base.gwterraigae.client.stripe;

import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "stripe", name = "Elements")
public class Elements 
{
    public native Element create(String type);
    public native Element create(String type, Style style);
}