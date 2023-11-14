public class Carlson extends Character implements Drilling, Flying {
    Carlson (Characters name) {
        super(name);
    }

    @Override
    public void flying_action() {
        System.out.println("Карлсон влетел в комнату");
    }

    @Override
    public void drilling() {
        System.out.println("Карлсон сверлит стену");
    }

    @Override
    public void drilling_progress(double minutes) {
        if(minutes<5) {
            System.out.println("Прогресс сверления завершён на " + minutes / 5 * 100 + "%");
        } else {
            System.out.println("Прогресс сверления завершён!");
        }
    }
}
