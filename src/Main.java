public class Main {
    public static void main(String[] args) {
        VinniPuxImpl vinniPux = new VinniPuxImpl("Винни-Пух");
        PyatochokImpl pyatochok = new PyatochokImpl("Пяточок");
        RuImpl ru = new RuImpl("Ру");
        TigraImpl tigra = new TigraImpl("Тигра");
        PyatochokImpl.Gelud gelud = new PyatochokImpl.Gelud(2);

        ru.keepQuiet(TimePeriod.NOT_MUCH);
        ru.ask(TimeState.LATER, "А можно, мы съедим бутерброды");

        tigra.agree(); tigra.ask("А где они");
        ru.answer("Они под " + GrowthStage.TREE.getGrowthStage() + "м");

        tigra.wordSay();
        tigra.think("мы их побережем");
//        ru.attemptsToEatButerBrodik();
        Decision.decisionMade();

        vinniPux.walk();
        pyatochok.walk();

        vinniPux.readPoetical(pyatochok);
        vinniPux.getFatterRhyme();

        pyatochok.plant(gelud);
        pyatochok.think("скоро"+ " " + gelud.getStage().getGrowthStage() + " " + "вырастет?");

//        pyatochok.grabPaw(vinniPux);
        try {
            pyatochok.calmDowm(vinniPux);
        } catch (CantCalmDownException e) {
            System.out.println(e.getMessage());
        }

        ru.skazal();

        Bees bees = new Bees() {
            public void buzz() {
                System.out.println("         _  _\n" +
                        "        | )/ )\n" +
                        "     \\\\ |//,' __\n" +
                        "     (\")(_)-\"()))=-\n" +
                        "        (\\\\" + "            bzžzz~bzżzž~bzz");
            }
        };

        bees.buzz();
    }
}
