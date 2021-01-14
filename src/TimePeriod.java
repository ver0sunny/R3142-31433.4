public enum TimePeriod {
    NOT_LONG("недолго"),
    NOT_MUCH("немного");

    private final String timePeriod;

    TimePeriod(String timePeriod) { this.timePeriod = timePeriod; }
    public String gettimePeriod() { return timePeriod; }
}
