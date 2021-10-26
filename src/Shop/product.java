package Shop;

public class product {
	private String name;
	private String cost;
	private String countryOfOrigin;
	
	public product(String name, String cost, String countryOfOrigin) {
		super();
		this.setName(name);
		this.cost = cost;
		this.countryOfOrigin = countryOfOrigin;
	}
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	
}
