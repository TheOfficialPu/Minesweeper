package com.example.android.exp1;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.ParcelUuid;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        {
            Button b = (Button) findViewById(R.id.button3);
            b.setText("B");
            b = (Button) findViewById(R.id.button2);
            b.setText("1");
            b = (Button) findViewById(R.id.button4);
            b.setText("1");

            b = (Button) findViewById(R.id.button7);
            b.setText("1");
            b = (Button) findViewById(R.id.button8);
            b.setText("1");
            b = (Button) findViewById(R.id.button12);
            b.setText("2");
            b = (Button) findViewById(R.id.button13);
            b.setText("1");
            b = (Button) findViewById(R.id.button14);
            b.setText("1");


            b = (Button) findViewById(R.id.button18);
            b.setText("B");

            b = (Button) findViewById(R.id.button17);
            b.setText("1");
            b = (Button) findViewById(R.id.button27);
            b.setText("1");
            b = (Button) findViewById(R.id.button28);
            b.setText("1");

            b = (Button) findViewById(R.id.button21);
            b.setText("B");
            b = (Button) findViewById(R.id.button11);
            b.setText("1");
            b = (Button) findViewById(R.id.button22);
            b.setText("1");
            b = (Button) findViewById(R.id.button32);
            b.setText("1");
            b = (Button) findViewById(R.id.button31);
            b.setText("1");

            b = (Button) findViewById(R.id.button44);
            b.setText("B");
            b = (Button) findViewById(R.id.button43);
            b.setText("1");
            b = (Button) findViewById(R.id.button33);
            b.setText("1");
            b = (Button) findViewById(R.id.button34);
            b.setText("1");
            b = (Button) findViewById(R.id.button35);
            b.setText("1");
            b = (Button) findViewById(R.id.button45);
            b.setText("1");


        }
    }


    public void bmb(View v) {
        Button b = (Button) v;
        String txt = "GAME OVER";
        TextView quantityTextView = (TextView) findViewById(
                R.id.textView);
        quantityTextView.setText("0");

        b.setTextColor(R.color.colorAccent);
        if (b.getText() == "B")
            quantityTextView.setText(txt);


    }
}
