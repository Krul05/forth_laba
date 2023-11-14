import java.util.Objects;

abstract class Character {
    protected Characters name;
    Character (Characters name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name.getName();
    }
    @Override
    public boolean equals(Object o) {
        Character ch = (Character) o;
        return ch.name == this.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
