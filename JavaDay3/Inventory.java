package JavaDay3;

import java.util.ArrayList;
import java.util.List;
import static JavaDay3.GenerateProduct.*;

/**
 * Created by student on 5/5/2016.
 */
public class Inventory {

    List<Computer> computers = new ArrayList<>();
     private final int maxSize;
    private int size;

    public Inventory (int maxSize)
    {
        this.maxSize=maxSize;
        this.size =0 ;
    }


    public int getsize (){ return size;}
    public void addProdcut()
    {

        computers.add(macbookpro);
        computers.add(LenovoThinkPad);
    }

    public Computer getProduct( int index)
    {
        return computers.get (index);
    }

}
