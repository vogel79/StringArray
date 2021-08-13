package exception;

public class MyArraySizeException extends Exception {
    private final String message;

    public MyArraySizeException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
