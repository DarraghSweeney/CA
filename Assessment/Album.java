package Assessment;

public class Album{
    private String name;
    private Song tracks;
    private String producer;
    private int releaseYear;

    public Album = (name,tracks,producer,releaseYear);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Song getTracks() {
        return tracks;
    }

    public void setTracks(Song tracks) {
        this.tracks = tracks;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", tracks=" + tracks +
                ", producer='" + producer + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}