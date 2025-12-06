package model;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private String customer;
    private List<Item> items = new ArrayList<>();

    public Invoice(String customer) {
        this.customer = customer;
    }
    
    public String getCustomer() {
    	return customer;
    }

    public boolean addItem(Item item) {
    	return items.add(item);
    }
    public List<Item> getItems(){
    	return items;
    }
    
    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }

}
