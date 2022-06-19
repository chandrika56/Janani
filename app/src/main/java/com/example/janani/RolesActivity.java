package com.example.janani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.janani.ANM.ANM_LoginActivity;
import com.example.janani.ASHA.ASHA_LoginActivity;
import com.example.janani.DOCTOR.DOC_LoginActivity;

public class RolesActivity extends AppCompatActivity {
    Button pregnant_lady_page,asha_page,anm_page, doctor_page;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roles);
        pregnant_lady_page=findViewById (R.id.pregnant_lady_page);
        asha_page=findViewById (R.id.asha_page);
        anm_page=findViewById (R.id.anm_page);
        doctor_page=findViewById (R.id.doctor_page);
        pregnant_lady_page.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                startActivity (new Intent(RolesActivity.this,PregnantLadyHome.class));
            }
        });
        asha_page.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                startActivity (new Intent(RolesActivity.this, ASHA_LoginActivity.class));
            }
        });
        anm_page.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                startActivity (new Intent(RolesActivity.this, ANM_LoginActivity.class));
            }
        });
        doctor_page.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                startActivity (new Intent(RolesActivity.this, DOC_LoginActivity.class));
            }
        });
    }
}