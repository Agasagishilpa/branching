class Television {
    String model;
    String brand;
    String color;
    int price;

    public Television() {
        model = "s4";
        brand = "samsang";
        color = "black";
        price = 45000;

    }

    public static void main(String[] args) {
        Television t = new Television();
        System.out.println(t.model + "\n" + t.brand + "\n" + t.color + "\n" + t.price);

    }

}
