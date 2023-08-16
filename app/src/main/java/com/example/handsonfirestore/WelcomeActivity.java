package com.example.handsonfirestore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class WelcomeActivity extends AppCompatActivity {

    TextView user;
    FirebaseFirestore firestore;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        user = findViewById(R.id.user_email);
        firestore = FirebaseFirestore.getInstance();
        auth = FirebaseAuth.getInstance();

        user.setText(auth.getCurrentUser().getEmail());
    }
}