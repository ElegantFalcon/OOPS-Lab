class Shirt {
    private double collarSize;
    private int sleeveLength;
    private static String material = "cotton";

    // Constructor with arguments for collar size and sleeve length
    public Shirt(double collarSize, int sleeveLength) {
        this.collarSize = collarSize;
        this.sleeveLength = sleeveLength;
    }

    // Getter method for material
    public static String getMaterial() {
        return material;
    }

    // Getter method for collar size
    public double getCollarSize() {
        return collarSize;
    }

    // Getter method for sleeve length
    public int getSleeveLength() {
        return sleeveLength;
    }
}

public class TestShirt {
    public static void main(String[] args) {
        // Instantiate three Shirt objects with different collar sizes and sleeve lengths
        Shirt shirt1 = new Shirt(16.5, 32);
        Shirt shirt2 = new Shirt(15.0, 34);
        Shirt shirt3 = new Shirt(17.0, 36);

        // Display the data for each shirt
        System.out.println("Shirt 1 Details:");
        System.out.println("Collar Size: " + shirt1.getCollarSize());
        System.out.println("Sleeve Length: " + shirt1.getSleeveLength());
        System.out.println("Material: " + Shirt.getMaterial());
        System.out.println();

        System.out.println("Shirt 2 Details:");
        System.out.println("Collar Size: " + shirt2.getCollarSize());
        System.out.println("Sleeve Length: " + shirt2.getSleeveLength());
        System.out.println("Material: " + Shirt.getMaterial());
        System.out.println();

        System.out.println("Shirt 3 Details:");
        System.out.println("Collar Size: " + shirt3.getCollarSize());
        System.out.println("Sleeve Length: " + shirt3.getSleeveLength());
        System.out.println("Material: " + Shirt.getMaterial());
    }
}

