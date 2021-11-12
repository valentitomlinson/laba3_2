package com.example.laba3_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {
    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        textView = findViewById(R.id.textFromMain);
        Intent intent = getIntent();
        String text = intent.getStringExtra("text");
        textView.setText(text);
    }

    public void btnChanger (View view) {
        editText = findViewById(R.id.plainText2);
        String plainText2 = editText.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("text", editText.getText().toString());
        startActivity(intent);
    }
}