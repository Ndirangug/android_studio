package com.example.george.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView mList;
    //define an array that will hold your data
    String favFoods[] = new String[]{
            "Chapo",
            "Smokie",
            "Dengu",
            "Managu",
            "Beef",
            "Mash",
            "Coffee",
            "KFC",
            "Donuts",
            "Spaghetti",
            "Pizza"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mList = findViewById(R.id.listView);
    }
}
