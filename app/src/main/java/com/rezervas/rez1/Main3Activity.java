package com.rezervas.rez1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class Main3Activity extends AppCompatActivity {
    private Button button5,button8;
    private  VideoView videoView;
    public void unit(){
       button5 =(Button) findViewById(R.id.button5);
       button8=(Button) findViewById(R.id.button8);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
     unit();
     button8.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intentdikkat=new Intent(Main3Activity.this,kurallar.class);
             startActivity(intentdikkat);
         }
     });
             button5.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=Ex-Vjxv7OxY"));
                     intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                     startActivity(intent);
                 }
             }); {

             }
         }
        }



