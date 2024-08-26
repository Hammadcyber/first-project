package com.example.newproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView resultText, solutionText;
    private String input = "";
    private String currentOperation = "";
    private boolean isResultDisplayed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultText = findViewById(R.id.resultText);
        solutionText = findViewById(R.id.solutionText);

        // Number buttons
        int[] numberButtonIds = {
                R.id.zeroButton, R.id.oneButton, R.id.twoButton, R.id.threeButton,
                R.id.fourButton, R.id.fiveButton, R.id.sixButton, R.id.sevenButton,
                R.id.eightButton, R.id.nineButton
        };
        for (int id : numberButtonIds) {
            Button button = findViewById(id);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }

        // Operation buttons
        int[] operationButtonIds = {
                R.id.plusButton, R.id.minusButton, R.id.intoButton, R.id.divideButton,
                R.id.openBracketButton, R.id.closeBracketButton
        };
        for (int id : operationButtonIds) {
            Button button = findViewById(id);
        }
    }
}

