package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ATaPhat extends AppCompatActivity {
    ImageView downarrow;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ata_phat);
        downarrow=findViewById(R.id.down_arrow);
        button=findViewById(R.id.roadmap_parent);
        downarrow.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
//                Toast
//            .makeText(
//              AgirlCat.this,
//              "You clicked on girl dress",
//              Toast.LENGTH_SHORT
//            )
//            .show();
                Intent secondActivity=new Intent(ATaPhat.this,AgirlCat.class);
                startActivity(secondActivity);
            }
        });
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
//                Toast
//            .makeText(
//              AgirlCat.this,
//              "You clicked on girl dress",
//              Toast.LENGTH_SHORT
//            )
//            .show();
                Intent secondActivity=new Intent(ATaPhat.this,CashProduct.class);
                startActivity(secondActivity);
            }
        });
    }
}