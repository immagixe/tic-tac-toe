package tictactoe.component;

import tictactoe.model.Cell;
import tictactoe.model.GameTable;

import java.util.Scanner;

public class UserMove {

    final char[][] mappingTable = {
            {'7', '8', '9'},
            {'4', '5', '6'},
            {'1', '2', '3'},
    };

    public void make(final GameTable gameTable) {
        while (true) {
            final Cell cell = getUserInput(gameTable);
            if (gameTable.isEmpty(cell)) {
                gameTable.setSign(cell, 'X');
                return;
            } else {
                System.out.println("Can't make a move, because the cell is not free! Try again!");
            }
        }
    }

    private Cell getUserInput(final GameTable gameTable) {
        while (true) {
            System.out.println("Please type number between 1 and 9:");
            final String userInput = new Scanner(System.in).nextLine();
            if (userInput.length() == 1) {
                final char ch = userInput.charAt(0);
                if (ch >= '1' && ch <= '9') {
                    for (int i = 0; i < mappingTable.length; i++) {
                        for (int j = 0; j < mappingTable.length; j++) {
                            if (mappingTable[i][j] == ch) {
                                return new Cell(i, j);
                            }
                        }
                    }
                }
            }
        }
    }
}
