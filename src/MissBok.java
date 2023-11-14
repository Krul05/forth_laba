public class MissBok extends Character implements Outgoing, Laughing{
    MissBok(Characters name) {
        super(name);
    }

    @Override
    public void outgoing_action() {
        System.out.println("Фрекен Бок ушла на рынок за салакой");
    }

    @Override
    public void laughing_action() {
        System.out.println("Фрекен Бок смеётся от удовольствия");
    }
}
