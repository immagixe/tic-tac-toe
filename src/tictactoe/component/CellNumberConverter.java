package tictactoe.component;

import tictactoe.model.Cell;

public interface CellNumberConverter {

    Cell toCell(final char number);

    char toNumber (final Cell cell);
}
