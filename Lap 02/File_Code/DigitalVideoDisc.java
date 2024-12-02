public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private double cost;
	
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
	
	public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
}
