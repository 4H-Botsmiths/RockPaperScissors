public enum Move {
    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors");

    private final String value;

    Move(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }
}
