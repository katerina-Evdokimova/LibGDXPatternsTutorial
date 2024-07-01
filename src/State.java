interface State {
    void handleInput(Player player);
    void update(Player player);
}

class StandingState implements State {
    @Override
    public void handleInput(Player player) {
        // Обработка ввода для состояния стояния
    }

    @Override
    public void update(Player player) {
        System.out.println("Player is standing.");
    }
}

class RunningState implements State {
    @Override
    public void handleInput(Player player) {
        // Обработка ввода для состояния бега
    }

    @Override
    public void update(Player player) {
        System.out.println("Player is running.");
    }
}

class Player {
    private State state;

    public Player() {
        state = new StandingState(); // Начальное состояние
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handleInput() {
        state.handleInput(this);
    }

    public void update() {
        state.update(this);
    }
}

public class Game {
    public static void main(String[] args) {
        Player player = new Player();

        player.update(); // Player is standing.
        player.setState(new RunningState());
        player.update(); // Player is running.
    }
}
