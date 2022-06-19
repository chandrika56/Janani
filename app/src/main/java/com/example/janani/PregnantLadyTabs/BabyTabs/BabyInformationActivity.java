package com.example.janani.PregnantLadyTabs.BabyTabs;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.janani.PregnantLadyTabs.BabyActivity;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;
import com.example.janani.R;
public class BabyInformationActivity extends AppCompatActivity implements View.OnClickListener {
EditText n,wei,dob;
Button b;
    private int mYear, mMonth, mDay;
ImageButton i;
    DatabaseReference rootRef,demoRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_baby_information);
        n=findViewById (R.id.editText6);
        wei=findViewById (R.id.editText7);
        dob=findViewById (R.id.editText8);



        b=findViewById (R.id.button14);
        i=findViewById (R.id.imageButton7);
        rootRef = FirebaseDatabase.getInstance().getReference();
        //database reference pointing to demo node
        demoRef = rootRef.child("Baby details");
        i.setOnClickListener(this);

        b.setOnClickListener (v -> {
            String value = n.getText().toString();
            String value2 =wei.getText().toString();
            String value3 =dob.getText().toString();
            demoRef.child (value).child ("Name").setValue (value);
            demoRef.child (value).child ("Weight").setValue (value2);
            demoRef.child (value).child ("DOB").setValue (value3);
startActivity (new Intent (BabyInformationActivity.this, BabyActivity.class));


        });

    }


    @Override
    public void onClick(View v) {
        if (v == i) {

            // Get Current Date
            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);


            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {

                            dob.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();
        }
    }
}
