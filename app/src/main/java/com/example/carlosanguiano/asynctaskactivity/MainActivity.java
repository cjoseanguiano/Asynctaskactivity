package com.example.carlosanguiano.asynctaskactivity;

import android.media.MediaDrm;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SomeTask someTask = new SomeTask(getApplicationContext(), new OnEventListener<String>() {
            @Override
            public void onSuccess(String s) {
                Toast.makeText(MainActivity.this, "SUCCESS", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Exception mException) {
                Toast.makeText(MainActivity.this, "ERROR", Toast.LENGTH_SHORT).show();
            }
        });

        someTask.execute();
    }
}
