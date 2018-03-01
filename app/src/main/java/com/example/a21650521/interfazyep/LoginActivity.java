package com.example.a21650521.interfazyep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
private TextView mSignUp;
private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mSignUp = findViewById(R.id.idDont);
        img = findViewById(R.id.imageViewRotate);

        Animation scale = AnimationUtils.loadAnimation(
                this, R.anim.scale_animation1);
        img.setAnimation(scale);


    }

    public void onClick(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
