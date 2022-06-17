package com.example.janani.ASHA;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import com.example.janani.R;
public class ASHA_ANCHighRiskActivity extends AppCompatActivity {

    DatabaseReference com, rootRef,demoRef;
    ListView mListView;

    private ArrayList<String> keysList = new ArrayList<>();
    private ArrayList<String>mUsername=new ArrayList<> ();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asha_anchigh_risk);

        rootRef = FirebaseDatabase.getInstance().getReference();
        demoRef = rootRef.child("Users");
        com=rootRef.child ("accepted");
        mListView=findViewById (R.id.newl);
        final ArrayAdapter<String> arrayAdapter=new ArrayAdapter<> (this,android.R.layout.simple_list_item_1,mUsername);
        mListView.setAdapter (arrayAdapter);
        mListView.setOnItemClickListener (new AdapterView.OnItemClickListener ( ) {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(ASHA_ANCHighRiskActivity.this);
                alertDialog.setTitle("High Risk Patient");

                // display each baby's data in this alert box


                alertDialog.setIcon(R.drawable.ic_family);


                alertDialog.show();
            }
        });

        demoRef.addChildEventListener (new ChildEventListener( ) {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                String string = dataSnapshot.getValue(String.class);

                mUsername.add(string);
                keysList.add(dataSnapshot.getKey());

                arrayAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                // whenever data at this location is updated.
                // mUsername.clear ();
                mUsername.add(dataSnapshot.getValue(String.class));

                arrayAdapter.notifyDataSetChanged ();

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

                String string = dataSnapshot.getValue(String.class);

                mUsername.remove(string);
                keysList.remove(dataSnapshot.getKey());

                arrayAdapter.notifyDataSetChanged();
                // startActivity (new Intent (ViewActivity.this,CancelledActivity.class));
            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }
}
