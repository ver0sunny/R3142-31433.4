public class TigraImpl extends Animal implements Tigra {
    public TigraImpl(String name) {
        super(name);
    }

    public void think(String whatToThink) {
        System.out.println("думаю" + " " + whatToThink);
    }

    public void ask(String whatToAsk) {
        System.out.println("\"" + whatToAsk + "?\"" + " " + "спросил" + " " + this);
    }

    public void agree() {
        System.out.print("ДАВАЙ! ");
    }
}
