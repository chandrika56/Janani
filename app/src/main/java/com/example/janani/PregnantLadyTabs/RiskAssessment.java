package com.example.janani.PregnantLadyTabs;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.janani.PregnantLadyHome;
import com.example.janani.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RiskAssessment extends AppCompatActivity {
    DatabaseReference rootRef,demoRef,hr,r,d;
    private FirebaseAuth firebaseAuth;
    CheckBox mFirstCheckBox,mSecondCheckBox,mThirdCheckBox,fo,fi,si;
    EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_risk_assessment);
        mFirstCheckBox = findViewById(R.id.checkBox);
        mSecondCheckBox = findViewById(R.id.checkBox2);
        mThirdCheckBox = findViewById(R.id.checkBox3);
        fo=findViewById (R.id.checkBox4);
        fi=findViewById (R.id.checkBox5);
        si=findViewById (R.id.checkBox6);
        Button saveButton=findViewById (R.id.button);
        firebaseAuth = FirebaseAuth.getInstance();
        final FirebaseUser user = firebaseAuth.getCurrentUser();
        e=findViewById (R.id.editText9);

        rootRef = FirebaseDatabase.getInstance().getReference();
        hr=rootRef.child ("Risk").child ("HR Pregnant Women");
        //database reference pointing to demo node
        demoRef = rootRef.child ("Pregnant Lady Details").child ("info");

        d=rootRef.child ("Risk").child ("LR Pregnant Women");

        saveButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String p=e.getText ().toString ();

                hr=rootRef.child ("Risk").child ("HR Pregnant Women").child (p);
                hr.child ("Name").setValue (p);
                d.child (p).removeValue ();
                if(mFirstCheckBox.isChecked()) {
                    //demoRef.child (p).child ("Risk details").child("1").setValue("Bleeding occuring");
                    hr.child ("Risk details").child("1").setValue("Bleeding occuring");
                }

                if(mSecondCheckBox.isChecked()) {
                    //demoRef.child (p).child ("Risk details").child("2").setValue("A sickle cell Patient");
                    hr.child ("Risk details").child("2").setValue("A sickle cell Patient");
                }

                if(mThirdCheckBox.isChecked()) {
                    //demoRef.child (p).child ("Risk details").child("3").setValue("Abortion happened");
                    hr.child ("Risk details").child("3").setValue("Abortion happened");
                }
                if(fo.isChecked()) {
                    //demoRef.child (p).child ("Risk details").child("4").setValue("Took C-Section");
                    hr.child ("Risk details").child("4").setValue("Took C-Section");
                }
                if(fi.isChecked()) {
                    //demoRef.child (p).child ("Risk details").child("5").setValue("Taken treatment for Infertility");
                    hr.child ("Risk details").child("5").setValue("Taken treatment for Infertility");
                }
                if(si.isChecked()) {
                    //demoRef.child (p).child ("Risk details").child("6").setValue("3/more abortions");
                    hr.child ("Risk details").child("6").setValue("3/more abortions");
                }

                demoRef.addChildEventListener (new ChildEventListener ( ) {
                    @Override
                    public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

                    }

                    @Override
                    public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });


                Intent interestIntent = new Intent(RiskAssessment.this, PregnantLadyHome.class);
                interestIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(interestIntent);
            }
        });
    }
}