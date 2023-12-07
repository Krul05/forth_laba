public class Carlson extends Character implements Drilling, Flying, Suspect {
    Carlson (Characters name) {
        super(name);
    }

    @Override
    public void flying_action() {
        System.out.println("Карлсон влетел в комнату с дрелью в руках");
    }
    public static class Drill {
        public void description() {
            System.out.println("Дрель, которую притащил " + name.getName() + ", раньше висела на стене в домике на крыше");
        }
    }
    @Override
    public void drilling() {
        System.out.println("Карлсон сверлит стену");
    }

    @Override
    public void drilling_progress(double minutes) {
        if (minutes>5) throw new ProgressException(minutes);
        if (minutes<5) {
            System.out.println("Прогресс сверления завершён на " + minutes / 5 * 100 + "%");
        } else if(minutes==5) {
            System.out.println("Прогресс сверления завершён!");
        }
    }
    @Override
    public void suspect(){
        System.out.println("У Карлсона возникли подозрения");
    }

    @Override
    public void reasons_for_suspicion(UncleJulius uncleJulius, MissBok msBok) {
        Useless useless = new Useless() {
            public void useless() {
                System.out.println("Дело в том, что этой раздвижной дверью у Свантесонов никогда не пользовались, а гостиную от прихожей отделяли только занавески");
            }
        };
        useless.useless();
        System.out.println("Но вот теперь, когда фрекен Бок и " + uncleJulius + " по вечерам пили кофе в гостиной, " + msBok.close());
        class Children {
            private boolean is_run_in;
            public Characters character;
            Children(Characters character) {
                this.character = character;
            }
            public void set_is_run_in(boolean is_run_in) {
                this.is_run_in = is_run_in;
            }
            public boolean get_is_run_in() {
                return this.is_run_in;
            }
            public Characters get_character() {
                return this.character;
            }
        }
        Children carlson = new Children(Characters.Carlson);
        carlson.set_is_run_in(true);
        if (carlson.get_is_run_in() && carlson.get_character()==Characters.Carlson) {
            System.out.println("А если в комнату забегал Карлсон, дядя Юлиус отсылал его, говоря, что дети должны играть в другом месте, а они хотят спокойно, в тишине выпить кофе.");
        }
    }

    @Override
    public void time_of_begining_of_suspicion(MissBok msBok){
        System.out.println("С того самого дня, как " + msBok.close() + " в гостиной");
    }
}
