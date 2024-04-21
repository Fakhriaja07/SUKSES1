package com.example.sukses1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private Button login;
    private TextView forgotpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = findViewById(R.id.btnLOGIN);
        forgotpassword = findViewById(R.id.tvForgotPassword);

        login.setOnClickListener(this);
        forgotpassword.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnLOGIN) {
            Intent moveIntent = new Intent(LoginActivity.this, Navbar.class);
            startActivity(moveIntent);
        } else if (v.getId() == R.id.tvForgotPassword) {
            Intent moveIntent = new Intent(LoginActivity.this, ForgotPassword.class);
            startActivity(moveIntent);
        }
    }
}
