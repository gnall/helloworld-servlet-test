package com.shotechnology.base.gwterraigae.client.stripe;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface Card
{
    @JsProperty
    public String getId();
    
    @JsProperty
    public String getObject();
    
    @JsProperty
    public String getAddress_city();
    
    @JsProperty
    public String getAddress_country();
    
    @JsProperty
    public String getAddress_line1();
    
    @JsProperty
    public String getAddress_line1_check();
    
    @JsProperty
    public String getAddress_line2();
    
    @JsProperty
    public String getAddress_state();
    
    @JsProperty
    public String getAddress_zip();
    
    @JsProperty
    public String getAddress_zip_check();
    
    @JsProperty
    public String getBrand();
    
    @JsProperty
    public String getCountry();
    
    @JsProperty
    public String getCvc_check();
    
    @JsProperty
    public String getDynamic_last4();
    
    @JsProperty
    public String getExp_month();
    
    @JsProperty
    public String getExp_year();
    
    @JsProperty
    public String getFunding();
    
    @JsProperty
    public String getLast4();
    
    @JsProperty
    public String getName();
    
    @JsProperty
    public String getTokenization_method();
}