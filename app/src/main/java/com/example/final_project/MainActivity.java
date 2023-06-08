package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout cardView4,cardView3,cardView;
    ImageView contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardView=findViewById(R.id.cardView);
        cardView3=findViewById(R.id.cardView3);
        cardView4=findViewById(R.id.cardView4);
        contact=findViewById(R.id.contact1);
        cardView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(MainActivity.this,AkhaMain.class);
                startActivity(secondActivity);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(MainActivity.this,LahuMain.class);
                startActivity(secondActivity);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(MainActivity.this,LaphatMain.class);
                startActivity(secondActivity);
            }
        });
        contact.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(MainActivity.this,Contact_form.class);
                startActivity(secondActivity);
            }
        });
    }
}