package com.dilg.dilg_cartrackingsystem;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13, bt14, bt15, bt16, bt17, bt18, bt19, bt20, bt21, bt22, bt23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        bt1 = (Button) findViewById(R.id.button1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1W5Sh7cHQibtmhocmtCNroMxyM4p0tS9jn8z6Y1w6O14/edit#gid=1805625760"));
                startActivity(browser1);
            }
        });

        bt2 = (Button) findViewById(R.id.button2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1pVHOgGtN3FZiJnWB6d2Ep7Mgsd7O06FSuaZun0qhGkE/edit#gid=1712702018"));
                startActivity(browser1);
            }
        });

        bt3 = (Button) findViewById(R.id.button3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1_QK_OEyPlle5lZm_0LSSf3iuRrq7kZ0da-hAR8UYrsE/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt4 = (Button) findViewById(R.id.button4);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1VuOZTXINFpWt4xQE9Ve6S5Y6MVluikog_ofKEFk6hkk/edit#gid=479938097"));
                startActivity(browser1);
            }
        });

        bt5 = (Button) findViewById(R.id.button5);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1_QK_OEyPlle5lZm_0LSSf3iuRrq7kZ0da-hAR8UYrsE/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt6 = (Button) findViewById(R.id.button6);
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1N3G9Bz3CU9AGIPHv5_vGt_qzrhXENWJYwLOqi2y_m3I/edit#gid=770779064"));
                startActivity(browser1);
            }
        });

        bt7 = (Button) findViewById(R.id.button7);
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1V5iVkbA0xvN1AG6BcVoRB5SD0WZG0VY07969w9gMJyU/edit#gid=251067020"));
                startActivity(browser1);
            }
        });

        bt8 = (Button) findViewById(R.id.button8);
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1_QK_OEyPlle5lZm_0LSSf3iuRrq7kZ0da-hAR8UYrsE/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt9 = (Button) findViewById(R.id.button9);
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1_QK_OEyPlle5lZm_0LSSf3iuRrq7kZ0da-hAR8UYrsE/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt10 = (Button) findViewById(R.id.button10);
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1QwBQhS4Eh1Zcqj6mKvElM3IlbhnbtAD6s0_ICoxqeIQ/edit#gid=1407380212"));
                startActivity(browser1);
            }
        });

        bt11 = (Button) findViewById(R.id.button11);
        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1QwBQhS4Eh1Zcqj6mKvElM3IlbhnbtAD6s0_ICoxqeIQ/edit#gid=1407380212"));
                startActivity(browser1);
            }
        });

        bt12 = (Button) findViewById(R.id.button12);
        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1QwBQhS4Eh1Zcqj6mKvElM3IlbhnbtAD6s0_ICoxqeIQ/edit#gid=1407380212"));
                startActivity(browser1);
            }
        });

        bt13 = (Button) findViewById(R.id.button13);
        bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1QwBQhS4Eh1Zcqj6mKvElM3IlbhnbtAD6s0_ICoxqeIQ/edit#gid=1407380212"));
                startActivity(browser1);
            }
        });

        bt14 = (Button) findViewById(R.id.button14);
        bt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1_QK_OEyPlle5lZm_0LSSf3iuRrq7kZ0da-hAR8UYrsE/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt15 = (Button) findViewById(R.id.button15);
        bt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/12Mh-0QlPIhO4hx5zy263pO1LTHOxsBwl73PdEoFdD5Q/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt16 = (Button) findViewById(R.id.button16);
        bt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1_QK_OEyPlle5lZm_0LSSf3iuRrq7kZ0da-hAR8UYrsE/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt17 = (Button) findViewById(R.id.button17);
        bt17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/12v18RmKaTKZPKw-yDM0K2aRul6-_wjc5GxfL_qNvfC0/edit#gid=630104414"));
                startActivity(browser1);
            }
        });

        bt18 = (Button) findViewById(R.id.button18);
        bt18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/12v18RmKaTKZPKw-yDM0K2aRul6-_wjc5GxfL_qNvfC0/edit#gid=630104414"));
                startActivity(browser1);
            }
        });

        bt19 = (Button) findViewById(R.id.button19);
        bt19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/12v18RmKaTKZPKw-yDM0K2aRul6-_wjc5GxfL_qNvfC0/edit#gid=903103607"));
                startActivity(browser1);
            }
        });

        bt20 = (Button) findViewById(R.id.button20);
        bt20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/12v18RmKaTKZPKw-yDM0K2aRul6-_wjc5GxfL_qNvfC0/edit#gid=1755428130"));
                startActivity(browser1);
            }
        });

        bt21 = (Button) findViewById(R.id.button21);
        bt21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/12v18RmKaTKZPKw-yDM0K2aRul6-_wjc5GxfL_qNvfC0/edit#gid=923606073"));
                startActivity(browser1);
            }
        });

        bt22 = (Button) findViewById(R.id.button22);
        bt22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/12v18RmKaTKZPKw-yDM0K2aRul6-_wjc5GxfL_qNvfC0/edit#gid=426381940"));
                startActivity(browser1);
            }
        });

        bt23 = (Button) findViewById(R.id.button23);
        bt23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/12v18RmKaTKZPKw-yDM0K2aRul6-_wjc5GxfL_qNvfC0/edit#gid=228723303"));
                startActivity(browser1);
            }
        });



    }
}
