public class Task {
    public static void main(String[] args) {
        DiscountCalculator discountCalc = new DiscountCalculator();

        Product food = new FoodProduct(1200);
        Product electronics = new ElectronicsProduct(5990);
        Product clothing = new ClothingProduct(4590);

        System.out.println("Food discount: " + discountCalc.calculateDiscount(food));
        System.out.println("Electronics discount: " + discountCalc.calculateDiscount(electronics));
        System.out.println("Clothing discount: " + discountCalc.calculateDiscount(clothing));
    }
}


class DiscountCalculator {
    public double calculateDiscount(Product product) {
        return product.getDiscount();
    }
}

class FoodProduct implements Product{
    public double price;

    public FoodProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price * 0.1;  // 10% discount for food products
    }
}

class ElectronicsProduct implements Product{
    public double price;

    public ElectronicsProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price * 0.05;  // 5% discount for electronics
    }
}

class ClothingProduct implements Product{
    public double price;

    public ClothingProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price * 0.2;  // 20% discount for clothing
    }
}