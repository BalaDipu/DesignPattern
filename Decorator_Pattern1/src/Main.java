public class Main {
    public static void main(String[] args) {
        PriceInterface price = new ColdCoffee();
        price = new FreshMilk(price);
        price = new DeshiSugar(price);
        PriceInterface price1 = new CocoCoffee();
        price1 = new FreshMilk(price1);

        System.out.println(price.calculator());
        System.out.println(price1.calculator());
    }
}
