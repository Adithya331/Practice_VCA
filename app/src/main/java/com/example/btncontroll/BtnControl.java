package com.example.btncontroll;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import Enums.ActivityEnum;

public class BtnControl extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    Button next;
    Button back;

//    public int currentPage = 0;
    ActivityEnum activity = ActivityEnum.Main;

    @SuppressLint("SetTextI18n")
    public void displayPageContent() {
        switch (activity) {
            case Main:
                imageView.setVisibility(View.GONE);
                textView.setText("Home");
                next.setVisibility(View.VISIBLE);
                back.setVisibility(View.GONE);
                break;
            case First:
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.user1);
                textView.setText("Page 1 content.");
                next.setVisibility(View.VISIBLE);
                back.setVisibility(View.VISIBLE);
                break;
            case Second:
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.user2);
                textView.setText("Page 2 content.");
                next.setVisibility(View.VISIBLE);
                back.setVisibility(View.VISIBLE);
                break;
            case End:
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.user3);
                textView.setText("Page 3 content.");
                next.setVisibility(View.GONE);
                back.setVisibility(View.VISIBLE);
                break;
        }
    }

    public void nextPage() {
        if (activity.ordinal() < ActivityEnum.values().length - 1) {
            activity = ActivityEnum.values()[activity.ordinal() + 1];
            displayPageContent();
        }
    }

    public void previousPage() {
        if (activity.ordinal() > 0) {
            activity = ActivityEnum.values()[activity.ordinal() - 1];
            displayPageContent();
        }
    }
}
