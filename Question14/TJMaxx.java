package tasks.assignment_14.Question14;

import java.util.ArrayList;
import java.util.List;


public class TJMaxx {

    /**
     * Private lists to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */
    private List<Item> regularItems;
    private List<OnSaleItem> onSaleItems;

    /**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public TJMaxx() {
        this.regularItems = new ArrayList<>();
        this.onSaleItems = new ArrayList<>();        
    }

    /**
     * adds an item object to regularItems list
     * @param item
     */
    public void addRegularItem(Item item) {
       regularItems.add(item);       
    }

    /**
     * adds OnSaleItem object to onSaleItems list
     * @param item
     */
    public void addOnSaleItem(OnSaleItem item) {
        onSaleItems.add(item);
        
    }

    /**
     * getter for regularItems
     * @return
     */
    public List<Item> getRegularItems() {       
        return regularItems;
    }

    /**
     * getter for onSaleItems
     * @return
     */
    public List<OnSaleItem> getOnSaleItems() {         
        return onSaleItems;
    }

    /**
     * return count of regularItem object
     * @return
     */
    public int regularItemsCount() {         
        return regularItems.size();
    }

    /**
     * returns count of onSaleItems in TJ Maxx
     * @return
     */
    public int onSaleItemsCount() {        
        return onSaleItems.size();
    }

    /**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     * @return
     */
    public List<String> getAllItemNames() {
       
    	List<String> allItemsList = new ArrayList<>();
    	
    	for(Item item : regularItems) {
    		allItemsList.add(item.getName());
    	}
    	for(OnSaleItem item : onSaleItems) {
    		allItemsList.add(item.getName());
    	}
       
       
       return allItemsList;
    }

    /**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */
    public double getItemPrice(int catalogNumber) {
    	
    	double price;
    	for(Item item : regularItems) {
    		if(item.getCatalogNumber()==catalogNumber) {
    			price = item.getPrice();
    			return price;
    		}
    		
    	}
    	for(OnSaleItem item : onSaleItems) {
    		if(item.getCatalogNumber()==catalogNumber) {
    			price = item.getPrice();
    			return price;
    		}
    	}
       
        return 0.0;
    }

    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     * @param name
     * @return
     */
    public OnSaleItem getOnSaleItem(String name){
    	
    	for(OnSaleItem item : onSaleItems) {
    		if(item.getName().equals(name)) {    			
    			return item;
    		}
    	}   
      
        return null;
    }

    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     * @param catalogNumber
     */
    public void removeItem(int catalogNumber) {
        
    	for (OnSaleItem item : onSaleItems) {
    		if(item.getCatalogNumber()==catalogNumber) {
    			onSaleItems.remove(item);
    		}
    	}
     	for (Item item : regularItems) {
    		if(item.getCatalogNumber()==catalogNumber) {
    			regularItems.remove(item);
    		}
    	}
    	
    }

    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     *   - decrease the count of the Item by 1
     *   - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber
     */
    public void buyItem(int catalogNumber) {
       
    	for (OnSaleItem item : onSaleItems) {
    		if(item.getCatalogNumber()==catalogNumber) {
    			item.setQuantity(item.getQuantity()-1);
    			if(item.getQuantity()==0) {
    				onSaleItems.remove(item);
    			}
    		}
    	}
     	for (Item item : regularItems) {
    		if(item.getCatalogNumber()==catalogNumber) {
    			item.setQuantity(item.getQuantity()-1);
    			if(item.getQuantity()==0) {
    				regularItems.remove(item);
    			}
    		}
    	}      
       
    }


}
