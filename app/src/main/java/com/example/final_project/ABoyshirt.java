package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ABoyshirt extends AppCompatActivity {
    ImageView down_arrow;
    Button roadmap_parent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboyshirt);
        down_arrow=findViewById(R.id.down_arrow);
        roadmap_parent=findViewById(R.id.roadmap_parent);

        roadmap_parent.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(ABoyshirt.this,CashProduct.class);
                startActivity(secondActivity);
            }
        });
        down_arrow.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(ABoyshirt.this,AKhaCat.class);
                startActivity(secondActivity);
            }
        });
    }
}