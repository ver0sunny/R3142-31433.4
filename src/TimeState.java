public enum TimeState {
    NOW("сейчас"),
    LATER("потом");

    private final String timeState;
    TimeState(String timeState) {this.timeState = timeState;}
    public String getTimeState() {return timeState;}
}
