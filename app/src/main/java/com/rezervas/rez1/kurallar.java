package com.rezervas.rez1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kurallar extends AppCompatActivity {
 private Button button;
 public void init(){
     button=(Button) findViewById(R.id.button);
 }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurallar);
        init();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLogin = new Intent(kurallar.this,MainActivity.class);
                startActivity(intentLogin);
            }
        });
    }
}
