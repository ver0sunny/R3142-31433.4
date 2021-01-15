public class RuImpl extends Animal implements Ru {
    public RuImpl(String name) {
        super(name);
    }

    public void keepQuiet(TimePeriod forHowLong) {
        System.out.println(this + " " + forHowLong.gettimePeriod() + " " + "помолчал");
    }

    public void ask(TimeState when, String whatToAsk) {
        System.out.println(this + " " + when.getTimeState() + " " + "спросил: " + "\"" + whatToAsk + "?\"");
    }

    public void answer(String whatToSay) {
        System.out.println(this + " " + "ответил" + " " + "\"" + whatToSay + "\"");
    }

    public void attemptsToEatButerBrodik() throws ButerBrodikAlmostEatenException {
        if (Math.random()<0.5)
            throw new ButerBrodikAlmostEatenException("произошло непоправимое... БУТЕРБРОДИК ПОПЫТАЛИСЬ СЪЕСТЬ!!!");
        else {
            System.out.println("У " + this + " не вышло откусить бутербродик. Тигра вовремя заметил происходящее. Бутерброд в остался в целости и сохранности!");
        }
    }

    public void skazal() {
        class Sova {
             String name;
             Sova(String name) {this.name = name;}
             String fly() {
                return "летать";
            }
            String getName() {
                 return name;
            }
        }
        Sova sova = new Sova("Совы");
        System.out.println(this + " сказал: " + "А они могут " + sova.fly() + " не хуже " + sova.getName() + "?");
    }
}
