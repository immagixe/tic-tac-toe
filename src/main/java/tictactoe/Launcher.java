package tictactoe;

import tictactoe.component.*;
import tictactoe.component.keypad.DesktopNumericKeypadCellNumberConverter;
import tictactoe.model.Player;

import static tictactoe.model.Sign.O;
import static tictactoe.model.Sign.X;

public final class Launcher {

    public static void main(String[] args) {
        final GameFactory gameFactory = new GameFactory(args);
        final Game game = gameFactory.create();
        game.play();
    }
}
