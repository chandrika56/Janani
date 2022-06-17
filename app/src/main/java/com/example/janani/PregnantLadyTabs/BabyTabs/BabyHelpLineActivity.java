package com.example.janani.PregnantLadyTabs.BabyTabs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import com.example.janani.R;
public class BabyHelpLineActivity extends AppCompatActivity {
ImageButton i,i2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_baby_helpline);
        i= findViewById (R.id.imageButton5);
        i2= findViewById (R.id.imageButton6);
        i.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                String phone = "9742817456";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });
        i2.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                String phone = "9480501605";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });
    }
}
