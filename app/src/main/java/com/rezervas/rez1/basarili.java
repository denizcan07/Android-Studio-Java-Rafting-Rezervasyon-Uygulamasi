package com.rezervas.rez1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class basarili extends AppCompatActivity {
      private Button button2;
    public void unit(){
        button2=(Button) findViewById(R.id.button2);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basarili);
        unit();
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLogin = new Intent(basarili.this,MainActivity.class);
                startActivity(intentLogin);
            }
        });
    }
}
