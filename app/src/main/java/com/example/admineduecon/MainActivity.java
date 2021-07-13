package com.example.admineduecon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView uploadNote,addEbook,delVideo,delEbook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uploadNote = findViewById(R.id.addVideo);
        addEbook = findViewById(R.id.addEbook);
        delVideo = findViewById(R.id.delVideo);
        delEbook = findViewById(R.id.delEbook);

        uploadNote.setOnClickListener(this);
        addEbook.setOnClickListener(this);
        delVideo.setOnClickListener(this);
        delEbook.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.addEbook:
                intent = new Intent(MainActivity.this,UploadPdfActivity.class);
                startActivity(intent);
                break;
            case R.id.addVideo:
                intent = new Intent(MainActivity.this,VideoActivity.class);
                startActivity(intent);
                break;

        }
    }
}