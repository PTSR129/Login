package com.jycom.login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;

public class JoinActivity extends AppCompatActivity implements View.OnClickListener {

    AppCompatButton btn_signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join_layout);
        btn_signin = findViewById(R.id.btn_signIn_complete);

        btn_signin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == btn_signin)
            dialog();
    }

    void dialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(android.R.drawable.ic_dialog_alert);
        builder.setTitle("알람");
        builder.setMessage("회원가입 완료");
        builder.setPositiveButton("확인", null);
        builder.show();
        return;
    }
}