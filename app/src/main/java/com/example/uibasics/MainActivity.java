package com.example.uibasics;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView citiesList;
    private Spinner studentsSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        citiesList = findViewById(R.id.citiesList);
        studentsSpinner = findViewById(R.id.studentsSpinner);

        ArrayList<String> students = new ArrayList<>();
        students.add("Caily Kendi");
        students.add("Bonface Mwicwiri");
        students.add("Maureen Chepkemoi");

        ArrayAdapter<String> studentsAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_dropdown_item, students
        );

        studentsSpinner.setAdapter(studentsAdapter);

        studentsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, students.get(i) + " Selected",
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        final ArrayList<String> cities = new ArrayList<>();

        cities.add("Nairobi");
        cities.add("Mombasa");
        cities.add("Kisumu");
        cities.add("Nakuru");


        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, cities
        );

        citiesList.setAdapter(citiesAdapter);

        citiesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, cities.get(i) + " selected",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}