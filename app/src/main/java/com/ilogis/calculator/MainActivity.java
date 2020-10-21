package com.ilogis.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView viewfinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewfinder = findViewById(R.id.viewfinder);
    }

    public void setTextOnView(View v) {
        switch (v.getId()) {
            case R.id.zero_bt:
                viewfinder.setText(viewfinder.getText() + "0"); //R.string.zero;
                break;
            case R.id.one_bt:
                viewfinder.setText(viewfinder.getText() + "1"); //R.string.zero;
                break;
            case R.id.two_bt:
                viewfinder.setText(viewfinder.getText() + "2"); //R.string.zero;
                break;
            case R.id.three_bt:
                viewfinder.setText(viewfinder.getText() + "3"); //R.string.zero;
                break;
            case R.id.four_bt:
                viewfinder.setText(viewfinder.getText() + "4"); //R.string.zero;
                break;
            case R.id.five_bt:
                viewfinder.setText(viewfinder.getText() + "5"); //R.string.zero;
                break;
            case R.id.six_bt:
                viewfinder.setText(viewfinder.getText() + "6"); //R.string.zero;
                break;
            case R.id.seven_bt:
                viewfinder.setText(viewfinder.getText() + "7"); //R.string.zero;
                break;
            case R.id.eight_bt:
                viewfinder.setText(viewfinder.getText() + "8"); //R.string.zero;
                break;
            case R.id.nine_bt:
                viewfinder.setText(viewfinder.getText() + "9"); //R.string.zero;
                break;
            case R.id.clean_bt:
                viewfinder.setText("");//R.string.zero;
                break;
        }
    }
}