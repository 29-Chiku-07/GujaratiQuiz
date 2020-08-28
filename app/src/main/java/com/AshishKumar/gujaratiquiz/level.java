package com.AshishKumar.gujaratiquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class level extends AppCompatActivity {

    private Button level1 , level2 , level3 , level4 , main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        level1 = findViewById(R.id.level1);
        level2 = findViewById(R.id.level2);
        level3 = findViewById(R.id.level3);
        //level4 = findViewById(R.id.level4);
        main = findViewById(R.id.main);


        level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(level.this, body.class);
                startActivity(intent1);
                finish();

            }
        });

        level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent intent2 = new Intent(level.this, body2.class);
                startActivity(intent2);
               finish();

            }
        });

        level3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent3 = new Intent(level.this , body3.class);
                startActivity(intent3);
                finish();

            }
        });

       /* level4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent3 = new Intent(level.this , body4.class);
                startActivity(intent3);
                finish();

            }
        });  */


        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent3 = new Intent(level.this , MainActivity.class);
                startActivity(intent3);
                finish();

            }
        });


    }
}