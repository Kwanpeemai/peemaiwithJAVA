package OOSD;

import java.util.ArrayList;
import java.util.Iterator;

interface SongIterator {
    boolean hasNext();

    String next();
}

class PlaylistIterator implements SongIterator {
    private ArrayList<String> songs;
    private int position;

    public PlaylistIterator(ArrayList<String> songs) {
        this.songs = songs;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < songs.size();
    }

    @Override
    public String next() {
        String song = songs.get(position);
        position++;
        return song;
    }
}

interface IterableCollection {
    SongIterator createIterator();
}

class Playlist implements IterableCollection {
    private ArrayList<String> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public void removeSong(String song) {
        songs.remove(song);
    }

    @Override
    public SongIterator createIterator() {
        return new PlaylistIterator(songs);
    }
}

public class MusicPlayer {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong("Cool With It");
        playlist.addSong("Beside you");
        playlist.addSong("xoxosos");

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
    }
}
