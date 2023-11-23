public class PriorityException extends Exception{
    public PriorityException() {}
    public PriorityException(int priority) {
        super("Приоритет не может быть ниже нуля");
    }
}