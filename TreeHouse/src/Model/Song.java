package Model;

public class Song {
	// first step of the model, we are finding what will be needed for each song
	protected String mArtist;
	protected String mTitle;
	protected String mVideoUrl;
	
	// constructor 
	public Song(String artist, String title, String videoUrl) {
		mArtist = artist;
		mTitle = title;
		mVideoUrl = videoUrl;
	}
	
	// getters
	public String getArtist() {
		return mArtist;
	}
	
	public String getTitle() {
		return mTitle;
	}
	
	public String getVideoUrl() {
		return mVideoUrl;
	}
	
	@Override
	public String toString() {
		return String.format("Song: %s by %s.%n", mTitle, mArtist);
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		Song song = (Song) o;
		
		if (mArtist != null ? !mArtist.equals(song.mArtist) : song.mArtist != null);
		if (mTitle != null ? !mTitle.equals(song.mTitle) : song.mTitle != null); return false;
	}
	
	@Override
	public int hashCode() {
		int result = mArtist != null ? mArtist.hashCode() : 0;
		result = 31 * result + (mTitle != null ? mTitle.hashCode() : 0);
		result = 31 * result + (mVideoUrl != null ? mVideoUrl.hashCode() : 0);
		return result;
	}
}

	
	
	
	
	
	
	
	
	
	
	
	