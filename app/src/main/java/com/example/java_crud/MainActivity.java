package com.example.java_crud;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.java_crud.db.DbHelper;

public class MainActivity extends AppCompatActivity {

    Button btnCrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCrear = findViewById(R.id.btnCrear);

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DbHelper dbHelper = new DbHelper(MainActivity.this);
                SQLiteDatabase db = dbHelper.getWritableDatabase();

                if (db !=null){
                    Toast.makeText(MainActivity.this, "BASE DE DATOS CREADA",
                            Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(MainActivity.this, "ERRROR AL CREAR LA BASE DE DATOS",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}