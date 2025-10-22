package com.example.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView i1,i2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1 = (ImageView) findViewById(R.id.image1);
        i2=(ImageView) findViewById(R.id.image2);
        i1.setOnClickListener(this::onClick);
        i2.setOnClickListener(this::onClick);
    }
    private void  onClick(View view){
        if (view.getId()==R.id.image2){
            i1.setVisibility(View.VISIBLE);
            i2.setVisibility(View.GONE);
        }else{
            i2.setVisibility(View.VISIBLE);
            i1.setVisibility(View.GONE);
        }
    }
}
