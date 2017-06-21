package com.shotechnology.base.gwterraigae.client.stripe;


import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class Style{
	
	@JsProperty
	Base base = new Base();
	
//	@JsProperty
//    Complete complete = new Complete();
//	
//	@JsProperty
//    Empty empty = new Empty();
//	
//	@JsProperty
//    Invalid invalid = new Invalid();
     
    public Base getBase(){
    	return base;
    }
//    public Complete getComplete(){
//    	return complete;
//    }
//    public Empty getEmpty(){
//    	return empty;
//    }
//    public Invalid getInvalid(){
//    	return invalid;
//    }
}