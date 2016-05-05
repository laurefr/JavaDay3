package JavaDay3;

/**
 * Created by student on 5/5/2016.
 */
public interface Product {

    // methods  get and set product information

    void setName(String name);
    String getName();

    void setPrice(double price);
    double getPrice();

    void setItemNumber(int itemNo);
    int getItemNumber();

    double getUnitsInStock();
}
