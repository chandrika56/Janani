package com.example.janani.PregnantLadyTabs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.janani.R;

public class DangerActivity extends AppCompatActivity {
ImageButton i3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_danger);
        i3= findViewById (R.id.imageButton3);
        i3.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                String phone = "9742817456";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });
    }
}
