package JavaDay3;

/**
 * Created by student on 5/5/2016.
 */
public class Computer implements Product {

    private String name;
    private double price;
    private int itemNumber;
    private int unitsInStock;

    private String brand;
    private String model;
    Processor processor;
    RAM ram;
    DiskDrive diskDrive;
    double ScreenSize;

    public Computer(int itemNumber, double price, String name, int unitsInStock, String brand,
                    String model, Processor processor, RAM ram, DiskDrive diskDrive, double Screensize) {

        this.itemNumber = itemNumber;
        this.price = price;
        this.name = name;
        this.unitsInStock = unitsInStock;
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.diskDrive = diskDrive;
        this.ScreenSize = Screensize;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    String getBrand() {
        return brand;
    }

    void setmodel(String model) {
        this.model = model;
    }

    String getModel() {
        return model;
    }

    void setProcessor(Processor pc) {
        this.processor = processor;
    }

    Processor getProcessor() {
        return processor;
    }

    void SetRam(RAM ram) {
        this.ram = ram;
    }

    RAM getRam() {
        return ram;
    }

    void SetDiskDrive(DiskDrive disk) {
        this.diskDrive = disk;
    }

    DiskDrive getDiskDrive() {
        return diskDrive;
    }

    void setScreenSize(double sz) {
        this.ScreenSize = sz;
    }

    double getScreenSize() {
        return ScreenSize;
    }


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setItemNumber(int itemNo) {
        itemNumber = itemNo;
    }

    @Override
    public int getItemNumber() {
        return itemNumber;
    }

    @Override
    public double getUnitsInStock() {
        return unitsInStock;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", itemNumber=" + itemNumber +
                ", unitsInStock=" + unitsInStock +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", processor=" + processor +
                ", ram=" + ram +
                ", diskDrive=" + diskDrive +
                ", ScreenSize=" + ScreenSize +
                '}';
    }
}

    // enumeration
    enum Processor {
        INTEL, AMD
    }

    enum RAM {FOUR, EIGHT, SIXTEN, THIRTYTWO}

    enum DiskDrive {HDD, SDD}
