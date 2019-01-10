package pizzafm;

import pizzas.Pizza;

public abstract class PizzaStore {

    public Pizza orderPuzza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
