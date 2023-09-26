package com.example.btncontroll;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main extends BtnControl{
    private BtnControl b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        next = findViewById(R.id.next);
        back = findViewById(R.id.back);

        displayPageContent();

        next.setOnClickListener(v -> nextPage());

        back.setOnClickListener(v -> previousPage());
    }
}
