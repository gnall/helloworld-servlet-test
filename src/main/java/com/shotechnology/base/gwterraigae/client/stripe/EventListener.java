package com.shotechnology.base.gwterraigae.client.stripe;

import jsinterop.annotations.JsFunction;

@FunctionalInterface
@JsFunction
public interface EventListener<E extends JsObject> 
{
    public void onEvent(E event);
}