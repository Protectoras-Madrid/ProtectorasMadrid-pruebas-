package com.miguel.protectorasmadrid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //No es necesario
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setTheme(R.style.Theme_ProtectorasMadrid);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}