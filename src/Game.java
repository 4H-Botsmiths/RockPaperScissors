public class Game {
    private IPlayer _player1;
    private IPlayer _player2;
    private String _player1Title;
    private String _player2Title;

    public Game(IPlayer player1, IPlayer player2) {
        _player1 = player1;
        _player2 = player2;
        _player1Title = player1.toString().split("@")[0] + "1";
        _player2Title = player2.toString().split("@")[0] + "2";
    }
    public String Shoot() {
        String whoWon = DetermineWinner();

        return whoWon + " won!";
    }

    protected String DetermineWinner() {
        Move move1 = _player1.GetMove();
        System.out.println(_player1Title + " Played " + move1);
        Move move2 = _player2.GetMove();
        System.out.println(_player2Title + " Played " + move2);
        if (move1.equals(move2))
            return "no one";

        if (move1 == Move.PAPER && move2 == Move.ROCK)
            return _player1Title;
        if (move1 == Move.ROCK && move2 == Move.PAPER)
            return _player2Title;

        if (move1 == Move.SCISSORS && move2 == Move.ROCK)
            return _player2Title;
        if (move1 == Move.ROCK && move2 == Move.SCISSORS)
            return _player1Title;

        if (move1 == Move.SCISSORS && move2 == Move.PAPER)
            return _player1Title;
        if (move1 == Move.PAPER && move2 == Move.SCISSORS)
            return _player2Title;

        return "error";
    }
}
