package com.example.carlosanguiano.asynctaskactivity;

import android.content.Context;
import android.os.AsyncTask;

/**
 * Created by CarlosAnguiano on 20/10/17.
 */

class SomeTask extends AsyncTask<Void, Void, String> {

    private Context mcontext;
    private Exception mException;
    private OnEventListener<String> mCallback;

    public SomeTask(Context context, OnEventListener<String> callback) {
        mcontext = context;
        mCallback = callback;
    }

    @Override
    protected String doInBackground(Void... voids) {
        try {
            return "Hello World";
        } catch (Exception e) {
            mException = e;
        }
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        if (mCallback != null){
            if (mException == null){
                mCallback.onSuccess(s);
            }else{
                mCallback.onFailure(mException);
            }
        }
        super.onPostExecute(s);
    }
}
