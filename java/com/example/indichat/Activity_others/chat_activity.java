package com.example.indichat.Activity_others;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.example.indichat.Fragments.attachlist;
import com.example.indichat.Fragments.camera_fragment;
import com.example.indichat.R;

public class chat_activity extends AppCompatActivity {

    ImageView imageView, videoicon, callicon, emoji_icon, attachepin_icon, camera_icon;
    EditText chat_text;
    TextView header_text;
    Toolbar toolbar;
    FrameLayout attach_framelayout,framelayout1;
    public static final int CAMERA_REQUEST = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        imageView = findViewById(R.id.imageView);
        emoji_icon = findViewById(R.id.emoji_icon);
        attachepin_icon = findViewById(R.id.attachepin_icon);
        camera_icon = findViewById(R.id.camera_icon);
        chat_text = findViewById(R.id.chat_text);
        videoicon = findViewById(R.id.videoicon);
        callicon = findViewById(R.id.callicon);
        header_text = findViewById(R.id.header_text);
        toolbar = findViewById(R.id.toolbar);
        attach_framelayout = findViewById(R.id.attach_framelayout);
        framelayout1 = findViewById(R.id.framelayout1);

        imageView.setImageResource(getIntent().getIntExtra("image", 0));
        header_text.setText(getIntent().getStringExtra("header"));


        attachepin_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                attachlist attachlist=new attachlist();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.attach_framelayout,attachlist);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        camera_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.framelayout1,new camera_fragment());
                transaction.addToBackStack(null);
                transaction.commit();


            }
        });


    }

}