package com.example.review_items;

public class Item {
    String itemID;
    String itemTitle;
    String itemPrice;

    public String getItemID(){
        return itemID;
    }

    public void setItemID(String itemID){
        this.itemID = itemID;
    }

    public String getItemTitle(){
        return itemTitle;
    }

    public void setItemTitle(String itemTitle){
       this.itemTitle = itemTitle;
    }

    public String getItemprice(){
        return itemPrice;
    }

    public void setItemPrice(String itemPrice){
       this.itemPrice = itemPrice;
    }
}
