package com.spotify;

public class Song {

    private long id;
    private String title;
    private String artist;
    private String genre;
    private int releaseYear;
    private boolean explicit;

    //Create Read Update Delete

    //Create a new song
    public Song(String title, String artist, String genre){
        this.title = title;
        this.artist = artist;
        this.genre = genre;

    }

//    // Reads a song information
//    public Song(long id, String title, String artist, String genre, int releaseYear, boolean explicit) {
//        this.id = id;
//        this.title = title;
//        this.artist = artist;
//        this.genre = genre;
//        this.releaseYear = releaseYear;
//        this.explicit = explicit;
//    }

    //Defines the rules of how the information is being returned on the getter
    //Keeps your information private from user, but getter has access, like a banker
    // The Getter:
    public int getRealeaseYear() {
        return releaseYear;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isExplicit() {
        return explicit;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setExplicit(boolean explicit) {
        this.explicit = explicit;
    }

    public String toString(){
        return String.format("Title: %s\n Artist: %s", this.getTitle(), this.getArtist());

    }
}
