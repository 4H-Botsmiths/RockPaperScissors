public enum Result {
    Player1("Player 1"),
    Player2("Player 2"),
    Tie("Tie"),
    Error("Error");

    private final String value;

    Result(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }
}
