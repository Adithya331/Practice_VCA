package com.example.btncontroll;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BtnControl extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    Button next;
    Button back;
    Activity activity;
    public int currentPage=0;



    public void displayPageContent() {
        switch (currentPage) {
            case 0:
                imageView.setVisibility(View.GONE);
                textView.setText("Home");
                next.setVisibility(View.VISIBLE);
                back.setVisibility(View.GONE);
                break;
            case 1:
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.user1);
                textView.setText("Page 1 content.");
                next.setVisibility(View.VISIBLE);
                back.setVisibility(View.VISIBLE);
                break;
            case 2:
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.user2);
                textView.setText("Page 2 content.");
                next.setVisibility(View.VISIBLE);
                back.setVisibility(View.VISIBLE);
                break;
            case 3:
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.user3);
                textView.setText("Page 3 content.");
                next.setVisibility(View.GONE);
                back.setVisibility(View.VISIBLE);
                break;
        }
    }

    public void nextPage() {
        if (currentPage < 4) {
            currentPage++;
            displayPageContent();
        }
    }

    public void previousPage() {
        if (currentPage > 0) {
            currentPage--;
            displayPageContent();
        }
    }
}
