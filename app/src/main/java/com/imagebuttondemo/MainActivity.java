package com.imagebuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton imageButton;
    private boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initControls();
    }

    private void initControls() {
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.imageButton:

                if (flag) {
                    flag = false;
                    imageButton.setImageResource(R.drawable.img_android_one);
                } else {
                    flag = true;
                    imageButton.setImageResource(R.drawable.img_android_two);
                }
                Toast.makeText(this, "ImageButton is clicked", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
