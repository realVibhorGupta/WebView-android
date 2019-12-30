package com.example.vibhor.webviewdemoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
      //  final Context context=this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addOnClickListener();
    }

    public void addOnClickListener()
    {

        button= (Button) findViewById(R.id.submit_button);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent =new Intent(MainActivity.this,WebActivity.class);
                    startActivity(intent);
                }
            });
    }
}
