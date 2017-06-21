package com.shotechnology.base.gwterraigae.client.firebase.auth;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "firebase.auth", name = "UserCredential")
public interface UserCredential {

    @JsProperty
    User getUser();

    @JsProperty
    AuthCredential getCredential();
}