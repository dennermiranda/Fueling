import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Checkout {
	private ArrayList<Item> items =new ArrayList<Item>();
	private HashMap<Item, Integer> quantities = new HashMap<Item, Integer>(); 
	int count;
	Item item1;
	public void add(Item item){
		items.add(item);
	}
	public void remove(Item item){
		items.remove(item);
	}
	
	public float checkout(){
		for(Item item : items){
			if (quantities.containsKey(item)) {
				count = quantities.get(item);
				count ++;
				quantities.put(item, count);
			}else
				quantities.put(item, 1);
		}
		for (Map.Entry<Item, Integer> entry : quantities.entrySet()){
			item1 = entry.getKey();
			
		}
		
		
		return 0;
	}
}
