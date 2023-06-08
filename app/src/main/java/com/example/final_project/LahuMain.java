package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class LahuMain extends AppCompatActivity {
    ImageView arrow_back,contact;
    RelativeLayout card_view,card_view2,card_view3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lahu_main);
        arrow_back=findViewById(R.id.back_arrow);
        contact=findViewById(R.id.contact);
        card_view=findViewById(R.id.card_view);
        card_view2=findViewById(R.id.card_view2);
        card_view3=findViewById(R.id.card_view3);


        arrow_back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(LahuMain.this,MainActivity.class);
                startActivity(secondActivity);
            }
        });
        contact.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(LahuMain.this,Contact_form.class);
                startActivity(secondActivity);
            }
        });
        card_view.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(LahuMain.this,LahuCat.class);
                startActivity(secondActivity);
            }
        });
        card_view2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(LahuMain.this,BLhuCat.class);
                startActivity(secondActivity);
            }
        });
        card_view3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(LahuMain.this,LahuHistory.class);
                startActivity(secondActivity);
            }
        });
    }
}