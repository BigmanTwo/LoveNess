package com.example.asus.loveness;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

/**
 * Created by Asus on 2016/3/30.
 */
public class ImageSwitchActivity extends AppCompatActivity implements ViewSwitcher.ViewFactory, View.OnClickListener {
    private int[] image={R.mipmap.qq,R.mipmap.login,R.mipmap.beatiful};
    private ImageSwitcher mImageSwitch;
    private int i;
    private Button mButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imageswitch);
        mImageSwitch=(ImageSwitcher)findViewById(R.id.imageswitch);
        mImageSwitch.setFactory(this);
        mButton=(Button)findViewById(R.id.button);
        mButton.setOnClickListener(this);
    }

    @Override
    public View makeView() {
        ImageView imageView=new ImageView(this);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.WRAP_CONTENT));
        imageView.setImageResource(image[i]);
        return imageView;
    }

    @Override
    public void onClick(View v) {
        i++;
        if(i==3) {
            i=0;
            mImageSwitch.setImageResource(image[i]);
        }else {
            mImageSwitch.setImageResource(image[i]);
        }
    }
}
