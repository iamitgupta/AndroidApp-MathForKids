package com.example.amit.mathforkids;

//import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class div extends AppCompatActivity {
    GifImageView iv;
    Button bt_next,bt_prev;
    TextView tv_count,tv_disc;
    ProgressBar pb;
    int c=1;
    //   MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_div);


        bt_prev=(Button) findViewById(R.id.bt_prev);
        bt_next=(Button) findViewById (R.id.bt_next);
        tv_count=(TextView) findViewById(R.id.tv_count);
        //  tv_disc=(TextView) findViewById(R.id.tv_disc);
        pb=(ProgressBar)findViewById(R.id.pb);
        iv=(GifImageView) findViewById(R.id.iv);

        //  mp=MediaPlayer.create(this, R.raw.med);



        tv_count.setText("1/4");
        pb.setMax(4);
        pb.setProgress(1);
        //    mp.start();

        bt_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c<1){
                    bt_prev.setEnabled(false);
                    bt_next.setEnabled(true);

//                    mp.start();
                }
                else{
                    c--;
                    changeimge();
                    bt_prev.setEnabled(true);
                    bt_next.setEnabled(true);

                    //           mp.start();
                }


            }
        });


        bt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c>4){
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
            iv.setImageResource(R.drawable.div1);
            tv_count.setText("1/4");
            pb.setProgress(1);
        }
        else if(c==2){
            iv.setImageResource(R.drawable.div2);
            tv_count.setText("2/4");
            pb.setProgress(2);
        }
        else if(c==3){
            iv.setImageResource(R.drawable.div3);
            tv_count.setText("3/4");
            pb.setProgress(3);
        }
        else if(c==4){
            iv.setImageResource(R.drawable.div4);
            tv_count.setText("4/4");
            pb.setProgress(4);
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //   mp.stop();
        finish();
    }
}
