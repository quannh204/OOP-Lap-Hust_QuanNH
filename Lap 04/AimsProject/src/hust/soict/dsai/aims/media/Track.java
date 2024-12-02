package hust.soict.dsai.aims.media;

public class Track implements Playable {
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLegth(int length) {
        this.length = length;
    }

    public Track(String title, int length) {
        super();
        this.title = title;
        this.length = length;
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    @Override
    public boolean equals(Object o) {
        Track track = (Track) o;
        return this.title.equals(track.title) && this.length == track.length;
    }
}
