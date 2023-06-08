package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Contact_form extends AppCompatActivity {
    FloatingActionButton back_arrow;
    Button signIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_form);
        back_arrow=findViewById(R.id.back_arrow);
        signIn=findViewById(R.id.signIn);
        back_arrow.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
//                Toast
//            .makeText(
//              AgirlCat.this,
//              "You clicked on girl dress",
//              Toast.LENGTH_SHORT
//            )
//            .show();
                Intent secondActivity=new Intent(Contact_form.this,MainActivity.class);
                startActivity(secondActivity);
            }
        });
        signIn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
//                Toast
//            .makeText(
//              AgirlCat.this,
//              "You clicked on girl dress",
//              Toast.LENGTH_SHORT
//            )
//            .show();
                Intent secondActivity=new Intent(Contact_form.this,Sign_In.class);
                startActivity(secondActivity);
            }
        });
    }
}