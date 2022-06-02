package tictactoe.component;

import tictactoe.model.GameTable;
import tictactoe.model.Sign;

public interface Move {

    void make(GameTable gameTable, Sign sign);
}
