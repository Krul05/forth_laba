public class Junior extends Character implements Reading{
    Junior(Characters name) {
        super(name);
    }
    @Override
    public void reading_action(Characters sender) {
        System.out.println("Малыш читает письмо от " + sender.getName());
    }

}
