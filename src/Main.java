public class Main {
    public static void main(String[] args) {
        VinniPuxImpl vinniPux = new VinniPuxImpl("Винни-Пух");
        PyatochokImpl pyatochok = new PyatochokImpl("Пяточок");
        RuImpl ru = new RuImpl("Ру");
        TigraImpl tigra = new TigraImpl("Тигра");
        PyatochokImpl.Gelud gelud = new PyatochokImpl.Gelud(2);

        ru.keepQuiet(TimePeriod.NOT_MUCH);
        ru.ask(TimeState.LATER, "");

        tigra.agree(); tigra.ask("А где они");
        ru.answer("Они под " + GrowthStage.TREE.getGrowthStage() + "м");

        tigra.wordSay();
        tigra.think("мы их побережем");
        Decision.decisionMade();

        vinniPux.walk();
        pyatochok.walk();

        vinniPux.readPoetical(pyatochok);
        vinniPux.getFatterRhyme();

        pyatochok.plant(gelud);
        pyatochok.think("скоро"+ gelud.getStage().getGrowthStage() + "вырастет?");

        pyatochok.grabPaw(vinniPux);


    }
}
