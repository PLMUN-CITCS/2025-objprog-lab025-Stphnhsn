class Item {
    private String name;
    private static int objectCount = 0;

    
    public Item(String name) {
        this.name = name;
        objectCount++;
    }

    
    public void displayItem() {
        System.out.println("Item: " + name);
    }

    
    public static void displayObjectCount() {
        System.out.println("Total objects created: " + objectCount);
    }
}

public class ItemDemo {
    public static void main(String[] args) {
        
        Item item1 = new Item("Laptop");
        Item item2 = new Item("Smartphone");
        Item item3 = new Item("Tablet");

       
        item1.displayItem();
        item2.displayItem();
        item3.displayItem();

        
        Item.displayObjectCount();
    }
}
