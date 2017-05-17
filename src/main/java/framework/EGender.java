package framework;

public enum EGender {

    BOY("fiú"),
    GIRL("lány");

    private final String text;

    EGender(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    public String getCssClass() {
        return text.equals("fiú") ? "boy" : "girl";
    }
}
