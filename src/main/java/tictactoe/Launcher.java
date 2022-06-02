package tictactoe;

import tictactoe.component.*;
import tictactoe.component.keypad.DesktopNumericKeypadCellNumberConverter;
import tictactoe.model.Player;

import static tictactoe.model.Sign.O;
import static tictactoe.model.Sign.X;

public final class Launcher {

    public static void main(String[] args) {
        final CellNumberConverter cellNumberConverter = new DesktopNumericKeypadCellNumberConverter();
        final Game game = new Game(
                new DataPrinter(cellNumberConverter),
                new Player(X, new UserMove(cellNumberConverter)),
                new Player(O, new ComputerMove()),
                new WinnerVerifier(),
                new CellVerifier(),
                true);
        game.play();
    }
}
