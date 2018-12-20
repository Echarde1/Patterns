public interface Subject {
  public void registerObserver(Observer o);
  public void removeObservers(Observer o);
  public void notifyObservers();
}
