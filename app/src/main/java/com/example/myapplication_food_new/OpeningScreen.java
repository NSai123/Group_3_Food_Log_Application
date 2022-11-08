package com.example.myapplication_food_new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.Window;
import android.view.WindowManager;
import android.os.Bundle;

//import com.example.foodlog.ui.login.LoginActivity;

public class OpeningScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.opening_screen_layout);
        Thread th = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(500);
                    Intent intent = new Intent(OpeningScreen.this, MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        th.start();
    }
}
