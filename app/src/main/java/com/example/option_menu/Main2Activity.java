package com.example.option_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.tv);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.contextual_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.c1:
                Toast.makeText(this, "selected" + item.getTitle(), Toast.LENGTH_SHORT).show();
                break;


            case R.id.c2:
                Toast.makeText(this, "selected" + item.getTitle(), Toast.LENGTH_SHORT).show();
                break;

            case R.id.c3:
                Toast.makeText(this, "selected" + item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
        }

            return super.onContextItemSelected(item);
        }


}

