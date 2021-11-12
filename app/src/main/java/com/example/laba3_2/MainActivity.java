package com.example.laba3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textFromAct2);
        Intent intent = getIntent();
        String text = intent.getStringExtra("text");
        textView.setText(text);
    }
    public void changeAct(View view) {
        editText = findViewById(R.id.plainText1);
        String plainText1 = editText.getText().toString();
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("text", editText.getText().toString());
        startActivity(intent);
    }
}