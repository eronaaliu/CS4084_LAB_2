package com.example.cs4084_lab_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.cs4084_lab_1.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage (View view) { //View - standard AS class for anything visual
        //code for button that sends message
        EditText editText = (EditText) findViewById(R.id.editText); //finds our editText key
        String message = editText.getText().toString();
        Intent intent = new Intent(this, DisplayMessageActivity.class); //the way you send info between different activities
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}