package com.example.janani.ASHA;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;
import com.example.janani.R;
public class ASHA_FamilyPlanningActivity extends AppCompatActivity {

    Button btnDatePicker;
    TextView text2, text3, text4, text5, text6, text7, text8;
    private int mYear, mMonth, mDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asha_family_planning);

        btnDatePicker = (Button) findViewById(R.id.button);
        text8 = (TextView) findViewById(R.id.textView8);
        text7 = (TextView) findViewById(R.id.textView7);
        text6 = (TextView) findViewById(R.id.textView6);
        text5 = (TextView) findViewById(R.id.textView5);
        text4 = (TextView) findViewById(R.id.textView4);
        text3 = (TextView) findViewById(R.id.textView3);
        text2 = (TextView) findViewById(R.id.textView2);

    }

    public void onClick(View v) {

        if (v == btnDatePicker) {

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

                            text8.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();

        }
    }
}