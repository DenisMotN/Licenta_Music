package com.example.licenta_music.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.licenta_music.Fragments.SingInFragment;
import com.example.licenta_music.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firestore.v1.FirestoreGrpc;

public class MainActivity extends AppCompatActivity {

    private Button musicAppButton;
    private Button chatButton;
    private Button logOutButton;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        musicAppButton = findViewById(R.id.musicAppButton);
        chatButton = findViewById(R.id.chatButton);
        logOutButton = findViewById(R.id.logOutButton);

        mAuth= FirebaseAuth.getInstance();


        logOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mAuth.signOut();
                Intent intent = new Intent(MainActivity.this, SingInFragment.class);
                finish();
                Toast.makeText(MainActivity.this, "Logout Successful!", Toast.LENGTH_SHORT).show();
            }
        });



        musicAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        chatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

}