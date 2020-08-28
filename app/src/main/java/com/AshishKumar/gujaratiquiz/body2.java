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

public class body2 extends AppCompatActivity {

    private TextView tvQueCounter , tvTimer  , Score , t1 ;
    private Button btOpt1 , btOpt2 , btOpt3 , btOpt4 , backm;
    private int counter , sc ;
    private CountDownTimer tm;
    private Boolean find = false;
    private ImageView tvQue;

    private ArrayList<QuestionClass2> queList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body2);

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

                Intent home = new Intent(body2.this , MainActivity.class);
                startActivity(home);
                finish();

            }
        });

        //images

        int a1 = R.drawable.a1;
        int a2 = R.drawable.a2;
        int a3 = R.drawable.a3;
        int a4 = R.drawable.a4;
        int a5 = R.drawable.a5;

        int a6 = R.drawable.a6;
        int a7 = R.drawable.a7;
        int a8 = R.drawable.a8;
        int a9 = R.drawable.a9;
        int a10 = R.drawable.a10;


        int a11 = R.drawable.a11;
        int a12 = R.drawable.a12;
        int a13 = R.drawable.a13;
        int a14 = R.drawable.a14;
        int a15 = R.drawable.a15;

        int a16 = R.drawable.a16;
        int a17 = R.drawable.a17;
        int a18 = R.drawable.a18;
        int a19 = R.drawable.a19;
        int a20 = R.drawable.a20;

        int a21 = R.drawable.a21;
        int a22 = R.drawable.a22;
        int a23 = R.drawable.a23;
        int a24 = R.drawable.a24;
        int a0 = R.drawable.a0;



        Typeface fontg = Typeface.createFromAsset(getAssets(), "fonts/fontg.ttf");

        btOpt1.setTypeface(fontg);
        btOpt2.setTypeface(fontg);
        btOpt3.setTypeface(fontg);
        btOpt4.setTypeface(fontg);

        counter = 0;
        sc=0;

        for(int i: printRandomNumbers2(10,25)) {

            switch(i) {
                case 0: queList.add(new QuestionClass2(a1, "શ્રેષ્ઠ", "સાથે", "સન્થ", "દક્ષિણ", "સાથે"));
                    break;

                case 1: queList.add(new QuestionClass2(a2, "સમય", "સંતુલન", "સામાય", "ચહેરો", "સમય"));
                    break;

                case 2:    queList.add(new QuestionClass2(a3, "દરેક", "ઉમેદવાર", "પ્રત્યક", "શ્રેષ્ઠ", "દરેક"));
                    break;

                case 3:    queList.add(new QuestionClass2(a4, "પ્રક્રિયા", "પ્રકાશન", "પાર્ક", "પ્રકાશ", "પ્રકાશ"));
                    break;

                case 4:    queList.add(new QuestionClass2(a5, "ડોનીયા", "દુનિયા", "ડબલ", "દુનાયા", "દુનિયા"));
                    break;

                case 5:   queList.add(new QuestionClass2(a6, "તાસવીરા", "તિસ્વીરા", "તાસવીર", "તસ્વીરમ", "તાસવીર"));
                    break;

                case 6:   queList.add(new QuestionClass2(a7, "નિર્મિત", "નર્મિતા", "નિર્મિતા", "નિસમિટ", "નિર્મિત"));
                    break;

                case 7:   queList.add(new QuestionClass2(a8, "માહને", "મિહન", "મહાનમ", "મહાન", "મહાન"));
                    break;

                case 8:   queList.add(new QuestionClass2(a9, "કારણ", "કરણ", "કરને", "કરનામ", "કારણ"));
                    break;

                case 9:   queList.add(new QuestionClass2(a10, "અપડેગા", "ઉપયોગ", "ઉપાય", "ઉપયોગી", "ઉપયોગ"));
                    break;

                case 10:  queList.add(new QuestionClass2(a11, "લખવુ", "લિખનામ", "લિખના", "લિખ્ની", "લિખના"));
                    break;

                case 11: queList.add(new QuestionClass2(a12, "અધિકાર", "અધકમ્", "અધિકા", "આદિક", "આદિક"));
                    break;

                case 12: queList.add(new QuestionClass2(a13, "સાંખ્ય", "સાંખ્યઆ", "સાંખ્યમ", "સાંખ્યને", "સાંખ્ય"));
                    break;

                case 13: queList.add(new QuestionClass2(a14, "જાવબે", "જવાબ", "જડબાના", "જવાન", "જવાબ"));
                    break;

                case 14: queList.add(new QuestionClass2(a15, "સકોલ", "સ્કૂઓલ", "સાકોલામ", "સ્કૂલ", "સ્કૂલ"));
                    break;

                case 15: queList.add(new QuestionClass2(a16, "ભુજનમ્", "ભુજન", "ભોજન", "ભુજની", "ભોજન"));
                    break;

                case 16: queList.add(new QuestionClass2(a17, "કહમી", "કહન", "કહાની", "કહાનીમ", "કહાની"));
                    break;

                case 17: queList.add(new QuestionClass2(a18, "સમુદ્ર", "સમુદ્ર્રી", "સમુંદ્રે", "સમુદ્રમ", "સમુદ્ર"));
                    break;

                case 18: queList.add(new QuestionClass2(a19, "જીવને", "જીવાણી", "જીવન", "જીવનામ", "જીવન"));
                    break;

                case 19: queList.add(new QuestionClass2(a20, "કીતાબ", "કીતાબી", "કીતાબમ", "કીતાબો", "કીતાબ"));
                    break;

                case 20: queList.add(new QuestionClass2(a21, "વિજ્યામ", "વિગ્નામ", "વિગમ", "વિજ્ઞાન", "વિજ્ઞાન"));
                    break;

                case 21: queList.add(new QuestionClass2(a22, "ઉદાહરણો", "ઉધારનામ", "ઉધારન", "ઉધારને", "ઉદાહરણો"));
                    break;

                case 22: queList.add(new QuestionClass2(a23, "દેખભલે", "દેખભલમ", "દેખભલે", "દેખભાલ", "દેખભાલ"));
                    break;

                case 23: queList.add(new QuestionClass2(a24, "પેરિવર", "પરીવાર", "પરિવરમ", "પરિવરે", "પરીવાર"));
                    break;

                case 24: queList.add(new QuestionClass2(a0, "સમાસી", "સમાસ્યત", "સમસ્યા", "સમાસ્ય", "સમસ્યા"));
                    break;
                    


            }
        }

        loadQuestions(counter);

        Score.setText(""+sc);
        highcore.scoree = sc;


        tvTimer.setText("30");

        tm=  new CountDownTimer(30*1000 , 1000){

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
                    Toast.makeText(body2.this, "All Questions Over", Toast.LENGTH_SHORT).show();


                } else if(find == false && (counter == (queList.size() - 1)) ){
                    Toast.makeText(body2.this, "All Questions Over", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(body2.this , about.class));
                    finish();

                }

            }
        };
        tm.start();

    }



    //    Random Number
    public static final Random gen2 = new Random();
    public static int[] printRandomNumbers2(int n, int maxRange2){

        assert n<= maxRange2 : "cannot get more unique numbers than the size of the range";

        int[] result = new int[n];
        Set<Integer> used =new HashSet<Integer>();
        for(int i =0 ; i<n; i++){
            int newRandom;
            do{
                newRandom=gen2.nextInt(maxRange2+1);
            } while(used.contains(newRandom));
            result[i]=newRandom;
            used.add(newRandom);

        }

        return result;
    }

    // Random Number

    public void loadQuestions(int n){

        find = false;

        final QuestionClass2 q = queList.get(n);

        tvQueCounter.setText((n+1) + "/" + queList.size());

        Score.setText("" + sc);
        highcore.scoree = sc;
        //timer
        tvTimer.setText("" + 30);
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
                    Toast.makeText(body2.this, "Correct Answer", Toast.LENGTH_SHORT).show();

                    sc+= 10;
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
                        Toast.makeText(body2.this, "All Questions Over", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(body2.this , about.class));
                        finish();
                    }


                } else {
                    btOpt1.setBackgroundResource(R.color.red);
                    Toast.makeText(body2.this, "Wrong Answer", Toast.LENGTH_SHORT).show();

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
                        },3000);
                    }

                    else{
                        Toast.makeText(body2.this, "All Questions Over", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(body2.this , about.class));
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
                    Toast.makeText(body2.this, "Correct Answer", Toast.LENGTH_SHORT).show();

                    sc+=10;
                    highcore.scoree = sc;

                    if(counter < (queList.size() - 1))
                    {  new Handler().postDelayed(new Runnable() {
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
                        Toast.makeText(body2.this, "All Questions Over", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(body2.this , about.class));
                        finish();
                    }

                } else {
                    btOpt2.setBackgroundResource(R.color.red);
                    Toast.makeText(body2.this, "Wrong Answer", Toast.LENGTH_SHORT).show();

                    if(btOpt1.getText().equals(q.getRightopt())){
                        btOpt1.setBackgroundResource(R.color.green);
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
                        },3000);
                    }
                    else{
                        Toast.makeText(body2.this, "All Questions Over", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(body2.this , about.class));
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
                    Toast.makeText(body2.this, "Correct Answer", Toast.LENGTH_SHORT).show();

                    sc +=10;
                    highcore.scoree = sc;

                    if(counter < (queList.size() - 1))
                    {  new Handler().postDelayed(new Runnable() {
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
                        Toast.makeText(body2.this, "All Questions Over", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(body2.this , about.class));
                        finish();
                    }

                } else {
                    btOpt3.setBackgroundResource(R.color.red);
                    Toast.makeText(body2.this, "Wrong Answer", Toast.LENGTH_SHORT).show();

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
                        Toast.makeText(body2.this, "All Questions Over", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(body2.this , about.class));
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
                    Toast.makeText(body2.this, "Correct Answer", Toast.LENGTH_SHORT).show();

                    sc+=10;
                    highcore.scoree = sc;

                    if(counter < (queList.size() - 1))
                    {  new Handler().postDelayed(new Runnable() {
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
                        Toast.makeText(body2.this, "All Questions Over", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(body2.this , about.class));
                        finish();
                    }

                } else {

                    btOpt4.setBackgroundResource(R.color.red);
                    Toast.makeText(body2.this, "Wrong Answer", Toast.LENGTH_SHORT).show();

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
                        Toast.makeText(body2.this, "All Questions Over", Toast.LENGTH_SHORT).show();

                        startActivity(new Intent(body2.this , about.class));
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