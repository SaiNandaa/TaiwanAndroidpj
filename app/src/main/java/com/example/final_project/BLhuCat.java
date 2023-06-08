package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BLhuCat extends AppCompatActivity {
    ImageView back_arrow,person;
    CardView card_view,card_view1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blhu_cat);
        back_arrow=findViewById(R.id.back_arrow);
        person=findViewById(R.id.person);
        card_view=findViewById(R.id.card_view);
        card_view1=findViewById(R.id.card_view1);



        back_arrow.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(BLhuCat.this,LahuMain.class);
                startActivity(secondActivity);
            }
        });
        person.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(BLhuCat.this,Contact_form.class);
                startActivity(secondActivity);
            }
        });
        card_view.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(BLhuCat.this,LBDetail.class);
                startActivity(secondActivity);
            }
        });
        card_view1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(BLhuCat.this,LBBDetail.class);
                startActivity(secondActivity);
            }
        });
    }
}