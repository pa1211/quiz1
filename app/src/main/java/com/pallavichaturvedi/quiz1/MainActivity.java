package com.pallavichaturvedi.quiz1;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button b_answer1,b_answer2,b_answer3,b_answer4;
    ImageView iv_flag;
    List<StateModel> list;
    Random r;
    int turn=1;
    int rightAnswers=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r= new Random();
        iv_flag=(ImageView)(findViewById(R.id.iv_flag));
        b_answer1=(Button)(findViewById(R.id.b_answer1));
        b_answer2=(Button)(findViewById(R.id.b_answer2));
        b_answer3=(Button)(findViewById(R.id.b_answer3));
        b_answer4=(Button)(findViewById(R.id.b_answer4));

        list= new ArrayList<>();

        for (int i=0;i < new Database().answers.length;i++){
            list.add(new StateModel(new Database().answers[i], new Database().colorpic[i]));}
        Collections.shuffle(list);
        newQuestion(turn);
        b_answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b_answer1.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())) {
                    //Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_LONG).show();
                    Toast toast=new Toast(getApplicationContext());
                    toast.setGravity(Gravity.CENTER,0,0);
                    TextView tv=new TextView(MainActivity.this);
                    tv.setBackgroundColor(Color.GREEN);
                    tv.setTextColor(Color.WHITE);
                    tv.setTextSize(36);
                    Typeface t=Typeface.create("serif",Typeface.BOLD);
                    tv.setTypeface(t);
                    tv.setPadding(40,40,40,40);
                    tv.setText("Correct!");
                    toast.setView(tv);
                    toast.show();
                    if (turn < list.size()) {
                        turn++;
                        newQuestion(turn);
                    } else {
                        Toast.makeText(MainActivity.this, "You finished the quiz", Toast.LENGTH_LONG).show();
                       
                    }
                } else {
                    //Toast.makeText(MainActivity.this, "Incorrect", Toast.LENGTH_LONG).show();
                    Toast toast=new Toast(getApplicationContext());
                    toast.setGravity(Gravity.CENTER,0,0);
                    TextView tv=new TextView(MainActivity.this);
                    tv.setBackgroundColor(Color.RED);
                    tv.setTextColor(Color.WHITE);
                    tv.setTextSize(36);
                    Typeface t=Typeface.create("serif",Typeface.BOLD);
                    tv.setTypeface(t);
                    tv.setPadding(40,40,40,40);
                    tv.setText("Incorrect");
                    toast.setView(tv);
                    toast.show();
                    if (turn<list.size()){
                        turn++;
                        newQuestion(turn);
                    }else {
                        Toast.makeText(MainActivity.this,"You finished the quiz",Toast.LENGTH_LONG).show();
                                

                    }
                }

            }
        });
        b_answer2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (b_answer2.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())) {
                   // Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_LONG).show();
                    Toast toast=new Toast(getApplicationContext());
                    toast.setGravity(Gravity.CENTER,0,0);
                    TextView tv=new TextView(MainActivity.this);
                    tv.setBackgroundColor(Color.GREEN);
                    tv.setTextColor(Color.WHITE);
                    tv.setTextSize(36);
                    Typeface t=Typeface.create("serif",Typeface.BOLD);
                    tv.setTypeface(t);
                    tv.setPadding(40,40,40,40);
                    tv.setText("Correct!");
                    toast.setView(tv);
                    toast.show();
                    if (turn < list.size()) {
                        turn++;
                        newQuestion(turn);
                    } else {
                        Toast.makeText(MainActivity.this, "You finished the quiz", Toast.LENGTH_LONG).show();
                        
                    }
                } else {
                   // Toast.makeText(MainActivity.this, "Incorrect", Toast.LENGTH_LONG).show();
                    Toast toast=new Toast(getApplicationContext());
                    toast.setGravity(Gravity.CENTER,0,0);
                    TextView tv=new TextView(MainActivity.this);
                    tv.setBackgroundColor(Color.RED);
                    tv.setTextColor(Color.WHITE);
                    tv.setTextSize(36);
                    Typeface t=Typeface.create("serif",Typeface.BOLD);
                    tv.setTypeface(t);
                    tv.setPadding(40,40,40,40);
                    tv.setText("Incorrect");
                    toast.setView(tv);
                    toast.show();
                    if (turn<list.size()){
                        turn++;
                        newQuestion(turn);
                    }else {
                        Toast.makeText(MainActivity.this,"You finished the quiz",Toast.LENGTH_LONG).show();
                       
                    }
                }

            }
        });
        b_answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b_answer3.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())) {
                    //Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_LONG).show();
                    Toast toast=new Toast(getApplicationContext());
                    toast.setGravity(Gravity.CENTER,0,0);
                    TextView tv=new TextView(MainActivity.this);
                    tv.setBackgroundColor(Color.GREEN);
                    tv.setTextColor(Color.WHITE);
                    tv.setTextSize(36);
                    Typeface t=Typeface.create("serif",Typeface.BOLD);
                    tv.setTypeface(t);
                    tv.setPadding(40,40,40,40);
                    tv.setText("Correct!");
                    toast.setView(tv);
                    toast.show();
                    if (turn < list.size()) {
                        turn++;
                        newQuestion(turn);
                    } else {
                        Toast.makeText(MainActivity.this, "You finished the quiz", Toast.LENGTH_LONG).show();
                        
                    }
                } else {
                    //Toast.makeText(MainActivity.this, "Incorrect", Toast.LENGTH_LONG).show();
                    Toast toast=new Toast(getApplicationContext());
                    toast.setGravity(Gravity.CENTER,0,0);
                    TextView tv=new TextView(MainActivity.this);
                    tv.setBackgroundColor(Color.RED);
                    tv.setTextColor(Color.WHITE);
                    tv.setTextSize(36);
                    Typeface t=Typeface.create("serif",Typeface.BOLD);
                    tv.setTypeface(t);
                    tv.setPadding(40,40,40,40);
                    tv.setText("Incorrect!");
                    toast.setView(tv);
                    toast.show();
                    if (turn<list.size()){
                        turn++;
                        newQuestion(turn);
                    }else {
                        Toast.makeText(MainActivity.this,"You finished the quiz",Toast.LENGTH_LONG).show();
                        
                    }
                }

            }
        });
        b_answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b_answer4.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())) {
                    //Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_LONG).show();
                    Toast toast=new Toast(getApplicationContext());
                    toast.setGravity(Gravity.CENTER,0,0);
                    TextView tv=new TextView(MainActivity.this);
                    tv.setBackgroundColor(Color.GREEN);
                    tv.setTextColor(Color.WHITE);
                    tv.setTextSize(36);
                    Typeface t=Typeface.create("serif",Typeface.BOLD);
                    tv.setTypeface(t);
                    tv.setPadding(40,40,40,40);
                    tv.setText("Correct!");
                    toast.setView(tv);
                    toast.show();
                    if (turn < list.size()) {
                        turn++;
                        newQuestion(turn);
                    } else {
                        Toast.makeText(MainActivity.this, "You finished the quiz", Toast.LENGTH_LONG).show();
                        
                    }
                } else {
                    //Toast.makeText(MainActivity.this, "Incorrect", Toast.LENGTH_LONG).show();
                    Toast toast=new Toast(getApplicationContext());
                    toast.setGravity(Gravity.CENTER,0,0);
                    TextView tv=new TextView(MainActivity.this);
                    tv.setBackgroundColor(Color.RED);
                    tv.setTextColor(Color.WHITE);
                    tv.setTextSize(36);
                    Typeface t=Typeface.create("serif",Typeface.BOLD);
                    tv.setTypeface(t);
                    tv.setPadding(40,40,40,40);
                    tv.setText("Incorrect!");
                    toast.setView(tv);
                    toast.show();
                    if (turn<list.size()){
                        turn++;
                        newQuestion(turn);
                    }else {
                        Toast.makeText(MainActivity.this,"You finished the quiz",Toast.LENGTH_LONG).show();
                        
                    }
                }

            }
        });
    }
    private void newQuestion(int number){
        iv_flag.setImageResource(list.get(number -1).getImage());
        int correct_answer=r.nextInt(4)+1;
        int firstbutton=number-1;
        int secondbutton;
        int thirdbutton;
        int fourthbutton;
        switch (correct_answer){
            case 1:
                b_answer1.setText(list.get(firstbutton).getName());
                do {
                    secondbutton=r.nextInt(list.size());
                }while (secondbutton==firstbutton);
                do {
                    thirdbutton=r.nextInt(list.size());
                }while (thirdbutton==firstbutton ||thirdbutton==secondbutton);
                do {
                    fourthbutton=r.nextInt(list.size());
                }while (fourthbutton==firstbutton ||fourthbutton==secondbutton||fourthbutton==thirdbutton);

                b_answer2.setText(list.get(secondbutton).getName());
                b_answer3.setText(list.get(thirdbutton).getName());
                b_answer4.setText(list.get(fourthbutton).getName());
                break;
            case 2:
                b_answer2.setText(list.get(firstbutton).getName());
                do {
                    secondbutton=r.nextInt(list.size());
                }while (secondbutton==firstbutton);
                do {
                    thirdbutton=r.nextInt(list.size());
                }while (thirdbutton==firstbutton ||thirdbutton==secondbutton);
                do {
                    fourthbutton=r.nextInt(list.size());
                }while (fourthbutton==firstbutton ||fourthbutton==secondbutton||fourthbutton==thirdbutton);

                b_answer1.setText(list.get(secondbutton).getName());
                b_answer3.setText(list.get(thirdbutton).getName());
                b_answer4.setText(list.get(fourthbutton).getName());
                break;
            case 3:
                b_answer3.setText(list.get(firstbutton).getName());
                do {
                    secondbutton=r.nextInt(list.size());
                }while (secondbutton==firstbutton);
                do {
                    thirdbutton=r.nextInt(list.size());
                }while (thirdbutton==firstbutton ||thirdbutton==secondbutton);
                do {
                    fourthbutton=r.nextInt(list.size());
                }while (fourthbutton==firstbutton ||fourthbutton==secondbutton||fourthbutton==thirdbutton);

                b_answer2.setText(list.get(secondbutton).getName());
                b_answer1.setText(list.get(thirdbutton).getName());
                b_answer4.setText(list.get(fourthbutton).getName());
                break;
            case 4:
                b_answer4.setText(list.get(firstbutton).getName());
                do {
                    secondbutton=r.nextInt(list.size());
                }while (secondbutton==firstbutton);
                do {
                    thirdbutton=r.nextInt(list.size());
                }while (thirdbutton==firstbutton ||thirdbutton==secondbutton);
                do {
                    fourthbutton=r.nextInt(list.size());
                }while (fourthbutton==firstbutton ||fourthbutton==secondbutton||fourthbutton==thirdbutton);

                b_answer2.setText(list.get(secondbutton).getName());
                b_answer3.setText(list.get(thirdbutton).getName());
                b_answer1.setText(list.get(fourthbutton).getName());
                break;
        }
    }
    

}




