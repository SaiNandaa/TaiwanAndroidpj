package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AkhaHistory extends AppCompatActivity {
    ImageView down_arrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akha_history);
        down_arrow=findViewById(R.id.down_arrow);
        down_arrow.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent secondActivity=new Intent(AkhaHistory.this,AkhaMain.class);
                startActivity(secondActivity);
            }
        });
    }
}