import static java.lang.StringTemplate.STR;

public class Game {
    private IPlayer _player1;
    private IPlayer _player2;

    public Game(    IPlayer player1,
                    IPlayer player2) {
        _player1 = player1;
        _player2 = player2;
    }

    public Result Shoot() {
        var whoWon = DetermineWinner();
        return whoWon;
    }

    protected Result DetermineWinner() {
        var player1Move = _player1.GetMove();
        var player2Move = _player2.GetMove();
        
        var player1Output = STR."Player 1 shot \{player1Move}!";
        System.out.println(player1Output);
        var player2Output = STR."Player 2 shot \{player2Move}!";
        System.out.println(player2Output);

        if(player1Move.equals(player2Move))
            return Result.Tie;

        if(player1Move == Move.ROCK && player2Move == Move.PAPER)
            return Result.Player2;
        if(player1Move == Move.PAPER && player2Move == Move.ROCK)
            return Result.Player1;

        if(player1Move == Move.SCISSORS && player2Move == Move.ROCK)
            return Result.Player1;
        if(player1Move == Move.ROCK && player2Move == Move.SCISSORS)
            return Result.Player2;

        if(player1Move == Move.PAPER && player2Move == Move.SCISSORS)
            return Result.Player2;
        if(player1Move == Move.SCISSORS && player2Move == Move.PAPER)
            return Result.Player1;

        return Result.Error;
    }
}