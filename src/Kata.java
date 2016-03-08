
public class Kata {
	public static void main (String args[]){
		Item item1 = new Item();
		Item item2 = new Item();
		Item item3 = new Item();
		item1.setName("A");
		item1.setPrice(20);
		item2.setName("B");
		item2.setPrice(10);
		PriceRule rule1 = new PriceRule();
		rule1.setDiscount(5);
		rule1.setQuantity(3);
		item1.setRule(rule1);
		Checkout checkout = new Checkout();
		checkout.add(item1);
		checkout.add(item1);
		//checkout.add(item1);
		checkout.add(item2);
		System.out.println(checkout.checkout());
	}
}
