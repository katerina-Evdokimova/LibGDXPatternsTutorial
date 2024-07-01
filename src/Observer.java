import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String event);
}

class EventManager {
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notify(String event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }
}

class Player implements Observer {
    @Override
    public void update(String event) {
        if (event.equals("LEVEL_UP")) {
            System.out.println("Player levels up!");
        }
    }
}

class Enemy implements Observer {
    @Override
    public void update(String event) {
        if (event.equals("PLAYER_DETECTED")) {
            System.out.println("Enemy detected the player!");
        }
    }
}

public class Game {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();

        Player player = new Player();
        Enemy enemy = new Enemy();

        eventManager.subscribe(player);
        eventManager.subscribe(enemy);

        eventManager.notify("LEVEL_UP");
        eventManager.notify("PLAYER_DETECTED");
    }
}
