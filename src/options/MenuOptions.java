package options;

public enum MenuOptions {

    VIEW_SAVED_NECKLACES("1", "View saved necklaces"),
    DELETE_SAVED_NECKLACES("2", "Delete saved necklaces"),
    CREATE_NEW_NECKLACES("3", "Create new necklaces"),
    CUSTOMIZE_CURRENT_NECKLACE("4", "Customize current necklaces"),
    SAVE_CURRENT_NECKLACE("5", "Save current necklaces"),
    SHOW_SHORT_GUIDE("6", "Show short guides"),
    STOP_PROGRAM("7", "Stop program");


    private final String code;
    private final String description;

    MenuOptions(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}