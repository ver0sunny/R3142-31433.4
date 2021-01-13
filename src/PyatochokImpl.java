public class PyatochokImpl extends Animal implements Pyatochok {
    public PyatochokImpl(String name) {
        super(name);
    }

    private Gelud gelud;
    private int planted;

    static class Gelud extends Tree {
        public Gelud(int treeage) {
            super(treeage);
        }
    }

    @Override
    public void howOldIsTree(Gelud gelud) {
        if (planted == 1) this.gelud = gelud;
        else System.out.println("я еще не посадился Т_Т");
        if (gelud.getTreeage() < 5) System.out.println("я еще маленький желудь");
        if (gelud.getTreeage() > 5 && gelud.getTreeage() <10) System.out.println("я уже не простой орех, я росток!");
        if (gelud.getTreeage() > 10) System.out.println("я есть дерево");
    }

    @Override
    public void howSoonYouBecomeTree(Gelud gelud) {
        if (planted == 1) this.gelud = gelud;
        else System.out.println("я еще не посадился Т_Т");
        System.out.println(10 - gelud.getTreeage());
    }

    @Override
    public void walk() {
        System.out.println(this + " " + MovingTypes.WALK.getMove());
    }

    @Override
    public void plant(Gelud gelud) {
        planted = 1;
        System.out.println(this + " посадил" + gelud.getStage().getGrowthStage());
    }

    @Override
    public void think(String whatToThink) {
        System.out.println(this + " размышлял " + whatToThink);
    }
}
