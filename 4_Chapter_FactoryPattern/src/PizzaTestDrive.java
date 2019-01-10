import pizzafm.ChicagoPizzaStore;
import pizzafm.NYPizzaStore;
import pizzafm.PizzaStore;
import pizzas.Pizza;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPuzza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPuzza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
