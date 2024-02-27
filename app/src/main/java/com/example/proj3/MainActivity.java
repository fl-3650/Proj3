package com.example.proj3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import 	android.util.TypedValue;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        // ETC
//        setContentView(R.layout.activity_main);

//        // TASK 3
//        ConstraintLayout constraintLayout = new ConstraintLayout(this);
//        TextView textView = new TextView(this);
//        textView.setText("Hello Android");
//        textView.setTextSize(26);
//        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
//                (ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
//        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//        textView.setLayoutParams(layoutParams);
//        constraintLayout.addView(textView);
//        setContentView(constraintLayout);

//        // TASK 6
//        setContentView(R.layout.second_layout);
//        TextView textView = findViewById(R.id.header);
//        textView.setText("Hello from Java");

//        // TASK 12
        ConstraintLayout constraintLayout = new ConstraintLayout(this);
        TextView textView = new TextView(this);
        textView.setBackgroundColor(0xFFE0E0E0);
        textView.setText("Hello Text");
        textView.setTextSize(30);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
                (ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(60, 50, 60, 50);
        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        textView.setLayoutParams(layoutParams);
        textView.setPadding(40, 40, 40, 40);
        constraintLayout.addView(textView);
        setContentView(constraintLayout);

    }
}