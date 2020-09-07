package com.example.a1_hw3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    public final static String SUPER_KEY = "result";
    EditText editText1, editText2;
    Button button;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double A, B, C;

                String value1 = editText1.getText().toString();
                String value2 = editText2.getText().toString();

                A = Double.parseDouble(value1);
                B = Double.parseDouble(value2);
                C = A + B;
                result = String.valueOf((Double.valueOf(C)));

                Intent intent = new Intent();
                intent.putExtra("result", result);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}