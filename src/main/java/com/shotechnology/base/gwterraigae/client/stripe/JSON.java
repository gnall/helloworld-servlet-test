package com.shotechnology.base.gwterraigae.client.stripe;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "JSON")
abstract public class JSON 
{
	native static public <T> T parse(String json);
	
	native static public <T> T stringify(Object json);
}