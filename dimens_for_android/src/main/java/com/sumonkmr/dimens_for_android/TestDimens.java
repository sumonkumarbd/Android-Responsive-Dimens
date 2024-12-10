package com.sumonkmr.dimens_for_android;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

public class TestDimens {
    Context context;

    public TestDimens(Context context) {
        this.context = context;
    }

    public void test(TextView textView) {
        // Set the text
        textView.setText("Dimens Test passed!");

        // Retrieve and set the text size in SP
        float textSize = context.getResources().getDimension(R.dimen._40sp) / context.getResources().getDisplayMetrics().scaledDensity;
        textView.setTextSize(textSize);

        // Retrieve padding values in pixels and set them
        int padding = (int) context.getResources().getDimension(R.dimen._10dp);
        textView.setPadding(padding, padding, padding, padding);

    }

}
