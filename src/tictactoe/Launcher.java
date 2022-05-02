package tictactoe;

import tictactoe.component.*;

public final class Launcher {

    public static void main(String[] args) {
        final CellNumberConverter cellNumberConverter = new CellNumberConverter();
        final Game game = new Game(
                new DataPrinter(cellNumberConverter),
                new ComputerMove(),
                new UserMove(cellNumberConverter),
                new WinnerVerifier(),
                new CellVerifier());
        game.play();
    }
}
