package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public abstract class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    // Getter và Setter cho artist
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    // Phương thức thêm track
    public void addTrack(Track track) {
        for (Track t : tracks) {
            if (track.getTitle().equals(t.getTitle())) {
                System.out.println("Track \"" + track.getTitle() + "\" đã tồn tại!");
                return;
            }
        }
        tracks.add(track);
        System.out.println("Track \"" + track.getTitle() + "\" đã được thêm thành công!");
    }

    // Phương thức xóa track
    public void removeTrack(Track track) {
        for (Track t : tracks) {
            if (track.getTitle().equals(t.getTitle())) {
                tracks.remove(t);
                System.out.println("Track \"" + track.getTitle() + "\" đã được xóa khỏi danh sách!");
                return;
            }
        }
        System.out.println("Track \"" + track.getTitle() + "\" không tồn tại trong danh sách!");
    }
    
    @Override
    public void play() {
        System.out.println("Now playing CD: " + getTitle());
        System.out.println("Artist: " + getArtist());
        System.out.println("Track list:");

        int totalLength = 0;
        for (Track track : tracks) {
            track.play();
            totalLength += track.getLength();
        }

        System.out.println("Total CD length: " + totalLength + " minutes");
    }

    // Constructor mặc định
    public CompactDisc() {
        super();
    }
}
