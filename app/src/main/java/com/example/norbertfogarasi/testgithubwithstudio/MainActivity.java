package com.example.norbertfogarasi.testgithubwithstudio;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        //Toast.makeText(this, "Hello there", Toast.LENGTH_SHORT).show();
        Snackbar.make(findViewById(R.id.linear_layout), "This is a Snackbar", Snackbar.LENGTH_LONG);
    }

    private void initViews() {
        mEditText = (EditText) findViewById(R.id.mainactivity_edittext);
    }
}
