import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Rock, Paper, Scissors!");
        var scanner = new Scanner(System.in);
        var player1 = GetPlayer(scanner);
        var player2 = GetPlayer(scanner);
        var game = new Game(player1, player2);

        var result = game.Shoot();
        
        String output = "";
        if(result == Result.Tie)
            output = "It's a Tie!";
        else if(result == Result.Error)
            output = "An error occured.";
        else
            output = STR."\{result} won!";
        System.out.println(output);
    }

    private static IPlayer GetPlayer(Scanner scanner) {
        IPlayer player = null;
        System.out.println("Would you like a 1) computer, or 2) human player?");
        var playerType = scanner.nextInt();
        if(playerType < 1 || playerType > 2)
            throw new InputMismatchException("Expected a 1 or 2");
        if(playerType == 1)
            player = new ComputerPlayer();
        if(playerType == 2)
            player = new HumanPlayer(scanner);
        return player;
    }
}