package Extra;

import java.util.ArrayList;

public class Checkout extends DessertShoppe{
    private ArrayList<DessertItem> dessertItem = new ArrayList<DessertItem>();

    public Checkout() {

    }

    public void clear() {
        dessertItem.clear();
    }

    public void enterItem(DessertItem i) {
        dessertItem.add(i);
    }

    public int numberOfItems() {
        return dessertItem.size();
    }

    public int totalCost() {
        int cost = 0;
        for (DessertItem items: dessertItem) {
            cost += items.getCost();
            //System.out.println(items.getCost());
        }

        return cost;
    }

    public int totalTax() {
        int tax = 0;
        for (DessertItem item: dessertItem) {
            tax += (int)Math.round((item.getCost() * 6.5) / 100);
        }

        return tax;
    }

    public String str() {
        String name = "";
        for (DessertItem item: dessertItem) {
            name += item.getName() + "\t\t\t" + cents2dollarsAndCents(item.getCost()) + "\n";
        }
        return name;
    }

    @Override
    public String toString() {
        return "\t\tM & M Dessert Shoppe\n\t---------------------------\n" + str() + "Tax" + "\t\t\t\t" + cents2dollarsAndCents(totalTax()) + "\nTotal Cost" +
                "\t\t" + cents2dollarsAndCents(totalCost() + totalTax()) + "\n" +
                "\t---------------------------";
    }
}
