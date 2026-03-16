class Constructor {
    String model;
    String brand;
    String color;
    int price;

    public Constructor(String m, String b, String c, int p) {
        model = m;
        brand = b;
        color = c;
    }

    public static void main(String[] args) {
        Constructor c = new Constructor("s23", "samsang", "silver", );
        System.out.println(c.model + "\n" + c.brand + "\n" + c.color + "\n" );

    }
}