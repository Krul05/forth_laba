public class ProgressException extends RuntimeException {

    public ProgressException() {}
    public ProgressException(double minutes) {
        super("Прогресс сверления завершён!");
    }
}
