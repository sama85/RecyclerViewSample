package com.example.recyclerviewsample;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.time.temporal.Temporal;

public class CharacterViewHolder extends RecyclerView.ViewHolder {

    private ImageView charImg;
    private TextView charName;


    public CharacterViewHolder(@NonNull View itemView) {
        super(itemView);

        charImg = itemView.findViewById(R.id.character_image);
        charName = itemView.findViewById(R.id.character_name);
    }

    public void populateCharacter(Character character){
        charImg.setImageResource(character.getImageRes());
        charName.setText(character.getName());
    }

}
