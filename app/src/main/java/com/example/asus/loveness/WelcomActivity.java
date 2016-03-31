package com.example.asus.loveness;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import org.w3c.dom.Text;

/**
 * Created by Asus on 2016/3/29.
 */
public class WelcomActivity extends AppCompatActivity implements ViewSwitcher.ViewFactory,View.OnClickListener{
    private TextSwitcher mTextSwitcher;
    private int i=3;
    private Button mButton;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcom_layout);
        mTextSwitcher=(TextSwitcher)findViewById(R.id.textview);
        mTextSwitcher.setFactory(this);
        mButton=(Button)findViewById(R.id.button);
        mButton.setOnClickListener(this);
    }


    @Override
    public View makeView() {
        TextView textView=new TextView(this);
        textView.setText(i+"");
        textView.setGravity(Gravity.CENTER);
        return textView;
    }

    @Override
    public void onClick(View v) {
        i++;
        mTextSwitcher.setText(i+"");
    }
}
