package U4ProgrammingA2;

import static U4ProgrammingA2.InputFactory.SC;

public class Menu {

    private String sInput;

    public Menu() {
        int iInput;
        Player player = new Player();
        Team team = new Team();
        do {
            System.out.println("Select from the following:\n" + "1. Add Player         \t4. Add Team\n" + "2. View Player       \t5. View Team\n" + "3. Delete Player    \t6. Delete Team\n" + "7. Create Tournament" + "0. Exit\n");
            while (!InputFactory.SC.hasNextInt()) {
                System.out.println("Whole numbers only");
                InputFactory.SC.next();
            }
            iInput = InputFactory.SC.nextInt();
            if (iInput == 1) {
                player.add();
                break;
            } else if (iInput == 2) {
                player.view();
                break;
            } else if (iInput == 3) {
                player.remove();
                break;
            } else if (iInput == 4) {
                team.add();
                break;
            } else if (iInput == 5) {
                team.view();
                break;
            } else if (iInput == 6) {
                team.remove();
                break;
            }
        } while (iInput != 0);
    }

    public static void eventType() {
        int iInput;
        do {
            System.out.println("One event or Five\n" + "1. One Event\n" + "2. Five Events");
            iInput = SC.nextInt();
            while (!InputFactory.SC.hasNextInt()) {
                System.out.println("Must be 1 or 2");
                InputFactory.SC.next();
            }
        } while (iInput < 0 || iInput > 2);
        if (iInput != 1) {
            Event.singleOrFiveEvents = 5;
        }
        individualOrTeam();
    }

    public static void individualOrTeam() {
        int iInput;
        do {
            System.out.println("One event or Five\n" + "1. individual\n" + "2. team");
            iInput = SC.nextInt();
            while (!InputFactory.SC.hasNextInt()) {
                System.out.println("Must be 1 or 2");
                InputFactory.SC.next();
            }
        } while (iInput < 0 || iInput > 2);
        if (iInput != 2) {
            Event.singleOrFiveEvents = 2;
        }
        sportingOrAcademic();
    }

    public static void sportingOrAcademic() {
        int iInput;
        do {
            System.out.println("One event or Five\n" + "1. sporting\n" + "2. academic");
            iInput = SC.nextInt();
            while (!InputFactory.SC.hasNextInt()) {
                System.out.println("Must be 1 or 2");
                InputFactory.SC.next();
            }
        } while (iInput < 0 || iInput > 2);
        if (iInput != 2) {
            Event.sportingOrAcademic = 2;
        }
    }

    public static String collate() {
        return "";
    }
}
