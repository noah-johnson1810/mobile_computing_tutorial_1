package edu.sdsmt.tutorial1_johnsonnoah;

/*
 * Tutorial 1 Grading
 *
 * Complete the following checklist. If you partially completed an item, put a note how I can check what is working for partial credit.
 *
 *
 * X	70pt	T1: Tutorial is completed
 *
 * X	10pt 	T1: Grumpy button working (-5pt each for minor error)
 *
 * X	10pt 	T1: Package is named correctly (e.g. not com.example.puzzle)
 *
 * X	10pt 	T1: API range correct (not com.example.puzzle)
 *
 * N/A	10pt 	T1: CSC 578 ONLY TASK: press count works (-5pt each for minor error)
 *
 * The checklist is the starting point for course staff, who reserve the right to change the grade if they disagree with your assessment and to deduct points for other issues they may encounter, such as errors in the submission process, naming issues, etc.
 */



import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.main_button);
        button.setOnClickListener(v -> button.setText(R.string.grumpy_button_text));
    }
}