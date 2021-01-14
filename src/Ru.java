public interface Ru {
    void keepQuiet(TimePeriod forHowLong);
    void ask(TimeState when, String whatToAsk);
    void answer(String whatToSay);
}
