package com.dilg.dilg_cartrackingsystem;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10,
            bt11, bt12, bt13, bt14, bt15, bt16, bt17, bt18, bt19, bt20,
            bt21, bt22, bt23, bt24, bt25, bt26, bt27, bt28, bt29, bt30,
            bt31, bt32, bt33, bt34, bt35, bt36, bt37, bt38, bt39, bt40,
            bt41, bt42, bt43, bt44, bt45, bt46, bt47, bt48, bt49, bt50,
            bt51, bt52, bt53, bt54, bt55, bt56, bt57, bt58, bt59, bt60;

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
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1_QK_OEyPlle5lZm_0LSSf3iuRrq7kZ0da-hAR8UYrsE/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt5 = (Button) findViewById(R.id.button5);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1VuOZTXINFpWt4xQE9Ve6S5Y6MVluikog_ofKEFk6hkk/edit#gid=479938097"));
                startActivity(browser1);
            }
        });

        bt6 = (Button) findViewById(R.id.button6);
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1CPQvdD8NvbHvpSiK4vFoZj6wcKRVMe_Ofwv4nxYNPTE/edit#gid=1321648040"));
                startActivity(browser1);
            }
        });

        bt7 = (Button) findViewById(R.id.button7);
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1N3G9Bz3CU9AGIPHv5_vGt_qzrhXENWJYwLOqi2y_m3I/edit#gid=770779064"));
                startActivity(browser1);
            }
        });

        bt8 = (Button) findViewById(R.id.button8);
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1V5iVkbA0xvN1AG6BcVoRB5SD0WZG0VY07969w9gMJyU/edit#gid=0"));
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
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1_QK_OEyPlle5lZm_0LSSf3iuRrq7kZ0da-hAR8UYrsE/edit#gid=0"));
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
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1_QK_OEyPlle5lZm_0LSSf3iuRrq7kZ0da-hAR8UYrsE/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt13 = (Button) findViewById(R.id.button13);
        bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/12Mh-0QlPIhO4hx5zy263pO1LTHOxsBwl73PdEoFdD5Q/edit#gid=0"));
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
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1IvctbUVB2--oCNN4PZmxmi5hkID2C8XyOFNZMDABhpw/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt16 = (Button) findViewById(R.id.button16);
        bt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1ULf_6hpCN1xs_oLGrVMEvMVMJzIEHoIIdIjqeD6cMe8/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt17 = (Button) findViewById(R.id.button17);
        bt17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1WR5TiGjJ0z5sZ1aOZvj-QH7OO4p-XpUVtbdYCQo2Oxw/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt18 = (Button) findViewById(R.id.button18);
        bt18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1PY4p5QLJM48PMOIzXIqoc12agjwanV128WRAf-uttC4/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt19 = (Button) findViewById(R.id.button19);
        bt19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1ZLTuz1d4MgmpfkylHi2gFC5vCtid2fRGkOhzdb0rcpU/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt20 = (Button) findViewById(R.id.button20);
        bt20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/16hf08frujLDKgzcOGjgwXydjCGCcK_diTcb8i1Xi2O4/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt21 = (Button) findViewById(R.id.button21);
        bt21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1fVaGT4BMMecPCeGUJtD1iD5rn-yT118gCrBDKBlY55g/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt22 = (Button) findViewById(R.id.button22);
        bt22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1n2JiaPCF-kxTqG2jB7e5yNeNWH_zdDz0tGERLK0tDHU/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt23 = (Button) findViewById(R.id.button23);
        bt23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1_QK_OEyPlle5lZm_0LSSf3iuRrq7kZ0da-hAR8UYrsE/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt24 = (Button) findViewById(R.id.button24);
        bt24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1_QK_OEyPlle5lZm_0LSSf3iuRrq7kZ0da-hAR8UYrsE/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt25 = (Button) findViewById(R.id.button25);
        bt25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1MBdLJxhcgGrEeoMu5iR2LTSz3p2WHyRAPsfljEs4YYY/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt26 = (Button) findViewById(R.id.button26);
        bt26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1rK3209I0rh4ab3OGPCQIMzK4ifczKUPhr0mE9HCzDdA/edit?ts=58e320a7#gid=1256580329"));
                startActivity(browser1);
            }
        });

        bt27 = (Button) findViewById(R.id.button27);
        bt27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1QRooD36fo9BKfwdXkfu9xXGojh3kfC3561O1fceRGmI/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt28 = (Button) findViewById(R.id.button28);
        bt28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1pZnK0pd-GA-fcJ0lLM6Gpn9tv7pSU2OqZHVRurE8uSI/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt29 = (Button) findViewById(R.id.button29);
        bt29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1_QK_OEyPlle5lZm_0LSSf3iuRrq7kZ0da-hAR8UYrsE/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt30 = (Button) findViewById(R.id.button30);
        bt30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1_QK_OEyPlle5lZm_0LSSf3iuRrq7kZ0da-hAR8UYrsE/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt31 = (Button) findViewById(R.id.button31);
        bt31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1_QK_OEyPlle5lZm_0LSSf3iuRrq7kZ0da-hAR8UYrsE/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt32 = (Button) findViewById(R.id.button32);
        bt32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1CL5DCEINdnoizA8LQFTrR6yauFWXPrS5P5Y34NjcUuI/edit#gid=227565736"));
                startActivity(browser1);
            }
        });

        bt33 = (Button) findViewById(R.id.button33);
        bt33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1QwBQhS4Eh1Zcqj6mKvElM3IlbhnbtAD6s0_ICoxqeIQ/edit#gid=1407380212"));
                startActivity(browser1);
            }
        });

        bt34 = (Button) findViewById(R.id.button34);
        bt34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1_QK_OEyPlle5lZm_0LSSf3iuRrq7kZ0da-hAR8UYrsE/edit#gid=0&range=A252"));
                startActivity(browser1);
            }
        });

        bt35 = (Button) findViewById(R.id.button35);
        bt35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1_QK_OEyPlle5lZm_0LSSf3iuRrq7kZ0da-hAR8UYrsE/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt36 = (Button) findViewById(R.id.button36);
        bt36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1qfHlXtSfXXe09uQ2tGnpSzzj0nj8OkhC9-R4X9Ji_kA/edit?ts=592bb574#gid=994947848"));
                startActivity(browser1);
            }
        });

        bt37 = (Button) findViewById(R.id.button37);
        bt37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1QwBQhS4Eh1Zcqj6mKvElM3IlbhnbtAD6s0_ICoxqeIQ/edit#gid=1407380212"));
                startActivity(browser1);
            }
        });

        bt38 = (Button) findViewById(R.id.button38);
        bt38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1_QK_OEyPlle5lZm_0LSSf3iuRrq7kZ0da-hAR8UYrsE/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt39 = (Button) findViewById(R.id.button39);
        bt39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1QwBQhS4Eh1Zcqj6mKvElM3IlbhnbtAD6s0_ICoxqeIQ/edit?ts=590addf2#gid=1407380212"));
                startActivity(browser1);
            }
        });

        bt40 = (Button) findViewById(R.id.button40);
        bt40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1QwBQhS4Eh1Zcqj6mKvElM3IlbhnbtAD6s0_ICoxqeIQ/edit?ts=590addf2#gid=807304390"));
                startActivity(browser1);
            }
        });

        bt41 = (Button) findViewById(R.id.button41);
        bt41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1QwBQhS4Eh1Zcqj6mKvElM3IlbhnbtAD6s0_ICoxqeIQ/edit#gid=1407380212"));
                startActivity(browser1);
            }
        });

        bt42 = (Button) findViewById(R.id.button42);
        bt42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1_QK_OEyPlle5lZm_0LSSf3iuRrq7kZ0da-hAR8UYrsE/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt43 = (Button) findViewById(R.id.button43);
        bt43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1FD_hSAuKsVfxd0uR1sO-WTt3luGM98g6P3w0CwhBd5Q/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt44 = (Button) findViewById(R.id.button44);
        bt44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1_QK_OEyPlle5lZm_0LSSf3iuRrq7kZ0da-hAR8UYrsE/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt45 = (Button) findViewById(R.id.button45);
        bt45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1FD_hSAuKsVfxd0uR1sO-WTt3luGM98g6P3w0CwhBd5Q/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt46 = (Button) findViewById(R.id.button46);
        bt46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1_QK_OEyPlle5lZm_0LSSf3iuRrq7kZ0da-hAR8UYrsE/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt47 = (Button) findViewById(R.id.button47);
        bt47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1FD_hSAuKsVfxd0uR1sO-WTt3luGM98g6P3w0CwhBd5Q/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt48 = (Button) findViewById(R.id.button48);
        bt48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1_QK_OEyPlle5lZm_0LSSf3iuRrq7kZ0da-hAR8UYrsE/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt49 = (Button) findViewById(R.id.button49);
        bt49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1FD_hSAuKsVfxd0uR1sO-WTt3luGM98g6P3w0CwhBd5Q/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt50 = (Button) findViewById(R.id.button50);
        bt50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1FD_hSAuKsVfxd0uR1sO-WTt3luGM98g6P3w0CwhBd5Q/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt51 = (Button) findViewById(R.id.button51);
        bt51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1FD_hSAuKsVfxd0uR1sO-WTt3luGM98g6P3w0CwhBd5Q/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt52 = (Button) findViewById(R.id.button52);
        bt52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1_QK_OEyPlle5lZm_0LSSf3iuRrq7kZ0da-hAR8UYrsE/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt53 = (Button) findViewById(R.id.button53);
        bt53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1_QK_OEyPlle5lZm_0LSSf3iuRrq7kZ0da-hAR8UYrsE/edit#gid=0"));
                startActivity(browser1);
            }
        });

        bt54 = (Button) findViewById(R.id.button54);
        bt54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://lgu201.dilg.gov.ph/"));
                startActivity(browser1);
            }
        });

        bt55 = (Button) findViewById(R.id.button55);
        bt55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.dilg.gov.ph/user/login"));
                startActivity(browser1);
            }
        });

        bt56 = (Button) findViewById(R.id.button56);
        bt56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.dilg.gov.ph/user/login"));
                startActivity(browser1);
            }
        });

        bt57 = (Button) findViewById(R.id.button57);
        bt57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://elopds.dilg.gov.ph/login.php?page=index.php"));
                startActivity(browser1);
            }
        });

        bt58 = (Button) findViewById(R.id.button58);
        bt58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ppms.dilg.gov.ph/projectsmapv3/mapprojectv3.php"));
                startActivity(browser1);
            }
        });

        bt59 = (Button) findViewById(R.id.button59);
        bt59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://dilg.gov.ph/"));
                startActivity(browser1);
            }
        });

    }
}
