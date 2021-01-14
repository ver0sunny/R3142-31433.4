public class ButerBrodik {
    ButerBrodik() {
    }
    public Insides insides = new Insides();
    public Bread bread = new Bread();

    public enum BreadType {
        WHITE,
        DARK;
    }
}
    class Insides {
        public void stuff() {
            System.out.println("запихать начинку в бутербродики");
        }
    }
    class Bread {
        ButerBrodik.BreadType breadType = ButerBrodik.BreadType.WHITE;
        public void choose(ButerBrodik.BreadType breadType) {
            System.out.println("выбранный тип хлеба: " + breadType);
        }
    }


