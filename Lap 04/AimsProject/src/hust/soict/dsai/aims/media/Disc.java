package hust.soict.dsai.aims.media;

public abstract class Disc extends Media {
	private int length;
	private String director;
	
	
	
	public Disc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getLength() {
		return length;
	}
	public void setLegth(int length) {
		this.length = length;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
}