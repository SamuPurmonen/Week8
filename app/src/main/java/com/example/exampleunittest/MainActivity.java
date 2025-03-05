package com.example.exampleunittest;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText textInput;
    private TextView textOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        textInput = findViewById(R.id.EuroInput);
        textOutput = findViewById(R.id.ResultText);



    };


    public void EurToUsd(View view){
        double EurUsd = 1.05;
        StringBuilder sb = new StringBuilder();
        double inputAmount = Double.parseDouble(textInput.getText().toString());
        double var1 = inputAmount*EurUsd;
        String result = String.format("%.2f", var1); //tää piti googlata
        String r1 = ("$"+result);
        textOutput.setText(r1);

    }

    public void EurToGdp(View view){
        double EurGdp = 0.83;
        StringBuilder sb = new StringBuilder();
        //tämä muutos piti googlata
        double inputAmount = Double.parseDouble(textInput.getText().toString());

        double var1 = inputAmount*EurGdp;
        String result = String.format("%.2f", var1); //tää piti googlata
        String r1 = ("£"+result);
        textOutput.setText(r1);

    }
}