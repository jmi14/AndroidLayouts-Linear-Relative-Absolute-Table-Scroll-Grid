package com.example.intagpc.androidlayouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    private Button btnLinear,btnRelative,btnGrid,btnFrame,btnScroll,btnTable,btnAbsolute,btnGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();
        onClickListener();
    }
    public void initWidgets(){
        btnLinear=(Button)findViewById(R.id.linearLayout);
        btnRelative=(Button)findViewById(R.id.relativeLayout);
        btnGrid=(Button)findViewById(R.id.gridLayout);
        btnFrame=(Button)findViewById(R.id.frameLayout);
        btnScroll=(Button)findViewById(R.id.scrollView);
        btnTable=(Button)findViewById(R.id.tableLaout);
        btnAbsolute=(Button)findViewById(R.id.absoluteLayout);
        btnGridView=(Button)findViewById(R.id.btnGridView);
    }
    public void onClickListener(){
        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,LinearActivity.class);
                startActivity(i);
            }
        });
        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, RelativeActivity.class);
                startActivity(i);
            }
        });
        btnGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,GridActivity.class);
                startActivity(i);
            }
        });
        btnFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,FrameActivity.class);
                startActivity(i);
            }
        });
        btnScroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,ScrollActivity.class);
                startActivity(i);
            }
        });
        btnTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,TableActivity.class);
                startActivity(i);
            }
        });
        btnAbsolute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,AbsoluteActivity.class);
                startActivity(i);
            }
        });
        btnGridView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,GridViewActivity.class);
                startActivity(intent);
            }
        });

    }
}
