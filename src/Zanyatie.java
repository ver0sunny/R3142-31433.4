public enum Zanyatie {
    EAT_HONEY("кушает мёд"),
    EAT_PORRIGE("кушает кашу"),
    EAT_SALAD("кушает салат");

    private final String zanyatie;

    Zanyatie(String zanyatie) { this.zanyatie = zanyatie; }
    public String getZanyatie() { return zanyatie; }
}
