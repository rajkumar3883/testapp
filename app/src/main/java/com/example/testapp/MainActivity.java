package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onView(){
        i=19;
        networkRequest();
        setContentView(R.layout.activity_main);

    }
    public void networkRequest(){

    }
    public void networkRequest2(){

    }
    public void networkRequest3(){

    }
    public void networkRequest4(){

    }
    public void networkRequest5(){

    }
  }
