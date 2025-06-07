package com.example.constraintlayouts;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BlogPostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog_post);

        Button btnAnterior = findViewById(R.id.btnAnterior);
        Button btnProximo = findViewById(R.id.btnProximo);

        btnAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BlogPostActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Opcional: fecha a activity atual
            }
        });

        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BlogPostActivity.this, SerieActivity.class);
                startActivity(intent);
                finish(); // Opcional
            }
        });
    }
}