package com.example.icbt.libapp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.icbt.libapp.R;
import com.example.icbt.libapp.model.User;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class LoginActivity extends AppCompatActivity {



    @BindView(R.id.tPassword)
    TextInputEditText tetPassword;
    @BindView(R.id.Username)
    TextInputEditText tetUsername;

    @BindView(R.id.Button)
    Button Button;
    FirebaseDatabase database;
    DatabaseReference loginReferance;

    int value = 0;

    @OnClick(R.id.Button)
    public void signInUser() {
//        writeLoginDetails();
        Intent intent = new Intent(this, AdminDashboardActivity.class);
        startActivity(intent);
    }
    private  void writeLoginDetails(){


        String username = tetUsername.getText().toString();
        String password = tetPassword.getText().toString();

        ++value;

        User user = new User(username,password);
        loginReferance.push().setValue(user);

    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        initiateDatabase();

    }
    private void  initiateDatabase(){
        database = FirebaseDatabase.getInstance();
        loginReferance = database.getReference("login Details");
    }
}
