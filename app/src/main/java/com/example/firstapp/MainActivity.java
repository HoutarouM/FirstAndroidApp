package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /*
    * 1. pobrac z off strony
    2. codelabs tutoriale google
    3. tryb android przechownie lokalizajzi jak na uzadzeniu
    4. tryb project jak na komputerze
    5. android zaczyna wyszukiwanie (sprawdza czy mozna to zrobic)
    *  */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void wyswietl(View view) {
        Toast.makeText(MainActivity.this, "kliknieto", Toast.LENGTH_SHORT).show();
    }
}