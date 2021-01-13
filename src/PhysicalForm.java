public enum PhysicalForm {
    DEFAULT("обычный, как и все"),
    FAT("толстый"),
    THIN("худой");

    private final String physicalForm;

    PhysicalForm(String physicalForm) {
        this.physicalForm = physicalForm;
    }

    public String getPhysicalForm() {
        return physicalForm;
    }
}
