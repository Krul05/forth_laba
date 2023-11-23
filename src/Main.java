public class Main {
    public static void main(String[] args) {
        MissBok msBok = new MissBok(Characters.MissBok);
        UncleJulius uncleJulius = new UncleJulius(Characters.UncleJulius);
        Junior junior = new Junior(Characters.Junior);
        Carlson carlson = new Carlson(Characters.Carlson);
        Letter letter_from_Betan = new Letter(Characters.Betan);
        Letter letter_from_Bosse = new Letter(Characters.Bosse);
        try {
            letter_from_Bosse.set_priority(1);
            letter_from_Betan.set_priority(1);
        }
        catch (PriorityException ex1) {
            ex1.printStackTrace();
        }

        carlson.suspect();
        carlson.time_of_begining_of_suspicion(msBok);
        carlson.reasons_for_suspicion(uncleJulius, msBok);
        uncleJulius.expelling_action(junior.toString());
        msBok.laughing_action();
        uncleJulius.outgoing_action();
        msBok.outgoing_action();
        carlson.flying_action();
        carlson.drilling();
        if (letter_from_Betan.equals(letter_from_Bosse)) {
            System.out.println(junior + " был очень рад письмам, пришедшим и от Боссе, и от Бетан");
        }
        for (int i = 0; i<=5; i++) {
            if(i%2==0) {
                junior.reading_action(Characters.Bosse);
            } else {
                junior.reading_action(Characters.Betan);
            }
            try {
                carlson.drilling_progress(i);
            }
            catch (ProgressException ex) {
                ex.printStackTrace();
            }
        }

    }
}
