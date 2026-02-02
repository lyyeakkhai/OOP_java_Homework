package supportMethod;

public class ValidatedString {
    private String value;

    public void setValue(String input) {
        if (input != null && input.matches("[A-Za-z]+")) {
            this.value = input;
        } else {
            System.out.println("Invalid format: " + input);
            this.value = "Unknown";
        }
    }

    public String getValue() {
        return value;
    }
}