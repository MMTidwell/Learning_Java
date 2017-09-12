package Model;

import java.util.ArrayList;
import java.util.List;

public class SongBook {
	// Song is not part of the imported util package, but actually the Song class
	private List<Song> mSongs;
	
	// Constructor
	public SongBook() {
		mSongs = new ArrayList<Song>();
	}
	
	// adds the song to mSongs
	public void addSong(Song song) {
		mSongs.add(song);
	}
	
	// exposes what is in the mSongs list, this will return the number of songs
	public int getSongCount() {
		return mSongs.size();
	}
}
