package JavaDay3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 5/5/2016.
 */
public class InventorySystem {

    public static void main(String[] arg) {
        Inventory inventory = new Inventory(500);
        List<Computer> computers = new ArrayList<>();


        inventory.addProdcut();

        for (int i = 0; i < inventory.computers.size(); i++) {


            computers.add(inventory.getProduct(i));

            System.out.println(computers.get(i));
        }

    }
}