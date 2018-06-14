package com.pallavichaturvedi.quiz1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView tv_result;
        tv_result = (TextView)findViewById(R.id.tv_result);
        int score=getIntent().getIntExtra("right answers",0);
        tv_result.setText(score);

    }
}
