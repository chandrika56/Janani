package com.example.janani.PregnantLadyTabs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.janani.PregnantLadyTabs.TODO.FirstTrimesterActivity;
import com.example.janani.R;
import com.example.janani.PregnantLadyTabs.TODO.SecondTrimesterActivity;
import com.example.janani.PregnantLadyTabs.TODO.ThirdTrimesterActivity;

public class ToDoActivity extends AppCompatActivity {
Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_to_do);
        b1=findViewById (R.id.button200);
        b2=findViewById (R.id.button300);
        b3=findViewById (R.id.button4);
        b1.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (ToDoActivity.this, FirstTrimesterActivity.class));
            }
        });
        b2.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (ToDoActivity.this, SecondTrimesterActivity.class));
            }
        });
        b3.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (ToDoActivity.this, ThirdTrimesterActivity.class));
            }
        });
    }
}
