package com.example.amit.mathforkids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class multest extends AppCompatActivity {
    int min=0, max=10,a=0,b=0,c=0,x,y,p,q,r;
    TextView tv_a,tv_b;
    Button bt_1,bt_2,bt_3,bt_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multest);


        tv_a=(TextView) findViewById(R.id.tv_a);
        tv_b=(TextView) findViewById(R.id.tv_b);
        bt_1=(Button) findViewById(R.id.bt_1);
        bt_2=(Button) findViewById(R.id.bt_2);
        bt_3=(Button) findViewById(R.id.bt_3);
        bt_next=(Button) findViewById(R.id.bt_next);
        rand();

        bt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(p==(a*b)){
                    bt_1.setBackgroundColor(getResources().getColor(R.color.green));
                }else{
                    bt_1.setBackgroundColor(getResources().getColor(R.color.red));
                }
            }
        });
        bt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(q==(a*b)){
                    bt_2.setBackgroundColor(getResources().getColor(R.color.green));
                }else{
                    bt_2.setBackgroundColor(getResources().getColor(R.color.red));
                }
            }
        });
        bt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r==(a*b)){
                    bt_3.setBackgroundColor(getResources().getColor(R.color.green));
                }else{
                    bt_3.setBackgroundColor(getResources().getColor(R.color.red));
                }
            }
        });

        bt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rand();
            }
        });





    }
    public void rand(){
        a= new Random().nextInt((max-min)+1)+min;
        b= new Random().nextInt((max-min)+1)+min;
        x= new Random().nextInt((max-min)+1)+min;
        y= new Random().nextInt((max-min)+1)+min;
        int v= new Random().nextInt((max-min)+1)+min;
        int t1=1,t2=3;
        c= new Random().nextInt((t2-t1)+1)+t1;
        int t=a*b;
        if(x==y||x==t||y==t){
            rand();
        }else{

            if(c==1){
                p=a*b;
                bt_1.setText(Integer.toString(p));
                bt_2.setText(Integer.toString(x));
                bt_3.setText(Integer.toString(y));
            }else if(c==2){
                q=a*b;
                bt_1.setText(Integer.toString(x));
                bt_2.setText(Integer.toString(q));
                bt_3.setText(Integer.toString(y));
            }else{
                r=a*b;
                bt_1.setText(Integer.toString(x));
                bt_2.setText(Integer.toString(y));
                bt_3.setText(Integer.toString(r));
            }

            bt_1.setBackgroundColor(getResources().getColor(R.color.white));
            bt_2.setBackgroundColor(getResources().getColor(R.color.white));
            bt_3.setBackgroundColor(getResources().getColor(R.color.white));

            tv_a.setText(Integer.toString(a));
            tv_b.setText(Integer.toString(b));
        }
    }
}
