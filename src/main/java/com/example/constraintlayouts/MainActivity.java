package com.example.constraintlayouts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonBlogPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Botão Blog Post
        Button btnBlogPost = findViewById(R.id.buttonCL1);
        btnBlogPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BlogPostActivity.class);
                startActivity(intent);
            }
        });

        // Botão Série
        Button btnSerie = findViewById(R.id.buttonCL2);
        btnSerie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SerieActivity.class);
                startActivity(intent);
            }
        });

        // Botão Concurso de Textos
        Button btnConcurso = findViewById(R.id.buttonCL3);
        btnConcurso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ConcursoTextosActivity.class);
                startActivity(intent);
            }
        });
    }
}