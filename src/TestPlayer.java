public class TestPlayer implements IPlayer {
    private Move _preDeterminedMove;
    public TestPlayer(Move preDeterminedMove) {
        _preDeterminedMove = preDeterminedMove;
    }
    public Move GetMove() {
        return _preDeterminedMove;
    }
}
