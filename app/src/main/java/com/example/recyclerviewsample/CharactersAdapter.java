package com.example.recyclerviewsample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CharactersAdapter extends RecyclerView.Adapter<CharacterViewHolder> {

    private List<Character> characters;

    public CharactersAdapter(List<Character> characters) {
        this.characters = characters;
    }

    @NonNull
    @Override
    public CharacterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.character_viewholder, parent, false);

        return new CharacterViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CharacterViewHolder holder, int position) {
        Character current = characters.get(position);
        holder.populateCharacter(current);
    }

    @Override
    public int getItemCount() {
        return characters.size();
    }
}
