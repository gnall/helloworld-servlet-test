package com.shotechnology.base.gwterraigae.client.firebase.auth;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "firebase.auth", name = "ActionCodeInfo")
public interface ActionCodeInfo {

    @JsProperty
    ActionCodeInfoData getData();

    @JsProperty
    void setData(ActionCodeInfoData data);
}