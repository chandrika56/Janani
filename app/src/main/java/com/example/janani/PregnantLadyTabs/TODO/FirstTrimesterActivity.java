package com.example.janani.PregnantLadyTabs.TODO;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.janani.PregnantLadyHome;
import com.example.janani.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirstTrimesterActivity extends AppCompatActivity {
    CheckBox y1,y2,y3,y4,n1,n2,n3,n4;
    Button b;
    DatabaseReference rootRef,demoRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_first_trimester);
        y1=findViewById (R.id.checkBox7);
        y2=findViewById (R.id.checkBox9);
        y3=findViewById (R.id.checkBox11);
        y4=findViewById (R.id.checkBox13);
        n1=findViewById (R.id.checkBox8);
        n2=findViewById (R.id.checkBox10);
        n3=findViewById (R.id.checkBox12);
        n4=findViewById (R.id.checkBox14);
        b=findViewById (R.id.button6);
        rootRef = FirebaseDatabase.getInstance().getReference();
        //database reference pointing to demo node
        demoRef = rootRef.child("ToDo List").child ("1st Trimester");
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(y1.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Now complete next 3 tasks!", Toast.LENGTH_SHORT).show();
                }

                if(y2.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Good.Complete the next 2 tasks!", Toast.LENGTH_SHORT).show();
                }

                if(y3.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Awesome, just complete one more", Toast.LENGTH_SHORT).show();
                }
                if(y4.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Good Job!", Toast.LENGTH_SHORT).show();
                }
                if(n1.isChecked()) {
                    demoRef.child("1").setValue("Register with health center");
                }
                if(n2.isChecked()) {
                    demoRef.child("2").setValue("visit doctor");
                }
                if(n3.isChecked()) {
                    demoRef.child("3").setValue("Your monthly visit to ANM");
                }
                if(n4.isChecked()) {
                    demoRef.child("4").setValue("Take your Folic Acid tablets");
                }




                Intent interestIntent = new Intent(FirstTrimesterActivity.this, PregnantLadyHome.class);
                interestIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(interestIntent);
            }
        });
    }
}
