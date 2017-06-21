package com.shotechnology.base.gwterraigae.client.stripe;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface Function<T, E> 
{
    E call(T changed);
}