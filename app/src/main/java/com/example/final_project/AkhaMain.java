package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class AkhaMain extends AppCompatActivity {
    RelativeLayout cardView,cardView4,cardView3;
    ImageView back_arrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akha_main);
        cardView=findViewById(R.id.cardView);
        cardView4=findViewById(R.id.cardView4);
        cardView3=findViewById(R.id.cardView3);
        back_arrow=findViewById(R.id.back_arrow);
        cardView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(AkhaMain.this,AgirlCat.class);
                startActivity(secondActivity);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(AkhaMain.this,AKhaCat.class);
                startActivity(secondActivity);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(AkhaMain.this,AkhaHistory.class);
                startActivity(secondActivity);
            }
        });
        back_arrow.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(AkhaMain.this,MainActivity.class);
                startActivity(secondActivity);
            }
        });
    }
}