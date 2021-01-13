public enum MovingTypes {
    WALK("продолжал прогулку"),
    RUN("побежал"),
    STOP_AND_STAY_STILL("остановился");

    private final String move;

    MovingTypes(String move) { this.move = move; }
    public String getMove() {return move;}
}
