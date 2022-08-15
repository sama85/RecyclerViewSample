package com.example.recyclerviewsample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.*;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Character> characters = getCharacters();
        CharactersAdapter adapter = new CharactersAdapter(characters);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    //create static data source (array list of model)
    private List<Character> getCharacters(){
        ArrayList<Character> characters = new ArrayList<>();

        characters.add(new Character("character 1", R.drawable.ch1));
        characters.add(new Character("character 2", R.drawable.ch2));
        characters.add(new Character("character 3", R.drawable.ch3));
        characters.add(new Character("character 4", R.drawable.ch4));
        characters.add(new Character("character 5", R.drawable.ch5));

        return characters;
    }
}