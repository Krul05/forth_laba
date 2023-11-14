public class UncleJulius extends Character implements Expelling, Outgoing{
    UncleJulius(Characters name) {
        super(name);
    }

    @Override
    public void expelling_action(String n) {
        System.out.println("Дядя Юлиус прогнал " + n + "а");
    }

    @Override
    public void outgoing_action() {
        System.out.println("Дядя Юлиус ушёл к доктору");
    }
}
