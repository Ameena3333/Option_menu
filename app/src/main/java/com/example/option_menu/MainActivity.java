package com.example.option_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import  android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.m1:
                Toast.makeText(this, "selected", Toast.LENGTH_SHORT).show();
                Intent i1=new Intent(this,settings.class);
                startActivity(i1);
                break;

            case R.id.m2:
                Toast.makeText(this, "selected", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(this,whatsapp.class);
                startActivity(i);
                break;


            case R.id.m3:
                Toast.makeText(this, "selected", Toast.LENGTH_SHORT).show();
                Intent i2=new Intent(this,newgroup.class);
                startActivity(i2);
                break;
        }

        return super.onOptionsItemSelected(item);

    }

}

