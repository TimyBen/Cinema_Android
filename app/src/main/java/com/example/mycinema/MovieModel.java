package com.example.mycinema;

class MovieModel {
    String movieName;
    String movieDesc;
    int image;

    public MovieModel(String movieName, String movieDesc, int image) {
        this.movieName = movieName;
        this.movieDesc = movieDesc;
        this.image = image;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getMovieDesc() {
        return movieDesc;
    }

    public int getImage() {
        return image;
    }
}
