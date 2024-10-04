class Shop {
    String address;
    int size;

    public Shop(String address, int size) {
        this.address = address;
        this.size = size;
    }
    public String getAddress(){
        return "Address: "+ address+", Size: "+size;
    }
}
class Bookshop extends Shop {
    String[] products;

    public Bookshop(String address, int size, String[] products) {
        super(address, size);
        this.products = products;
    }

    @Override
    public String getAddress() {
        String productList = String.join("," + products);
        return super.getAddress() + ", Products: " + productList;
    }
}
class Bakery extends Shop {
    String[] products;

    public Bakery(String address, int size, String[] products) {
        super(address, size);
        this.products = products;
    }
    @Override
    public String getAddress() {
        String productList = String.join("," + products);
        return super.getAddress() + ", Products: " + productList;
    }
}


public class zad4 {
    public static void main(String[] args){
        String[] bookshopProducts = {"książki","magazyny","komiksy"};
        String[] bakeryProducts = {"chleb","bułki","ciastka"};

        Bookshop bookshop = new Bookshop("Reja 23", 120, bookshopProducts);
        Bakery bakery = new Bakery("Bułka 22", 300,bakeryProducts);

        System.out.println(bookshop.getAddress());
        System.out.println(bakery.getAddress());
    }
}
