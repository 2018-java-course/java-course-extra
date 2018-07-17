package ex13_2_exercise;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Item> items = new ArrayList();
    
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();
        cart.fillCart();
        
        System.out.println("My cart is: " + cart.items);
        cart.removeItemFromCart("Trousers");
        System.out.println("My cart is: " + cart.items);
        cart.removeItemFromCart("Qualcosa");
        System.out.println("My cart is: " + cart.items);
        cart.removeItemFromCart("Shirt");
        System.out.println("My cart is: " + cart.items);
    }
    
    public void fillCart(){
        items.add(new Shirt(40.95,'M','R'));
        items.add(new Shirt(32.99,'M','Y'));
        items.add(new Trousers(59.99,34,'B',"Relaxed",'M'));
        items.add(new Trousers(75.50,8,'G',"Skinny",'F'));
    }
    
    public void removeItemFromCart(String desc){
        // remove all Trousers from the items list, then print out the list
        items.removeIf(item -> item.getDesc().equals(desc));
    }
    
}
