package com.example.mycinema;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String name = getIntent().getStringExtra("Title");
        String desc = getIntent().getStringExtra("Desc");
        int image = getIntent().getIntExtra("img", 0);


        TextView nameTextView = findViewById(R.id.txt_nameAct2);
        TextView Desc = findViewById(R.id.txt_descAct2);
        ImageView img = findViewById(R.id.imgMainAc2);


        nameTextView.setText(name);
        Desc.setText(desc);
        img.setImageResource(image);
    }
}