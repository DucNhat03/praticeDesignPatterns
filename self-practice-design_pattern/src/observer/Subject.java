package observer;

public interface Subject {
  void addObserver(Observer observer);
  void removeObserver(Observer observer);
  void notifyy(String weather);
 
}
