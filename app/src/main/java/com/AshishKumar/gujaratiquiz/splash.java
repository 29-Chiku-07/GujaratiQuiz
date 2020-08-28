package com.AshishKumar.gujaratiquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread = new Thread()
        {
            @Override
            public void run()
            {
                try {
                    sleep(1700);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    Intent mainIntent = new Intent(splash.this , MainActivity.class);
                    startActivity(mainIntent);
                }
            }
        };
        thread.start();

    }

    protected void onPause() {
        super.onPause();
        finish();
    }
}