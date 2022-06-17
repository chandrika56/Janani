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

public class SecondTrimesterActivity extends AppCompatActivity {
CheckBox y1,y2,y3,y4,y5,y6,y7,y8,n1,n2,n3,n4,n5,n6,n7,n8;
    DatabaseReference rootRef,demoRef;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_second_trimester);
        y1=findViewById (R.id.checkBox15);
        y2=findViewById (R.id.checkBox17);
        y3=findViewById (R.id.checkBox19);
        y4=findViewById (R.id.checkBox21);
        n1=findViewById (R.id.checkBox16);
        n2=findViewById (R.id.checkBox18);
        n3=findViewById (R.id.checkBox20);
        n4=findViewById (R.id.checkBox22);
        y5=findViewById (R.id.checkBox23);
        y6=findViewById (R.id.checkBox25);
        y7=findViewById (R.id.checkBox27);
        y8=findViewById (R.id.checkBox29);
        n5=findViewById (R.id.checkBox24);
        n6=findViewById (R.id.checkBox26);
        n7=findViewById (R.id.checkBox28);
        n8=findViewById (R.id.checkBox30);
        b=findViewById (R.id.button5);
        rootRef = FirebaseDatabase.getInstance().getReference();
        //database reference pointing to demo node
        demoRef = rootRef.child("ToDo List").child ("2nd Trimester");
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

                if(y6.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Good Job!", Toast.LENGTH_SHORT).show();
                }

                if(y7.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Good Job!", Toast.LENGTH_SHORT).show();
                }
                if(y8.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Good Job!", Toast.LENGTH_SHORT).show();
                }
                if(n1.isChecked()) {
                    demoRef.child("1").setValue("Take your Iron Tablets");
                }
                if(n2.isChecked()) {
                    demoRef.child("2").setValue("Take your T.T Dose");
                }
                if(n3.isChecked()) {
                    demoRef.child("3").setValue("Visit ANM");
                }
                if(n4.isChecked()) {
                    demoRef.child("4").setValue("Take your Iron Tablets");
                }
                if(n5.isChecked()) {
                    demoRef.child("5").setValue("Take your 2nd T.T Dose");
                }
                if(n6.isChecked()) {
                    demoRef.child("6").setValue("Visit ANM");
                }
                if(n7.isChecked()) {
                    demoRef.child("7").setValue("Take your Iron Tablets");
                }
                if(n8.isChecked()) {
                    demoRef.child("8").setValue("Visit ANM");
                }




                Intent interestIntent = new Intent(SecondTrimesterActivity.this, PregnantLadyHome.class);
                interestIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(interestIntent);
            }
        });
    }
}
