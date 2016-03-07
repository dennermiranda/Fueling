
public class Item {
	private String name;
	private float price;
	private PriceRule rule;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public PriceRule getRule() {
		return rule;
	}

	public void setRule(PriceRule rule) {
		this.rule = rule;
	}
}
