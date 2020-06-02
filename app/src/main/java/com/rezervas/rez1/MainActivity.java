package com.rezervas.rez1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button3,button4,button6;
    public void init(){
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);
        button6=(Button) findViewById(R.id.button6);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /*Intent intentLogin = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intentLogin);*/
               if(v.getId()==R.id.button3){
                   Intent intent=new Intent(Intent.ACTION_SEND);
                   intent.setData(Uri.parse("mailto:"));
                   String[] to={"rezervasyonrafting@gmail.com"};
                   intent.putExtra(Intent.EXTRA_EMAIL, to);
                   intent.putExtra(Intent.EXTRA_SUBJECT,"Rezervasyon İşlemi");
                   intent.putExtra(Intent.EXTRA_TEXT,"TC:\n\nAd:\n\nSoyad:\n\nTelefon:\n\nRezervasyon Tarihi:\n\nKişi sayısı:\n\nBilgilerini Girip Gönderiniz.");
                   intent.setType("mesage/rfc822");
                   Intent chooser = Intent.createChooser(intent, "Gmail ile Mail Gonderiniz.");
                   startActivity(chooser);
               }
            }

        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLogin = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intentLogin);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentabout = new Intent(MainActivity.this,hakkinda.class);
                startActivity(intentabout);
            }
        });
    }
}
