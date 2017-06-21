package com.shotechnology.base.gwterraigae.client.stripe;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class Changed<T>
{
    @JsProperty
    public native String getName();

    @JsProperty
    public native T getObject();

    @JsProperty
    public native String getType();
}