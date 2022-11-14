package com.example.mycinema;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements  RecyclerViewInterface{
    ArrayList<MovieModel> movieModels = new ArrayList<>();
    int[] movieImg = {R.drawable.avengers, R.drawable.travelers, R.drawable.brooklyn,
            R.drawable.black_panther, R.drawable.ted2, R.drawable.shaft,
            R.drawable.wrong_missy, R.drawable.mud_myst};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rcv);

        setupMovieList();

        MovieRecyclerViewAdapter adapter = new MovieRecyclerViewAdapter(this, movieModels, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void setupMovieList() {
        String[] movieName = getResources().getStringArray(R.array.list);
        String[] movieDesc = getResources().getStringArray(R.array.movie_desc);

        for (int i = 0; i < movieName.length; i++) {
            movieModels.add(new MovieModel(movieName[i], movieDesc[i], movieImg[i]));
        }
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);

        intent.putExtra("Title", movieModels.get(position).getMovieName());
        intent.putExtra("Desc", movieModels.get(position).getMovieDesc());
        intent.putExtra("img", movieModels.get(position).getImage());

        startActivity(intent);
    }
}