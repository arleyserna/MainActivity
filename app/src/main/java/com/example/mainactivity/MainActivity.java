package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);

    }
    
    public void Secondary(View view){
        Intent secondary = new Intent(this, SecondaryActivity.class);
        secondary.putExtra("dato", et1.getText().toString());
        Toast.makeText(this,"Cambio de prueba", Toast.LENGTH_SHORT).show();
        startActivity(secondary);
    }
}
