import java.util.Objects;

class Letter {
    private Characters sender;
    private int priority;
    Letter (Characters sender, int priority) {
        this.sender = sender;
        this.priority = priority;
    }
    @Override
    public String toString() {
        return this.sender.getName();
    }
    @Override
    public boolean equals(Object o) {
        Letter l = (Letter) o;
        return l.priority == this.priority;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sender, priority);
    }
}
