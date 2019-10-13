package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   
    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button equal;
    private TextView oper;
    private TextView result;
    private final char ADD = '+';
    private final char SUB = '-';
    private final char MUL = '*';
    private final char DIV = '/';
    private final char EQU = '0';
    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UiViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper.setText(oper.getText().toString() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper.setText(oper.getText().toString() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper.setText(oper.getText().toString() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper.setText(oper.getText().toString() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper.setText(oper.getText().toString() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper.setText(oper.getText().toString() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper.setText(oper.getText().toString() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper.setText(oper.getText().toString() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper.setText(oper.getText().toString() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper.setText(oper.getText().toString() + "9");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = ADD;
                result.setText(String.valueOf(val1 + "+"));
                oper.setText(null);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = SUB;
                result.setText(String.valueOf(val1 + "-"));
                oper.setText(null);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = MUL;
                result.setText(String.valueOf(val1 + "*"));
                oper.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = DIV;
                result.setText(String.valueOf(val1 + "/"));
                oper.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = EQU;
                result.setText(result.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
                oper.setText(null);
            }
        });
    }

    private void UiViews(){
        zero = (Button)findViewById(R.id.button11);
        one = (Button)findViewById(R.id.button8);
        two = (Button)findViewById(R.id.button9);
        three = (Button)findViewById(R.id.button10);
        four = (Button)findViewById(R.id.button5);
        five = (Button)findViewById(R.id.button6);
        six = (Button)findViewById(R.id.button7);
        seven = (Button)findViewById(R.id.button2);
        eight = (Button)findViewById(R.id.button3);
        nine = (Button)findViewById(R.id.button4);
        add = (Button)findViewById(R.id.button14);
        sub = (Button)findViewById(R.id.button15);
        mul = (Button)findViewById(R.id.button16);
        div = (Button)findViewById(R.id.button17);
        equal = (Button)findViewById(R.id.button13);
        oper = (TextView) findViewById(R.id.textView2);
        result = (TextView) findViewById(R.id.textView3);
    }

    private void compute(){
        if(!Double.isNaN((val1))){
            val2 = Double.parseDouble(oper.getText().toString());

            switch (ACTION){
                case ADD:
                    val1 = val1 + val2;
                    break;
                case SUB:
                    val1 = val1 - val2;
                    break;
                case MUL:
                    val1 = val1 * val2;
                    break;
                case DIV:
                    val1 = val1/val2;
                    break;
                case EQU:
                    break;

            }
        }
        else{
            val1 = Double.parseDouble(oper.getText().toString());

        }
    }
}
