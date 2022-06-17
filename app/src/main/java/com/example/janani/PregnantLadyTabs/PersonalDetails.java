package com.example.janani.PregnantLadyTabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;

import com.example.janani.PregnantLadyHome;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import com.example.janani.R;

public class PersonalDetails extends AppCompatActivity  {
    DatabaseReference rootRef,demoRef,h;
    Button i,b;

    EditText name,Hn,Age,LMP,Ch;
    private int mYear, mMonth, mDay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_personal_details);
        Button b = findViewById (R.id.button13);
        rootRef = FirebaseDatabase.getInstance ( ).getReference ( );
        //database reference pointing to demo node
        demoRef = rootRef.child ("Pregnant Lady Details").child ("info");
        h = rootRef.child ("Risk").child ("LR Pregnant Women");
        name = findViewById (R.id.editText);
        Hn = findViewById (R.id.editText2);
        Age = findViewById (R.id.editText3);
        LMP = findViewById (R.id.editText4);
        Ch = findViewById (R.id.editText5);


        b.setOnClickListener (v -> {
            String value = name.getText ( ).toString ( );
            String value2 = Hn.getText ( ).toString ( );
            String value4 = Age.getText ( ).toString ( );
            String value3 = LMP.getText ( ).toString ( );
            String value5 = Ch.getText ( ).toString ( );

            demoRef.child (value).child ("Name").setValue (value);
            demoRef.child (value).child ("Husband Name").setValue (value2);
            demoRef.child (value).child ("Age").setValue (value4);
            demoRef.child (value).child ("LMP").setValue (value3);
            demoRef.child (value).child ("Number of children").setValue (value5);

            h.child (value).child ("Name").setValue (value);
            h.child (value).child ("Husband Name").setValue (value2);
            h.child (value).child ("Age").setValue (value4);
            h.child (value).child ("LMP").setValue (value3);
            h.child (value).child ("Number of children").setValue (value5);

            startActivity (new Intent (PersonalDetails.this, PregnantLadyHome.class));
        });


    }



}