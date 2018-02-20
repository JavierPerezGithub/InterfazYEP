package com.example.a21650521.interfazyep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
private TextView mSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mSignUp = (TextView)findViewById(R.id.idDont);
    }

    public void onClick(View v){
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }
}
