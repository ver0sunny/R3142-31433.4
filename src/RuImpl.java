public class RuImpl extends Animal implements Ru {
    public RuImpl(String name) {
        super(name);
    }

    public void keepQuiet(TimePeriod forHowLong) {
        System.out.println(this + " " + forHowLong.gettimePeriod() + " " + "помолчал");
    }

    public void ask(TimeState when, String whatToAsk) {
        System.out.println(this + " " + when.getTimeState() + " " + "спросил" + "\"" + whatToAsk + "?\"");
    }

    public void answer(String whatToSay) {
        System.out.println(this + " " + "ответил" + " " + whatToSay);
    }

}
