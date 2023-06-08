package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Necktile extends AppCompatActivity {
    ImageView down_arrow;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_necktile);
        down_arrow=findViewById(R.id.down_arrow);
        button=findViewById(R.id.roadmap_parent);

        down_arrow.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(Necktile.this,AKhaCat.class);
                startActivity(secondActivity);
            }
        });
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(Necktile.this,CashProduct.class);
                startActivity(secondActivity);
            }
        });
    }
}