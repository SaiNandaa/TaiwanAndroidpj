package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AKhaCat extends AppCompatActivity {
    CardView card_view,card_view1,card_view2;
    ImageView backArrow,contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akha_cat);
        card_view=findViewById(R.id.card_view);
        card_view1=findViewById(R.id.card_view1);
        card_view2=findViewById(R.id.card_view2);
        backArrow=findViewById(R.id.backArrow);
        contact=findViewById(R.id.contact);

        contact.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(AKhaCat.this,Contact_form.class);
                startActivity(secondActivity);
            }
        });
        backArrow.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(AKhaCat.this,AkhaMain.class);
                startActivity(secondActivity);
            }
        });
        card_view.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(AKhaCat.this,AkhaDetail.class);
                startActivity(secondActivity);
            }
        });
        card_view1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(AKhaCat.this,Necktile.class);
                startActivity(secondActivity);
            }
        });
        card_view2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(AKhaCat.this,AkhaDetail.class);
                startActivity(secondActivity);
            }
        });
    }
}