public class Progulka {
    private String flag;
    public Progulka() {
    }
    public void continueProgulka() { flag = "прогулка продолжается"; }

    public void stopProgulka() {
        flag = "прогулка закончилась";
    }

    public void cutProgulka() {
        flag = "прогулка прервалась";
    }

    public void startProgulka() {
        flag = "начало прогулки";
    }

    public void getProgulkaState() {
        if (flag==null) System.out.println("прогулки никогда и не было...");
        else System.out.println(flag);
    }
}
