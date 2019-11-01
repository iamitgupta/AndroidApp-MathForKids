package com.example.amit.mathforkids;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class mul extends AppCompatActivity {
    GifImageView iv;
    Button bt_next,bt_prev;
    TextView tv_count,tv_name;
    ProgressBar pb;
    int c=1;
       MediaPlayer red,green,blue,yellow,navy,white,orange,purple,black,brown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mul);


        bt_prev=(Button) findViewById(R.id.bt_prev);
        bt_next=(Button) findViewById (R.id.bt_next);
        tv_count=(TextView) findViewById(R.id.tv_count);
          tv_name=(TextView) findViewById(R.id.tv_name);
        pb=(ProgressBar)findViewById(R.id.pb);
        iv=(GifImageView) findViewById(R.id.iv);

          black=MediaPlayer.create(this, R.raw.black);
        blue=MediaPlayer.create(this, R.raw.blue);
        brown=MediaPlayer.create(this, R.raw.brown);
        green=MediaPlayer.create(this, R.raw.green);
        navy=MediaPlayer.create(this, R.raw.navy);
        orange=MediaPlayer.create(this, R.raw.orange);
        purple=MediaPlayer.create(this, R.raw.purple);
        red=MediaPlayer.create(this, R.raw.red);
        white=MediaPlayer.create(this, R.raw.white);
        yellow=MediaPlayer.create(this, R.raw.yellow);




        tv_count.setText("1/10");
        pb.setMax(10);
        pb.setProgress(1);
        blue.start();

        bt_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c<1){
                    bt_prev.setEnabled(false);
                    bt_next.setEnabled(true);

                              blue.start();
                }
                else{
                    c--;
                    changeimge();
                    bt_prev.setEnabled(true);
                    bt_next.setEnabled(true);

                    //          mp.start();
                }


            }
        });


        bt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c>10){
                    bt_next.setEnabled(false);
                    bt_prev.setEnabled(true);

                    //          mp.start();
                }
                else{
                    c++;
                    changeimge();
                    bt_next.setEnabled(true);
                    bt_prev.setEnabled(true);

                    //           mp.start();
                }


            }
        });





    }

    public void changeimge(){
        //image changer
        if(c==1){
            iv.setImageResource(R.drawable.plue);
            tv_count.setText("1/10");
            tv_name.setText("Blue");
            pb.setProgress(1);
            blue.start();
        }
        else if(c==2){
            iv.setImageResource(R.drawable.prown);
            tv_count.setText("2/10");
            tv_name.setText("Brown");
            pb.setProgress(2);
            blue.stop();
            brown.start();
        }
        else if(c==3){
            iv.setImageResource(R.drawable.preen);
            tv_count.setText("3/10");
            tv_name.setText("Green");
            pb.setProgress(3);
            brown.stop();
            green.start();
        }
        else if(c==4){
            iv.setImageResource(R.drawable.pavy);
            tv_count.setText("4/10");
            tv_name.setText("Navy");
            pb.setProgress(4);
            green.stop();
            navy.start();
        }
        //
        else if(c==5){
            iv.setImageResource(R.drawable.prange);
            tv_count.setText("5/10");
            tv_name.setText("Orange");
            pb.setProgress(5);
            navy.stop();
            orange.start();
        }
        else if(c==6){
            iv.setImageResource(R.drawable.burple);
            tv_count.setText("6/10");
            tv_name.setText("Purple");
            pb.setProgress(6);
            orange.stop();
            purple.start();
        }
        else if(c==7){
            iv.setImageResource(R.drawable.ped);
            tv_count.setText("7/10");
            tv_name.setText("Red");
            pb.setProgress(7);
            purple.stop();
            red.start();
        }
        else if(c==8){
            iv.setImageResource(R.drawable.ggg);
            tv_count.setText("8/10");
            tv_name.setText("Black");
            pb.setProgress(8);
            red.stop();
            black.start();
        }
        else if(c==9){
            iv.setImageResource(R.drawable.phite);
            tv_count.setText("9/10");
            tv_name.setText("White");
            pb.setProgress(9);
            black.stop();
            white.start();
        }
        else if(c==10){
            iv.setImageResource(R.drawable.pellow);
            tv_count.setText("10/10");
            tv_name.setText("Yellow");
            pb.setProgress(10);
            white.stop();
            yellow.start();
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
           yellow.stop();
        blue.stop();
        green.stop();
        black.stop();
        brown.stop();
        navy.stop();
        orange.stop();
        purple.stop();
        red.stop();
        white.stop();
        finish();
    }
}

