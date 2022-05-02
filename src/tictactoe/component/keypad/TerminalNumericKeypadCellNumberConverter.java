package tictactoe.component.keypad;

import tictactoe.component.CellNumberConverter;
import tictactoe.model.Cell;

public class TerminalNumericKeypadCellNumberConverter implements CellNumberConverter {

    final char[][] mappingTable = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'},
    };

    @Override
    public Cell toCell(final char number) {
        for (int i = 0; i < mappingTable.length; i++) {
            for (int j = 0; j < mappingTable.length; j++) {
                if (mappingTable[i][j] == number) {
                    return new Cell(i, j);
                }
            }
        }
        return null;
    }

    @Override
    public char toNumber (final Cell cell) {
        return mappingTable[cell.getRow()][cell.getCol()];
    }
}
