package com.example.janani.PregnantLadyTabs.BabyTabs;

import android.os.Bundle;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;
import com.example.janani.R;
public class BabyImmunisationActivity extends AppCompatActivity {
CheckBox c,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_baby_immunisation);
        c=findViewById (R.id.cb1);
        c2=findViewById (R.id.checkBox45);
        c3=findViewById (R.id.checkBox46);
        c4=findViewById (R.id.checkBox47);
        c5=findViewById (R.id.checkBox48);
        c6=findViewById (R.id.checkBox49);
        c7=findViewById (R.id.checkBox50);
        c8=findViewById (R.id.checkBox51);
        c9=findViewById (R.id.checkBox52);
        c10=findViewById (R.id.checkBox53);
        c11=findViewById (R.id.checkBox54);
        c12=findViewById (R.id.checkBox55);
        c13=findViewById (R.id.checkBox56);
        c14=findViewById (R.id.checkBox57);

        c.setTag("one");
        String str = (String) c.getTag();

        if(str.equals("zero") || str.equals("one") ){
            c.setChecked(true);
        }
        c2.setTag("one");
        String str2 = (String) c.getTag();

        if(str2.equals("zero") || str2.equals("one") ){
            c.setChecked(true);
        }
        c3.setTag("one");
        String str3 = (String) c.getTag();

        if(str3.equals("zero") || str3.equals("one") ){
            c.setChecked(true);
        }
        c4.setTag("one");
        String str4 = (String) c.getTag();

        if(str4.equals("zero") || str4.equals("one") ){
            c.setChecked(true);
        }
        c5.setTag("one");
        String str5 = (String) c.getTag();

        if(str5.equals("zero") || str5.equals("one") ){
            c.setChecked(true);
        }
        c6.setTag("one");
        String str6 = (String) c.getTag();

        if(str6.equals("zero") || str6.equals("one") ){
            c.setChecked(true);
        }
        c7.setTag("one");
        String str7 = (String) c.getTag();

        if(str7.equals("zero") || str7.equals("one") ){
            c.setChecked(true);
        }
        c8.setTag("one");
        String str8 = (String) c.getTag();

        if(str8.equals("zero") || str8.equals("one") ){
            c.setChecked(true);
        }
        c9.setTag("one");
        String str9 = (String) c.getTag();

        if(str9.equals("zero") || str9.equals("one") ){
            c.setChecked(true);
        }
        c10.setTag("one");
        String str10 = (String) c.getTag();

        if(str10.equals("zero") || str10.equals("one") ){
            c.setChecked(true);
        }
        c11.setTag("one");
        String str11 = (String) c.getTag();

        if(str11.equals("zero") || str11.equals("one") ){
            c.setChecked(true);
        }
        c12.setTag("one");
        String str12 = (String) c.getTag();

        if(str12.equals("zero") || str12.equals("one") ){
            c.setChecked(true);
        }
        c13.setTag("one");
        String str13 = (String) c.getTag();

        if(str13.equals("zero") || str13.equals("one") ){
            c.setChecked(true);
        }
        c14.setTag("one");
        String str14 = (String) c.getTag();

        if(str14.equals("zero") || str14.equals("one") ){
            c.setChecked(true);
        }

    }
}
