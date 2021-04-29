package U4ProgrammingA2;

import java.util.Iterator;

public class Team extends Player implements Actions {

    Player player = new Player();

    public void teamPlayer(String firstName, String lastName, String teamName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.teamName = teamName;
    }

    @Override
    public void setFirstName() {
        player.setFirstName();
    }

    @Override
    public void setLastName() {
        player.setLastName();
    }

    @Override
    public void setTeam() {
        System.out.println("Enter team name");
        this.teamName = InputFactory.SC.next();
    }

    @Override
    public void add() {
        while (ShortStore.listTeam.size() <= 20) {
            setFirstName();
            setLastName();
            setTeam();
            addToArrayList();
        }
        Menu menu = new Menu();
    }

    @Override
    public void addToArrayList() {
        String deats = (player.firstName + "\t" + player.lastName + "\t" + teamName);
        ShortStore.listPlayer.add(deats);
    }

    @Override
    public void view() {
        if (ShortStore.listTeam.isEmpty()) {
            System.out.println("You have no teams");
        }
        for (Iterator<String> iterator = ShortStore.listPlayer.iterator(); iterator.hasNext(); ) {
            String team = iterator.next();
            System.out.println(team);
        }
    }

    @Override
    public void remove() {
        ShortStore.listPlayer.clear();
    }
}
