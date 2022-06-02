package com.varsitycollege.mycollectables;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signupScreen extends AppCompatActivity {

    private Button signupBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_screen);

        signupBtn = (Button) findViewById(R.id.signupBtnSignupPage);
        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signup();
            }
        });
    }

    public void signup(){
        Intent intent = new Intent(this, LoginScreen.class);
        startActivity(intent);
    }
}