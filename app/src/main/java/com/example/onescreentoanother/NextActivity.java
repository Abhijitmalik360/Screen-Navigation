package com.example.onescreentoanother;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NextActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);


        button=findViewById(R.id.button1);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               /* Intent i = new Intent(getApplicationContext(),NextActivity.class);
                startActivity(i);*/

                Intent next=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(next);



            }
        });
    }
}