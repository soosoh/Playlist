public class Song {
    public String title, artist;
    public int duration;
    
    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }
    
    public String toString() {
        return "Title: " + title + "\nArtist: " + artist + "\nDuration: " + duration;
    }
}