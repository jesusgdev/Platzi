package com.jesus.model;

@FunctionalInterface
public interface ButtonAction {
    void onClick(OneListenerClick oneListenerClick, String msg);
}
