package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public abstract class SecondaryActivity extends AppCompatActivity {


    private TextView tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        tv2 = (TextView) findViewById(R.id.tv2);

        tv2.setText("Hola "+getIntent().getStringExtra("dato").toString());

    }

/*    @Override
    protected void onPause() {
    super.onPause();
        tv2.setText("Borron y cuenta nueva");
        Intent Primary;
        Primary = new Intent(this, MainActivity.class);
        startActivity(Primary);

    }*/

    public void Primary(View view){
        Intent Primary = new Intent(this, MainActivity.class);
        startActivity(Primary);
    }
}
