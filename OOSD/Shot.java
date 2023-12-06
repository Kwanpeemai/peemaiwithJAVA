package OOSD;

import java.util.ArrayList;
import java.util.Iterator;

public class Shot {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong("Cool With It");
        playlist.addSong("Beside you");
        playlist.addSong("xoxosos");

        System.out.println("");
        System.out.println("Playlist:");
        SongIterator iterator = playlist.createIterator();
        while (iterator.hasNext()) {
            String song = iterator.next();
            System.out.println(song);
        }

        System.out.println("\nPlaying next song:");
        iterator = playlist.createIterator();
        if (iterator.hasNext()) {
            String nextSong = iterator.next();
            System.out.println("Now playing: " + nextSong);
        }

        // Remove a song from the playlist
        String songToRemove = "Beside you";
        playlist.removeSong(songToRemove);
        System.out.println("\nPlaylist after removing " + songToRemove + ":");
        iterator = playlist.createIterator();
        while (iterator.hasNext()) {
            String song = iterator.next();
            System.out.println(song);
        }
        System.out.println("");
    }
}
