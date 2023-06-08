package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class LBDetail extends AppCompatActivity {
    ImageView down_arrow;
    Button roadmap_parent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lbdetail);
        down_arrow=findViewById(R.id.down_arrow);
        roadmap_parent=findViewById(R.id.roadmap_parent);
        down_arrow.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
//                Toast
//            .makeText(
//              AgirlCat.this,
//              "You clicked on girl dress",
//              Toast.LENGTH_SHORT
//            )
//            .show();
                Intent secondActivity=new Intent(LBDetail.this,BLhuCat.class);
                startActivity(secondActivity);
            }
        });
        roadmap_parent.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
//                Toast
//            .makeText(
//              AgirlCat.this,
//              "You clicked on girl dress",
//              Toast.LENGTH_SHORT
//            )
//            .show();
                Intent secondActivity=new Intent(LBDetail.this,CashProduct.class);
                startActivity(secondActivity);
            }
        });
    }
}