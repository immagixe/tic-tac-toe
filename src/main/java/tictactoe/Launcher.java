package tictactoe;

import tictactoe.component.*;
import tictactoe.component.keypad.DesktopNumericKeypadCellNumberConverter;
import tictactoe.component.keypad.TerminalNumericKeypadCellNumberConverter;

public final class Launcher {

    public static void main(String[] args) {
        final CellNumberConverter cellNumberConverter = new TerminalNumericKeypadCellNumberConverter();
        final Game game = new Game(
                new DataPrinter(cellNumberConverter),
                new ComputerMove(),
                new UserMove(cellNumberConverter),
                new WinnerVerifier(),
                new CellVerifier());
        game.play();
    }
}
