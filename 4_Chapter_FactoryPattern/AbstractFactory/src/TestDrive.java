
public class TestDrive {

    public static void main(String[] args) {
        AFPizzaStore nyStore = new NYPizzaStore();
        AFPizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
//        Pizza pizza = nyStore.createPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

//        pizza = chicagoStore.orderPuzza("cheese");
//        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
