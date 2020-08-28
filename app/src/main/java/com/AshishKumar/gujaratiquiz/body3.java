package com.AshishKumar.gujaratiquiz;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class body3 extends AppCompatActivity {

    private TextView tvQueCounter , tvTimer , Score , t1 ;
    private Button btOpt1 , btOpt2 , btOpt3 , btOpt4 , backm;
    private int counter , sc ;
    private CountDownTimer tm;
    private Boolean find = false;
    private ImageView tvQue;

    private ArrayList<QuestionClass3> queList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body3);

        tvQue = (ImageView) findViewById(R.id.tvQue);
        tvQueCounter = (TextView) findViewById(R.id.tvQueCounter);
        tvTimer = (TextView) findViewById(R.id.tvTimer);
        Score = (TextView) findViewById(R.id.Score);
        t1 = (TextView) findViewById(R.id.t1);

        btOpt1 = (Button) findViewById(R.id.btOpt1);
        btOpt2 = (Button) findViewById(R.id.btOpt2);
        btOpt3 = (Button) findViewById(R.id.btOpt3);
        btOpt4 = (Button) findViewById(R.id.btOpt4);
        backm = (Button) findViewById(R.id.backm);

        backm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent home = new Intent(body3.this , MainActivity.class);
                startActivity(home);
                finish();

            }
        });

        int b0 = R.drawable.b0;
        int b1 = R.drawable.b1;
        int b2 = R.drawable.b2;
        int b3 = R.drawable.b3;
        int b4 = R.drawable.b4;
        int b5 = R.drawable.b5;

        int b6 = R.drawable.b6;
        int b7 = R.drawable.b7;
        int b8 = R.drawable.b8;
        int b9 = R.drawable.b9;
        int b10 = R.drawable.b10;


        int b11 = R.drawable.b11;
        int b12 = R.drawable.b12;
        int b13 = R.drawable.b13;
        int b14 = R.drawable.b14;
        int b15 = R.drawable.b15;

        int b16 = R.drawable.b16;
        int b17 = R.drawable.b17;
        int b18 = R.drawable.b18;
        int b19 = R.drawable.b19;
        int b20 = R.drawable.b20;

        int b21 = R.drawable.b21;
        int b22 = R.drawable.b22;
        int b23 = R.drawable.b23;
        int b24 = R.drawable.b24;

        Typeface fontg = Typeface.createFromAsset(getAssets(), "fonts/fontg.ttf");

        btOpt1.setTypeface(fontg);
        btOpt2.setTypeface(fontg);
        btOpt3.setTypeface(fontg);
        btOpt4.setTypeface(fontg);


        counter = 0;
        sc=0;

        for(int i: printRandomNumbers(10,25)) {

            switch(i) {
                case 0: queList.add(new QuestionClass3(b1, "ક", "ગ", "ઙ", "જ", "ક"));
                    break;

                case 1: queList.add(new QuestionClass3(b1, "ખ", "ઞ", "ચ", "જ", "ખ"));
                    break;

                case 2:    queList.add(new QuestionClass3(b2, "ચ", "ખ", "ગ", "ળ", "ગ"));
                    break;

                case 3:    queList.add(new QuestionClass3(b3, "ગ", "ક્ષ", "થ", "ઘ", "ઘ"));
                    break;

                case 4:    queList.add(new QuestionClass3(b4, "ક", "ઙ", "ખ", "ળ", "ઙ"));
                    break;

                case 5:   queList.add(new QuestionClass3(b5, "ઘ", "છ", "ચ", "ગ", "ચ"));
                    break;

                case 6:   queList.add(new QuestionClass3(b6, "છ", "જ", "ક્ષ", "ઙ", "છ"));
                    break;

                case 7:   queList.add(new QuestionClass3(b7, "ઝ", "ઞ", "ઠ", "જ", "જ"));
                    break;

                case 8:   queList.add(new QuestionClass3(b8, "ઝ", "ઞ", "દ", "ઙ", "ઝ"));
                    break;

                case 9:   queList.add(new QuestionClass3(b9, "ઞ", "ઝ", "ઠ", "ટ", "ઞ"));
                    break;

                case 10:  queList.add(new QuestionClass3(b10, "ઞ", "ટ", "ઠ", "ञ", "ટ"));
                    break;

                case 11: queList.add(new QuestionClass3(b11, "જ", "ણ", "ઠ", "ञ", "ઠ"));
                    break;

                case 12: queList.add(new QuestionClass3(b12, "ડ", "દ", "બ", "ભ", "ડ"));
                    break;

                case 13: queList.add(new QuestionClass3(b13, "ઢ", "ણ", "થ", "ભ", "ઢ"));
                    break;

                case 14: queList.add(new QuestionClass3(b14, "ફ", "ણ", "હ", "ળ", "ણ"));
                    break;

                case 15: queList.add(new QuestionClass3(b15, "ફ", "મ", "પ", "ત", "ત"));
                    break;

                case 16: queList.add(new QuestionClass3(b16, "ઞ", "થ", "મ", "ભ", "થ"));
                    break;

                case 17: queList.add(new QuestionClass3(b17, "દ", "ધ", "થ", "ળ", "દ"));
                    break;

                case 18: queList.add(new QuestionClass3(b18, "બ", "ધ", "થ", "પ", "ધ"));
                    break;

                case 19: queList.add(new QuestionClass3(b19, "ળ", "ફ", "પ", "ન", "ન"));
                    break;

                case 20: queList.add(new QuestionClass3(b20, "ળ", "લ", "ફ", "ષ", "ફ"));
                    break;

                case 21: queList.add(new QuestionClass3(b21, "ળ", "બ", "પ", "અ", "બ"));
                    break;

                case 22: queList.add(new QuestionClass3(b22, "હ", "ષ", "લ", "ભ", "ભ"));
                    break;

                case 23: queList.add(new QuestionClass3(b23, "મ", "ઇ", "લ", "ભ", "મ"));
                    break;

                case 24: queList.add(new QuestionClass3(b24, "ફ", "જ્ઞ", "હ", "ળ", "હ"));
                    break;



            }
        }

        loadQuestions(counter);

        Score.setText(""+sc);
        highcore.scoree = sc;


        tvTimer.setText("20");

        tm=  new CountDownTimer(20*1000 , 1000){

            @Override
            public void onTick(long millisUntilFinished) {
                tvTimer.setText("" + millisUntilFinished / 1000);
            }

            @Override
            public void onFinish() {

                if(counter < (queList.size() - 1))
                {
                    counter++;
                    loadQuestions(counter);

                } else if(counter > (queList.size() - 1)){
                    Toast.makeText(body3.this, "All Questions Over", Toast.LENGTH_SHORT).show();


                } else if(find == false && (counter == (queList.size() - 1)) ){
                    Toast.makeText(body3.this, "All Questions Over", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(body3.this , about.class));
                    finish();

                }

            }
        };
        tm.start();

    }


    //    Random Number
    public static final Random gen = new Random();
    public static int[] printRandomNumbers(int n, int maxRange){

        assert n<= maxRange : "cannot get more unique numbers than the size of the range";

        int[] result = new int[n];
        Set<Integer> used =new HashSet<Integer>();
        for(int i =0 ; i<n; i++){
            int newRandom;
            do{
                newRandom=gen.nextInt(maxRange+1);
            } while(used.contains(newRandom));
            result[i]=newRandom;
            used.add(newRandom);

        }

        return result;
    }

    // Random Number




    public void loadQuestions(int n){

        find = false;

        final QuestionClass3 q = queList.get(n);

        tvQueCounter.setText((n+1) + "/" + queList.size());

        Score.setText("" + sc);
        highcore.scoree = sc;
        //timer
        tvTimer.setText("" + 20);
        if(tm != null)
        {
            tm.start();
        }


        tvQue.setImageResource(q.getQue());


        btOpt1.setText("" + q.getOpt1());
        btOpt2.setText("" + q.getOpt2());
        btOpt3.setText("" + q.getOpt3());
        btOpt4.setText("" + q.getOpt4());

        btOpt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btOpt1.setEnabled(false);
                btOpt2.setEnabled(false);
                btOpt3.setEnabled(false);
                btOpt4.setEnabled(false);

                find = true;

                if(btOpt1.getText().equals(q.getRightopt()))
                {
                    btOpt1.setBackgroundResource(R.color.green);
                    Toast.makeText(body3.this, "Correct Answer", Toast.LENGTH_SHORT).show();

                    sc+= 10;
                    highcore.scoree = sc;

                    if(counter < (queList.size() - 1))
                    {
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                tm.cancel();
                                counter++;
                                loadQuestions(counter);

                                btOpt1.setEnabled(true);
                                btOpt2.setEnabled(true);
                                btOpt3.setEnabled(true);
                                btOpt4.setEnabled(true);

                            }
                        },3000);



                    } else {
                        Toast.makeText(body3.this, "All Questions Over", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(body3.this , about.class));
                        finish();
                    }


                } else {
                    btOpt1.setBackgroundResource(R.color.red);
                    Toast.makeText(body3.this, "Wrong Answer", Toast.LENGTH_SHORT).show();

                    if(btOpt2.getText().equals(q.getRightopt())){
                        btOpt2.setBackgroundResource(R.color.green);
                    } else if(btOpt3.getText().equals(q.getRightopt())){
                        btOpt3.setBackgroundResource(R.color.green);
                    } else if(btOpt4.getText().equals(q.getRightopt())){
                        btOpt4.setBackgroundResource(R.color.green);
                    }

                    //if atlast wrong answer is selected
                    if(counter < (queList.size() - 1))
                    {
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                counter++;
                                loadQuestions(counter);

                                btOpt1.setEnabled(true);
                                btOpt2.setEnabled(true);
                                btOpt3.setEnabled(true);
                                btOpt4.setEnabled(true);

                            }
                        },3000);}

                    else  {
                        Toast.makeText(body3.this, "All Questions Over", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(body3.this , about.class));
                        finish();
                    }

                }

            }
        });

        btOpt1.setEnabled(true);
        btOpt2.setEnabled(true);
        btOpt3.setEnabled(true);
        btOpt4.setEnabled(true);

        btOpt1.setBackgroundResource(R.color.bt);
        btOpt2.setBackgroundResource(R.color.bt);
        btOpt3.setBackgroundResource(R.color.bt);
        btOpt4.setBackgroundResource(R.color.bt);


        btOpt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btOpt1.setEnabled(false);
                btOpt2.setEnabled(false);
                btOpt3.setEnabled(false);
                btOpt4.setEnabled(false);

                find = true;

                if(btOpt2.getText().equals(q.getRightopt()))
                {
                    btOpt2.setBackgroundResource(R.color.green);
                    Toast.makeText(body3.this, "Correct Answer", Toast.LENGTH_SHORT).show();

                    sc+=10;
                    highcore.scoree = sc;

                    if(counter < (queList.size() - 1))
                    {   new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            tm.cancel();
                            counter++;
                            loadQuestions(counter);

                            btOpt1.setEnabled(true);
                            btOpt2.setEnabled(true);
                            btOpt3.setEnabled(true);
                            btOpt4.setEnabled(true);

                        }
                    },3000);


                    } else {
                        Toast.makeText(body3.this, "All Questions Over", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(body3.this , about.class));
                        finish();
                    }

                } else {
                    btOpt2.setBackgroundResource(R.color.red);
                    Toast.makeText(body3.this, "Wrong Answer", Toast.LENGTH_SHORT).show();

                    if(btOpt1.getText().equals(q.getRightopt())){
                        btOpt1.setBackgroundResource(R.color.green);
                    } else if(btOpt3.getText().equals(q.getRightopt())){
                        btOpt3.setBackgroundResource(R.color.green);
                    } else if(btOpt4.getText().equals(q.getRightopt())){
                        btOpt4.setBackgroundResource(R.color.green);
                    }

                    //if atlast wrong answer is selected
                    if(counter < (queList.size() - 1))
                    {new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            counter++;
                            loadQuestions(counter);

                            btOpt1.setEnabled(true);
                            btOpt2.setEnabled(true);
                            btOpt3.setEnabled(true);
                            btOpt4.setEnabled(true);

                        }
                    },3000);  }

                    else{
                        Toast.makeText(body3.this, "All Questions Over", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(body3.this , about.class));
                        finish();
                    }
                }

            }
        });

        btOpt1.setEnabled(true);
        btOpt2.setEnabled(true);
        btOpt3.setEnabled(true);
        btOpt4.setEnabled(true);

        btOpt1.setBackgroundResource(R.color.bt);
        btOpt2.setBackgroundResource(R.color.bt);
        btOpt3.setBackgroundResource(R.color.bt);
        btOpt4.setBackgroundResource(R.color.bt);

        btOpt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btOpt1.setEnabled(false);
                btOpt2.setEnabled(false);
                btOpt3.setEnabled(false);
                btOpt4.setEnabled(false);

                find = true;

                if(btOpt3.getText().equals(q.getRightopt()))
                {
                    btOpt3.setBackgroundResource(R.color.green);
                    Toast.makeText(body3.this, "Correct Answer", Toast.LENGTH_SHORT).show();

                    sc +=10;
                    highcore.scoree = sc;

                    if(counter < (queList.size() - 1))
                    {   new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            tm.cancel();
                            counter++;
                            loadQuestions(counter);

                            btOpt1.setEnabled(true);
                            btOpt2.setEnabled(true);
                            btOpt3.setEnabled(true);
                            btOpt4.setEnabled(true);

                        }
                    },3000);

                    } else {
                        Toast.makeText(body3.this, "All Questions Over", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(body3.this , about.class));
                        finish();
                    }

                } else {
                    btOpt3.setBackgroundResource(R.color.red);
                    Toast.makeText(body3.this, "Wrong Answer", Toast.LENGTH_SHORT).show();

                    if(btOpt1.getText().equals(q.getRightopt())){
                        btOpt1.setBackgroundResource(R.color.green);
                    } else if(btOpt2.getText().equals(q.getRightopt())){
                        btOpt2.setBackgroundResource(R.color.green);
                    } else if(btOpt4.getText().equals(q.getRightopt())){
                        btOpt4.setBackgroundResource(R.color.green);
                    }

                    //if atlast wrong answer is selected
                    if(counter < (queList.size() - 1))
                    {
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                counter++;
                                loadQuestions(counter);

                                btOpt1.setEnabled(true);
                                btOpt2.setEnabled(true);
                                btOpt3.setEnabled(true);
                                btOpt4.setEnabled(true);

                            }
                        },3000);
                    }
                    else{
                        Toast.makeText(body3.this, "All Questions Over", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(body3.this , about.class));
                        finish();
                    }
                }

            }
        });

        btOpt1.setEnabled(true);
        btOpt2.setEnabled(true);
        btOpt3.setEnabled(true);
        btOpt4.setEnabled(true);

        btOpt1.setBackgroundResource(R.color.bt);
        btOpt2.setBackgroundResource(R.color.bt);
        btOpt3.setBackgroundResource(R.color.bt);
        btOpt4.setBackgroundResource(R.color.bt);

        btOpt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btOpt1.setEnabled(false);
                btOpt2.setEnabled(false);
                btOpt3.setEnabled(false);
                btOpt4.setEnabled(false);

                find = true;

                if(btOpt4.getText().equals(q.getRightopt()))
                {
                    btOpt4.setBackgroundResource(R.color.green);
                    Toast.makeText(body3.this, "Correct Answer", Toast.LENGTH_SHORT).show();

                    sc+=10;
                    highcore.scoree = sc;

                    if(counter < (queList.size() - 1))
                    {   new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            tm.cancel();
                            counter++;
                            loadQuestions(counter);

                            btOpt1.setEnabled(true);
                            btOpt2.setEnabled(true);
                            btOpt3.setEnabled(true);
                            btOpt4.setEnabled(true);

                        }
                    },3000);

                    } else {
                        Toast.makeText(body3.this, "All Questions Over", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(body3.this , about.class));
                        finish();
                    }

                } else {

                    btOpt4.setBackgroundResource(R.color.red);
                    Toast.makeText(body3.this, "Wrong Answer", Toast.LENGTH_SHORT).show();

                    if(btOpt1.getText().equals(q.getRightopt())){
                        btOpt1.setBackgroundResource(R.color.green);
                    } else if(btOpt2.getText().equals(q.getRightopt())){
                        btOpt2.setBackgroundResource(R.color.green);
                    } else if(btOpt3.getText().equals(q.getRightopt())){
                        btOpt3.setBackgroundResource(R.color.green);
                    }

                    //if atlast wrong answer is selected
                    if(counter < (queList.size() - 1))
                    {
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                counter++;
                                loadQuestions(counter);

                                btOpt1.setEnabled(true);
                                btOpt2.setEnabled(true);
                                btOpt3.setEnabled(true);
                                btOpt4.setEnabled(true);

                            }
                        },3000);
                    }
                    else{
                        Toast.makeText(body3.this, "All Questions Over", Toast.LENGTH_SHORT).show();

                        startActivity(new Intent(body3.this , about.class));
                        finish();
                    }
                }

            }
        });

        btOpt1.setEnabled(true);
        btOpt2.setEnabled(true);
        btOpt3.setEnabled(true);
        btOpt4.setEnabled(true);

        btOpt1.setBackgroundResource(R.color.bt);
        btOpt2.setBackgroundResource(R.color.bt);
        btOpt3.setBackgroundResource(R.color.bt);
        btOpt4.setBackgroundResource(R.color.bt);


    }



}