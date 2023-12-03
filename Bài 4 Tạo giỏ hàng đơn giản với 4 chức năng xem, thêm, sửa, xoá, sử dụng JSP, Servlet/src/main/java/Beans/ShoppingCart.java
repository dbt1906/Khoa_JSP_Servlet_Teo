package Beans;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> cartItemList;

    public ShoppingCart() {
        this.cartItemList = new ArrayList<>();
    }

    public  void add(CartItem cartItem){
        for (CartItem i : cartItemList){
            if(i.getProduct().getId()==cartItem.getProduct().getId()){
                i.addQuanlity(1);
                return;
            }
        }
        this.cartItemList.add(cartItem);
    }
    public void remove(int  id){
        for(CartItem c :cartItemList){
            if(c.getProduct().getId()==id){
                cartItemList.remove(c);
                return;
            }
        }
    }
    public void update(int id, int quanlity){
        for(CartItem c : cartItemList){
            if(c.getProduct().getId()==id){
                c.setQuanlity(quanlity);
                return;
            }
        }
    }
    public int getSize(){
        int re= 0;
        for (CartItem c:cartItemList){
            re +=c.getQuanlity();
        }
    return re;
    }
    public List<CartItem> getCartItemList(){
        return this.cartItemList;
    }

    public double getTotalPrice() {
        double re = 0;
        for(CartItem c: cartItemList){
            re+=c.getTotalPrice();
        }
        return  re;
    }
}
