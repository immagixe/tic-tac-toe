package tictactoe.component;

import tictactoe.model.Cell;
import tictactoe.model.GameTable;
import tictactoe.model.Player;
import tictactoe.model.Sign;

import static tictactoe.model.Sign.O;
import static tictactoe.model.Sign.X;

public class WinnerVerifier {

    public boolean isWinner(final GameTable gameTable, final Player player) {
        return isWinnerByRows(gameTable, player.getSign()) ||
                isWinnerByCols(gameTable, player.getSign()) ||
                isWinnerByMainDiagonal(gameTable, player.getSign()) ||
                isWinnerBySecondDiagonal(gameTable, player.getSign());
    }

    private boolean isWinnerByRows(final GameTable gameTable, final Sign sign) {
        for (int i = 0; i < 3; i++) {
            if (gameTable.getSign(new Cell(i, 0)) == gameTable.getSign(new Cell(i, 1)) &&
                    gameTable.getSign(new Cell(i, 1)) == gameTable.getSign(new Cell(i, 2)) &&
                    gameTable.getSign(new Cell(i, 2)) == sign) {
                return true;
            }
        }
        return false;
    }

    private boolean isWinnerByCols(final GameTable gameTable, final Sign sign) {
        for (int i = 0; i < 3; i++) {
            if (gameTable.getSign(new Cell(0, i)) == gameTable.getSign(new Cell(1, i)) &&
                    gameTable.getSign(new Cell(1, i)) == gameTable.getSign(new Cell(2, i)) &&
                    gameTable.getSign(new Cell(2, i)) == sign) {
                return true;
            }
        }
        return false;
    }

    private boolean isWinnerByMainDiagonal(final GameTable gameTable, final Sign sign) {
        return gameTable.getSign(new Cell(0, 0)) == gameTable.getSign(new Cell(1, 1)) &&
                gameTable.getSign(new Cell(1, 1)) == gameTable.getSign(new Cell(2, 2)) &&
                gameTable.getSign(new Cell(2, 2)) == sign;
    }

    private boolean isWinnerBySecondDiagonal(final GameTable gameTable, final Sign sign) {
        return gameTable.getSign(new Cell(0, 2)) == gameTable.getSign(new Cell(1, 1)) &&
                gameTable.getSign(new Cell(1, 1)) == gameTable.getSign(new Cell(2, 0)) &&
                gameTable.getSign(new Cell(2, 0)) == sign;
    }
}
