import javax.swing.*;
public class SnakeGame extends JFrame{
    private GameBoard board;
    public SnakeGame(){
        board = new GameBoard();
        add(board);
        setResizable(false);

        //pack to the size of the board
        pack();

       // setBounds(100,100,800,500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args){
        SnakeGame snakeGame = new SnakeGame();
    }
}
