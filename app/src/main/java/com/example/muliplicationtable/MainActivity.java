package com.example.muliplicationtable;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Controller controller;
    Button btnChallenge;
    Button btnUpto20;
    Button btnKefel;
    Button btnCheckAns;
    EditText ans;
    TextView tvNum1;
    TextView tvNum2;

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

        btnChallenge = findViewById(R.id.btnChallenge);
        btnKefel = findViewById(R.id.btnKefel);
        btnUpto20 = findViewById(R.id.btnUpto20);
        btnCheckAns = findViewById(R.id.btnCheckans);
        ans = findViewById(R.id.answerBox);
        tvNum1 = findViewById(R.id.tvNum1);
        tvNum2 = findViewById(R.id.tvNum2);
        controller = new Controller(this);


        btnUpto20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                controller.setGamemode(Gamemode.UP_TO_20);
            }
        });
        btnKefel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controller.setGamemode(Gamemode.KEFEL);
            }
        });

        btnChallenge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                controller.setGamemode(Gamemode.CHALLENGE);

            }
        });

        btnCheckAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String answer = ans.getText().toString();
                controller.checkAnswer(Integer.parseInt(answer));
            }
        });


    }

    public void displayNums(int num1, int num2) {
        tvNum1.setText("" + num1);
        tvNum2.setText("" + num2);
    }

    public void correctAns() {
        Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
        controller.setGamemode(Gamemode.KEFEL);
        ans.setText(null);
    }
    public void wrongAns() {
        Toast.makeText(MainActivity.this, "Moron!", Toast.LENGTH_SHORT).show();
    }
}