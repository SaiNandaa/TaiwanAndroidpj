package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class LaphatMain extends AppCompatActivity {
    ImageView back_arrow,contact;
     RelativeLayout cardView,cardView2,cardView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laphat_main);
        back_arrow=findViewById(R.id.back_arrow);
        contact=findViewById(R.id.contact);
        cardView=findViewById(R.id.cardView);
        cardView2=findViewById(R.id.cardView2);
        cardView3=findViewById(R.id.cardView3);

        back_arrow.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(LaphatMain.this,MainActivity.class);
                startActivity(secondActivity);
            }
        });
        contact.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(LaphatMain.this,Contact_form.class);
                startActivity(secondActivity);
            }
        });
        cardView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(LaphatMain.this,LaphatHistory.class);
                startActivity(secondActivity);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(LaphatMain.this,LaphatCat.class);
                startActivity(secondActivity);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(LaphatMain.this,LaphatPCat.class);
                startActivity(secondActivity);
            }
        });
    }
}