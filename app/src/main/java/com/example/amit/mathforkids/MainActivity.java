package com.example.amit.mathforkids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt_add,bt_sub,bt_mul,bt_div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_add=(Button) findViewById(R.id.bt_add);
        bt_sub=(Button) findViewById(R.id.bt_sub);
        bt_mul=(Button) findViewById(R.id.bt_mul);
        bt_div=(Button) findViewById(R.id.bt_div);

        //Intent to chnage activity
        bt_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,div.class);
                startActivity(i);
            }
        });
        bt_div.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent i=new Intent(MainActivity.this,divtest.class);
                startActivity(i);
                return false;
            }
        });

        bt_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,add.class);
                startActivity(i);
            }
        });
        bt_add.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent i=new Intent(MainActivity.this,addtest.class);
                startActivity(i);
                return false;
            }
        });

        bt_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,mul.class);
                startActivity(i);
            }
        });
        bt_mul.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent i=new Intent(MainActivity.this,multest.class);
                startActivity(i);
                return false;
            }
        });

        bt_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,sub.class);
                startActivity(i);
            }
        });
        bt_sub.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent i=new Intent(MainActivity.this,subtest.class);
                startActivity(i);
                return false;
            }
        });
    }
}
