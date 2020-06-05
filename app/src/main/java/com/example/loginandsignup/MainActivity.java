package com.example.loginandsignup;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.StatusBarManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar acbar;
        acbar = getSupportActionBar();

        ColorDrawable clrdrw = new ColorDrawable(Color.parseColor("#bf1d00"));
        acbar.setBackgroundDrawable(clrdrw);

        final EditText username = (EditText) findViewById(R.id.username);
        final EditText password = (EditText) findViewById(R.id.passwordlogin);
        final Button log = (Button) findViewById(R.id.loginbtn);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usern = username.getText().toString();
                String pass = password.getText().toString();

                if(usern.matches("") || pass.matches("")){
                    Toast.makeText(MainActivity.this, "You forgot something", Toast.LENGTH_LONG).show();
                }

                else{
                    Toast.makeText(MainActivity.this, "Logged In", Toast.LENGTH_LONG).show();
                }
            }
        });

        final EditText usernameacc = (EditText) findViewById(R.id.usernameacc);
        final EditText email = (EditText) findViewById(R.id.email);
        final EditText passacc = (EditText) findViewById(R.id.passwordacc);
        final Button createbtn = (Button) findViewById(R.id.createbtn);

        createbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usern = usernameacc.getText().toString();
                String emai = email.getText().toString();
                String pass = passacc.getText().toString();

                if(usern.matches("") || pass.matches("") || emai.matches("")){
                    Toast.makeText(MainActivity.this, "You forgot something", Toast.LENGTH_LONG).show();
                }

                else{
                    Toast.makeText(MainActivity.this, "Account created", Toast.LENGTH_LONG).show();
                }
            }
        });

        final Button swt = (Button) findViewById(R.id.switchbtn);
        final TextView logtxt = (TextView) findViewById(R.id.logintext);
        swt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(logtxt.getText() == "Login"){
                    logtxt.setText("Create Account");
                    username.setVisibility(View.GONE);
                    password.setVisibility(View.GONE);
                    log.setVisibility(View.GONE);
                    usernameacc.setVisibility(View.VISIBLE);
                    usernameacc.setText("");
                    email.setVisibility(View.VISIBLE);
                    email.setText("");
                    passacc.setVisibility(View.VISIBLE);
                    passacc.setText("");
                    createbtn.setVisibility(View.VISIBLE);
                    swt.setText("Back to Login");

                }

                else{
                    usernameacc.setVisibility(View.GONE);
                    email.setVisibility(View.GONE);
                    passacc.setVisibility(View.GONE);
                    createbtn.setVisibility(View.GONE);

                    logtxt.setText("Login");
                    username.setVisibility(View.VISIBLE);
                    username.setText("");
                    password.setVisibility(View.VISIBLE);
                    password.setText("");
                    log.setVisibility(View.VISIBLE);
                    swt.setText("Back to Create Account");

                }


            }
        });

    }
}
