package com.spotify;

public class Spotify {

    //Size
    private static Song[] songs = new Song[2];

    public static void main(String[] args) {

        songs[0] = createASong("Try", "Nelly Furtado", "Pop", 2003, false);

        songs[2]  = createASong("Song 2", "Blur", "Rock/Alternative", 1997, true);

        play(songs);
    }

    public static Song createASong(String title, String artist, String genre, int rYear, boolean exp){
        Song song = new Song(title, artist, genre);
        song.setExplicit(exp);
        song.setReleaseYear(rYear);
        return song;

    }

    public static void play(Song[] songs){
        for (Song song : songs) {
            System.out.println("song= " + song); //Prints weird Java reference
//            System.out.println("song.getTitle() = " + song.getTitle());
//            System.out.println("song.getArtist() = " + song.getArtist());
//            System.out.println("song.getGenre() = " + song.getGenre());
        }
    }

}
