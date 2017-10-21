package com.example.carlosanguiano.asynctaskactivity;

/**
 * Created by CarlosAnguiano on 20/10/17.
 */

interface OnEventListener<T> {
    void onSuccess(T s);

    void onFailure(Exception mException);
}
