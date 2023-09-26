package Enums;

public enum ActivityEnum {

    Main("Main"),
    First("First"),
    Second("Second"),
    End("End ");

    public final String label;

    ActivityEnum(String label) {
        this.label = label;
    }
}
