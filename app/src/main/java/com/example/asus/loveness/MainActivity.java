package com.example.asus.loveness;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView mImage;
    private Button mButton,mButton1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     mImage=(ImageView)findViewById(R.id.image);
        mImage.setOnClickListener(this);
        mButton=(Button)findViewById(R.id.button);
        mButton.setOnClickListener(this);
        mButton1=(Button)findViewById(R.id.imageswitch);
        mButton1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent=new Intent();
        switch (v.getId()){
            case R.id.button:
                intent.setComponent(new ComponentName(MainActivity.this,WelcomActivity.class));
                startActivity(intent);
                break;
            case R.id.imageswitch:
                intent.setComponent(new ComponentName(MainActivity.this,ImageSwitchActivity.class));
                startActivity(intent);
                break;
            case R.id.image:
                mImage.setImageResource(R.mipmap.login);
                break;
        }
    }
}
