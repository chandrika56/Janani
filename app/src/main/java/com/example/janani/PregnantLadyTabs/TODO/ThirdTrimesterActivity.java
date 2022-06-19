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

public class ThirdTrimesterActivity extends AppCompatActivity {
    CheckBox y1,y2,y3,y4,y5,y6,y7,y8,n1,n2,n3,n4,n5,n6,n7,n8;
    DatabaseReference rootRef,demoRef;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_third_trimester);
        y1=findViewById (R.id.checkBox32);
        y2=findViewById (R.id.checkBox33);
        y3=findViewById (R.id.checkBox36);
        y4=findViewById (R.id.checkBox38);
        y5=findViewById (R.id.checkBox40);
        n1=findViewById (R.id.checkBox31);
        n2=findViewById (R.id.checkBox34);
        n3=findViewById (R.id.checkBox35);
        n4=findViewById (R.id.checkBox37);
        n5=findViewById (R.id.checkBox39);
        b=findViewById (R.id.button7);
        rootRef = FirebaseDatabase.getInstance().getReference();
        //database reference pointing to demo node
        demoRef = rootRef.child("ToDo List").child ("3rd Trimester");
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(y1.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Good Job!", Toast.LENGTH_SHORT).show();
                }

                if(y2.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Good Job!", Toast.LENGTH_SHORT).show();
                }

                if(y3.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Good Job!", Toast.LENGTH_SHORT).show();
                }
                if(y4.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Good Job!", Toast.LENGTH_SHORT).show();
                }
                if(y5.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Good Job!", Toast.LENGTH_SHORT).show();
                }
                if(n1.isChecked()) {
                    demoRef.child("1").setValue("Visit Doctor ");
                }
                if(n2.isChecked()) {
                    demoRef.child("2").setValue("Your monthly visit to ANM");
                }
                if(n3.isChecked()) {
                    demoRef.child("3").setValue("Your monthly visit to ANM");
                }
                if(n4.isChecked()) {
                    demoRef.child("4").setValue("Visit Doctor");
                }
                if(n5.isChecked()) {
                    demoRef.child("5").setValue("2 Days before EDD get admitted");
                }




                Intent interestIntent = new Intent(ThirdTrimesterActivity.this, PregnantLadyHome.class);
                interestIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(interestIntent);
            }
        });
    }
}
