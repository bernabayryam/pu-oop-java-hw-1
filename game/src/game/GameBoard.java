package game;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameBoard extends JFrame {
    private ArrayList<Object> pieceCollection;

    public GameBoard() {


        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

    public void paint(Graphics g) {

        super.paint(g);

        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {

                GameTiles tile = new GameTiles(row, column);
                tile.render(g);

            }
        }
    }
}
