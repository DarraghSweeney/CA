package Assessment;

public class Song{

    private static int trackID;
    private int trackNumber;
    private String title;
    private String artist;
    private String genre;
    private int duration;
    private int releaseYear;

    public Song (title = "Title"; artist = "Artist";genre = "Genre";releaseYear = "Release Year";duration = "Duration");

    public static int getTrackID() {
        return trackID;
    }

    public static void setTrackID(int trackID) {
        Song.trackID = trackID;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String toString() {
        return "Song{" + "trackNumber=" + trackNumber + ", title='" + title + '\'' +
                ", artist='" + artist + '\'' + ", genre='" + genre + '\'' +
                ", duration=" + duration + ", releaseYear=" + releaseYear +
                '}';
    }
}