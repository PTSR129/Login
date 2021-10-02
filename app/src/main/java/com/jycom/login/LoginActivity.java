package com.jycom.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText input_id;
    EditText input_pw;

    AppCompatButton btn_login;
    AppCompatButton btn_signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        input_id = findViewById(R.id.input_id);
        input_pw = findViewById(R.id.input_pw);

        btn_login = findViewById(R.id.btn_login);
        btn_signin = findViewById(R.id.btn_signIn);

        btn_login.setOnClickListener(this);
        btn_signin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String id = input_id.getText().toString();
        String pw = input_pw.getText().toString();
        if (view == btn_login) {
            if (id.equals("")) {
                Toast.makeText(getApplicationContext(), "아이디를 입력해 주세요", Toast.LENGTH_SHORT).show();
                return;
            }
            if (pw.equals("")) {
                Toast.makeText(getApplicationContext(), "비밀번호를 입력해 주세요", Toast.LENGTH_SHORT).show();
                return;
            }
            if (id.equals("jycom") && pw.equals("1234")) {
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "아이디와 비밀번호를 확인해주세요", Toast.LENGTH_SHORT).show();
            }

        } else if (view == btn_signin) {
            Intent intent = new Intent(this, JoinActivity.class);
            startActivity(intent);
        }
    }
}