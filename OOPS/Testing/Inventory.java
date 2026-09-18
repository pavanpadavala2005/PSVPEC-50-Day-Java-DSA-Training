import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void printInventory() {
        for (Item i : this.items) {
            System.out.println("Item : " + i.getName() + ", Quantity : " + i.getQuantity());
        }
    }
}
