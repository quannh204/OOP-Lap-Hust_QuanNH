package MyPackage;

public class DigitalVideoDisc {
	
	private String title;
	private String category;
	private String director;
	private int length;
	private double cost;
	private int id;
	
	private static int nbDigitalVideoDiscs = 0;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getTitle() {
		return title;
	}
	
	public String getCategory() {
		return category;
	}
	
	public String getDirector() {
		return director;
	}
	
	public int getLength() {
		return length;
	}
	
	public double getCost() {
		return cost;
	}
	
	public DigitalVideoDisc(int id, String title, String category, String director, int length, double cost) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		
		nbDigitalVideoDiscs++;
		System.out.println("Numbers of DigitalVideoDiscs: " + DigitalVideoDisc.getNbDigitalVideoDiscs());
	}
	
	public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }
}
