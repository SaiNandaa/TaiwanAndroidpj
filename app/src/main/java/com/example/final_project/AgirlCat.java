package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class AgirlCat extends AppCompatActivity {
    ImageView arrowback,add;
    CardView card_view,card_view1,card_view2,card_view3,card_view4,card_view5,card_view6,card_view7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agirl_cat);
        card_view=findViewById(R.id.card_view);
        card_view1=findViewById(R.id.card_view1);
        card_view2=findViewById(R.id.card_view2);
        card_view3=findViewById(R.id.card_view3);
        card_view4=findViewById(R.id.card_view4);
        card_view5=findViewById(R.id.card_view5);
        card_view6=findViewById(R.id.card_view6);
        card_view7=findViewById(R.id.card_view7);
        arrowback=findViewById(R.id.backArrow);
        add=findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondActivity=new Intent(AgirlCat.this,AddCat.class);
                startActivity(secondActivity);
            }
        });
        arrowback.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
//                Toast
//            .makeText(
//              AgirlCat.this,
//              "You clicked on girl dress",
//              Toast.LENGTH_SHORT
//            )
//            .show();
                Intent secondActivity=new Intent(AgirlCat.this,AkhaMain.class);
                startActivity(secondActivity);
            }
        });
        card_view.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Toast
            .makeText(
              AgirlCat.this,
              "You clicked on girl dress",
              Toast.LENGTH_SHORT
            )
            .show();
                Intent secondActivity=new Intent(AgirlCat.this,AkhaDetail.class);
                startActivity(secondActivity);
            }
        });
        card_view1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Toast
                        .makeText(
                                AgirlCat.this,
                                "You clicked on girl dress",
                                Toast.LENGTH_SHORT
                        )
                        .show();
                Intent secondActivity=new Intent(AgirlCat.this,HatGirl.class);
                startActivity(secondActivity);
            }
        });
        card_view2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Toast
                        .makeText(
                                AgirlCat.this,
                                "You clicked on girl dress",
                                Toast.LENGTH_SHORT
                        )
                        .show();
                Intent secondActivity=new Intent(AgirlCat.this,ATaPhat.class);
                startActivity(secondActivity);
            }
        });
        card_view3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Toast
                        .makeText(
                                AgirlCat.this,
                                "You clicked on girl dress",
                                Toast.LENGTH_SHORT
                        )
                        .show();
                Intent secondActivity=new Intent(AgirlCat.this,AlwaeAte.class);
                startActivity(secondActivity);
            }
        });
        card_view6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Toast
                        .makeText(
                                AgirlCat.this,
                                "You clicked on girl dress",
                                Toast.LENGTH_SHORT
                        )
                        .show();
                Intent secondActivity=new Intent(AgirlCat.this,AgsnDetail.class);
                startActivity(secondActivity);
            }
        });
        card_view5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Toast
                        .makeText(
                                AgirlCat.this,
                                "You clicked on girl dress",
                                Toast.LENGTH_SHORT
                        )
                        .show();
                Intent secondActivity=new Intent(AgirlCat.this,Agwallet.class);
                startActivity(secondActivity);
            }
        });

    }
}