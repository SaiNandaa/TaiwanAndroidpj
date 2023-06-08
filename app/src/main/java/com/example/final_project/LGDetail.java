package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class LGDetail extends AppCompatActivity {
    ImageView down_arrow;
    Button roadmap_parent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lgdetail);
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
                Intent secondActivity=new Intent(LGDetail.this,LahuCat.class);
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
                Intent secondActivity=new Intent(LGDetail.this,CashProduct.class);
                startActivity(secondActivity);
            }
        });
    }
}