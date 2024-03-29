import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanPlayer implements IPlayer {
    private Scanner _scanner;
    public HumanPlayer(Scanner scanner) {
        super();
        _scanner = scanner;
    }
    public Move GetMove() {
        System.out.println("Enter your move, 1) rock, 2) paper or 3) scissors:");
        var humanMove = _scanner.nextInt();
        if(humanMove < 1 || humanMove > 3)
            throw new InputMismatchException("Expected a 1, 2 or 3");
        return Move.values()[humanMove - 1];
    }
}
