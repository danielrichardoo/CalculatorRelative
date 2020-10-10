package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txtOutput = (TextView) findViewById(R.id.screen);

        Intent intent = getIntent();

        String output = intent.getStringExtra("Data");

        txtOutput.setText(output);

    }

    public void onClickBack(View view) {
        prevActivity();
    }

    private void prevActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        TextView txtOutput = (TextView) findViewById(R.id.screen);
        String data = txtOutput.getText().toString();
        intent.putExtra("Data", data);
        startActivity(intent);
    }
}