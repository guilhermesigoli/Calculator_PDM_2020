package com.ilogis.calculator;
import org.mariuszgromada.math.mxparser.*;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
                viewfinder.setText(viewfinder.getText() + "0");
                break;
            case R.id.one_bt:
                viewfinder.setText(viewfinder.getText() + "1");
                break;
            case R.id.two_bt:
                viewfinder.setText(viewfinder.getText() + "2");
                break;
            case R.id.three_bt:
                viewfinder.setText(viewfinder.getText() + "3");
                break;
            case R.id.four_bt:
                viewfinder.setText(viewfinder.getText() + "4");
                break;
            case R.id.five_bt:
                viewfinder.setText(viewfinder.getText() + "5");
                break;
            case R.id.six_bt:
                viewfinder.setText(viewfinder.getText() + "6");
                break;
            case R.id.seven_bt:
                viewfinder.setText(viewfinder.getText() + "7");
                break;
            case R.id.eight_bt:
                viewfinder.setText(viewfinder.getText() + "8");
                break;
            case R.id.nine_bt:
                viewfinder.setText(viewfinder.getText() + "9");
                break;
            case R.id.sum_bt:
                viewfinder.setText(viewfinder.getText() + "+");
                break;
            case R.id.sub_bt:
                viewfinder.setText(viewfinder.getText() + "-");
                break;
            case R.id.mult_bt:
                viewfinder.setText(viewfinder.getText() + "x");
                break;
            case R.id.div_bt:
                viewfinder.setText(viewfinder.getText() + "/");
                break;
            case R.id.dot_bt:
                viewfinder.setText(viewfinder.getText() + ".");
                break;
            case R.id.backspace_bt:
                viewfinder.setText(backspace(viewfinder.getText().toString()));
                break;
            case R.id.calc_bt:
                viewfinder.setText(calc(viewfinder.getText().toString()));
                break;
            case R.id.clear_bt:
                viewfinder.setText("");
                break;
        }
    }

    public String backspace(String str) {
        if (str != null && str.length() > 0) {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    public String parseToMathExpression(String str) {
        return str.replaceAll("x","*");
    }

    public String calc(String str) {
        System.out.println(str);
        Expression e = new Expression(parseToMathExpression(str));
        Double result = e.calculate();
        return result.toString();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.configurationMi:
                Intent configIntent = new Intent(this, ConfigurationActivity.class);
                startActivity(configIntent);
            case R.id.exitMi:
                finish();
                return true;
            default:
                return false;
        }

    }
}