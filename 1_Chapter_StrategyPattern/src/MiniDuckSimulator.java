public class MiniDuckSimulator {

  public static void main(String[] args) {
    Duck mallard = new MallarDuck();
    mallard.display();
    mallard.performQuack();
    mallard.performFly();

    Duck model = new ModelDuck();
    model.display();
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
  }
}
