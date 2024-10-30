package com.example.founderapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class description extends AppCompatActivity {
    private ImageView imageView;
    private TextView name,description,company;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_description);
        imageView=findViewById(R.id.page_founderimage);
        name=findViewById(R.id.page_foundername);
        description=findViewById(R.id.founder_description);
        company=findViewById(R.id.founder_company);
        Intent intent=getIntent();
        imageView.setImageResource(intent.getIntExtra("image",0));
        name.setText(intent.getStringExtra("name"));
        company.setText(intent.getStringExtra("company"));
        description.setText(intent.getStringExtra("description"));

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}