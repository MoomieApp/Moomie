package com.example.neilculbertson.moviev2;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListTesting extends ListActivity {

    String [] Movies = {
            "The Revenant",
            "Passion of the Christ",
            "Deadpool",
            "Zoolander",
            "Anchorman",
            "Chucky",
            "Star Wars",
            "Star Trek",
            "The Godfather",
            "The Dark Knight",
            "Caddyshack",
            "Casablanca",
            "Terminator",
            "Predator",
            "Goldfinger",
            "Octopussy",
            "2001",
            "Blade Runner",
            "Animal House",
            "Rocky",
            "Shawshank Redemption",
            "Psycho",
            "Sound of Music"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Movies));
        //setContentView(R.layout.activity_list_testing);
    }

    public void onListItemClick(ListView parent, View v, int position, long id) {
        Toast.makeText(this, "You have selected " + Movies[position], Toast.LENGTH_LONG).show();
        //Toast.makeText(this, "Cannot add movies yet", Toast.LENGTH_LONG).show();
        System.out.println("Clicked list of Movies");
    }





}
