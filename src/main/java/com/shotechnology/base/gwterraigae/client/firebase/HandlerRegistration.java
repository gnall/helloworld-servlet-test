package com.shotechnology.base.gwterraigae.client.firebase;

public interface HandlerRegistration {
    <R extends HandlerRegistration> R on();

    <R extends HandlerRegistration> R off();
}