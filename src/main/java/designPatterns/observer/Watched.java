package designPatterns.observer;

public interface Watched {

    public void add(Observer observer);
    public void remove(Observer observer);
    public void notfy();
}
