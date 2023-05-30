package com.ahmad.memo10120062;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Handler;

public class splashScreen10120062 extends AppCompatActivity {
    private int waktu_loading = 4000;
    //4000=4 detik

    //10120062_Ahmad Sanosi_IF2

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke main activity
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();

            }
        }, waktu_loading);
    }
}
