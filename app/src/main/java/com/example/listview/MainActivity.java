package com.example.listview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

RecyclerView ContactsRecycleView;
ContactAdapter Adapter;
    ArrayList<Contact>list = new ArrayList<Contact>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ContactsRecycleView = findViewById(R.id.RecycleView);
        Adapter = new ContactAdapter(list);
        ContactsRecycleView.setAdapter(Adapter);

        addData();
    }
    public void addData(){

        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));

        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));

        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));

        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));
        list.add(new Contact("mario","Nady",R.drawable.baseline_person_24));



    }
}