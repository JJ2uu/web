package multi;

public class mySQL_songVO {
	private int song_id;
	private String title;
	private String artist;
	private int hit;
	private String img;
	
	public int getSong_id() {
		return song_id;
	}
	public void setSong_id(int song_id) {
		this.song_id = song_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "SongVO [song_id=" + song_id + ", title=" + title + ", artist=" + artist + ", hit=" + hit + ", img="
				+ img + "]";
	}
	
	
}
