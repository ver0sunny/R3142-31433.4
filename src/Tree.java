public class Tree {
    private int treeage;
    private GrowthStage stage;

    public Tree(int treeage) {
        this.treeage = treeage;
        if (treeage<5)
            this.stage = GrowthStage.NUTSEED;
        if (treeage>5 && treeage<10)
            this.stage = GrowthStage.SPROUT;
        if (treeage>10)
            this.stage = GrowthStage.TREE;
    }

    public int getTreeage() { return treeage;}
    public final GrowthStage getStage() { return this.stage; }
}
