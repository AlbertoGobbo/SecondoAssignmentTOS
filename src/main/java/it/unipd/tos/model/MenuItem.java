////////////////////////////////////////////////////////////////////
// [ALBERTO] [GOBBO] [1170556]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.model;

public class MenuItem {
    private ItemType itemtype;
    private String name;
    private Double price;

    public MenuItem(ItemType itemtype, String name, Double price) {
        super();
        this.itemtype = itemtype;
        this.name = name;
        this.price = price;
    }
    
    public ItemType getItemtype() {
        return itemtype;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    
}
