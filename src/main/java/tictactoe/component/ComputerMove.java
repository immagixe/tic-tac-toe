package tictactoe.component;

import tictactoe.model.Cell;
import tictactoe.model.GameTable;

import java.util.Random;

import static tictactoe.model.Sign.O;

public class ComputerMove implements Move{

    @Override
    public void make(final GameTable gameTable) {
        final Random random = new Random();
        while (true) {
            final int row = random.nextInt(3);
            final int col = random.nextInt(3);
            final Cell randomCell = new Cell(row, col);
            if (gameTable.isEmpty(randomCell)) {
                gameTable.setSign(randomCell, O);
                return;
            }
        }
    }
}
