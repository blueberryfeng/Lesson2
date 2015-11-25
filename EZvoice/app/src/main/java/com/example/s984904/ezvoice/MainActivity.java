package com.example.s984904.ezvoice;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setGravity(Gravity.TOP);
        layout.setOrientation(LinearLayout.VERTICAL);
        TextView text1 = new TextView(this);
        TextView text2 = new TextView(this);
        TextView text3 = new TextView(this);


//        text1.setBackgroundColor(Color.CYAN);
        float density = getResources().getDisplayMetrics().density;
        text1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20 / density);
        text2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18 / density);
        text2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16 / density);
        text1.setTextColor(Color.GREEN);
        text2.setTextColor(Color.BLUE);
        text3.setTextColor(Color.GRAY);
        text1.setBackgroundColor(0xFFA59263);//"#F8FF00"  0xFF888888R
        text3.setBackgroundColor(Color.CYAN);
        text1.setGravity(Gravity.CENTER);
        text3.setGravity(Gravity.CENTER);

//        text1.setWidth(300);
        text1.setText("Homework 2\n");
        text2.setText("Create a linear layout object and set it to vertical orientation and top gravity.\n" +
                "\n" +
                "Create three TextView objects.\n" +
                "\n" +
                "Set the TextView font size to scale independent and a size that looks good.\n" +
                "\n" +
                "Set the TextView colors to something other than black.\n" +
                "\n" +
                "Use the first TextView as a title. Use the second TextView as the body text. Use the third TextView as a closing remark.\n" +
                "\n" +
                "Add the TextViews to the custom linear layout.\n" +
                "\n" +
                "Display the layout in your app.\n");
        text3.setText("End");

//        EditText input1 = new EditText(this);
//        input1.setInputType(InputType.TYPE_CLASS_NUMBER);
//
//        LinearLayout.LayoutParams para = new LinearLayout.LayoutParams(300,100);
//        text1.setLayoutParams(para);
//        input1.setBackgroundColor(Color.YELLOW);

        layout.addView(text1);
        layout.addView(text2);
        layout.addView(text3);
        setContentView(layout);


    }


}
