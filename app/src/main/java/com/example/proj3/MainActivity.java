package com.example.proj3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import 	android.util.TypedValue;

public class MainActivity extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);

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

//    // TASK 8
//    int valInDp = 60;
//    int valInPx = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, valInDp, getResources().getDisplayMetrics());

////        // TASK 12
//        ConstraintLayout constraintLayout = new ConstraintLayout(this);
//        TextView textView = new TextView(this);
//        textView.setBackgroundColor(0xFFE0E0E0);
//        textView.setText("Hello Text");
//        textView.setTextSize(30);
//        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
//                (ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
//        layoutParams.setMargins(60, 50, 60, 50);
//        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//        textView.setLayoutParams(layoutParams);
//        textView.setPadding(40, 40, 40, 40);
//        constraintLayout.addView(textView);
//        setContentView(constraintLayout);

        // TASK 13
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            ConstraintLayout constraintLayout = new ConstraintLayout(this);
            EditText editText = new EditText(this);
            editText.setHint("Enter your Email");
            editText.setId(View.generateViewId());

            Button button = new Button(this);
            button.setText("Send");
            button.setId(View.generateViewId());
            ConstraintLayout.LayoutParams editTextLayout = new ConstraintLayout.LayoutParams
                    (ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
            editTextLayout.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
            editTextLayout.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
            editTextLayout.rightToLeft = button.getId();
            editText.setLayoutParams(editTextLayout);
            constraintLayout.addView(editText);
            ConstraintLayout.LayoutParams buttonLayout = new ConstraintLayout.LayoutParams
                    (ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
            buttonLayout.leftToRight = editText.getId();
            buttonLayout.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
            button.setLayoutParams(buttonLayout);
            constraintLayout.addView(button);

            setContentView(constraintLayout);
    }
}