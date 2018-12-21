package mcGregor.application;

import lombok.Data;
import mcGregor.enemy.Enemy;
import mcGregor.peter.Peter;
import mcGregor.weapon.BattleAxe;
import mcGregor.weapon.CuddlyPaws;
import mcGregor.weapon.Sword;

import java.util.Arrays;

@Data
public class Application {

    private static Application INSTANCE;

    private Peter peter;
    private Enemy enemy;

    private Application() {
        this.peter = Peter.builder()
                .weapons(Arrays.asList(
                        new CuddlyPaws(),
                        new Sword(),
                        new BattleAxe()))
                .build();

//		this.enemy = new Enemy("Mr. McGregor", 100);
    }

    public static Application singleton() {

        if (INSTANCE == null) {
            INSTANCE = new Application();
        }
        return INSTANCE;
    }

    public void run() {

//		System.out.println("Oh, no! It's " + this.enemy.getName() + "!");
//		System.out.println();
//
//		int menuOption;
//		boolean keepGoing = true;
//
//		do {
//			displayMenuOptions();
//
//			menuOption = KeyboardInput.singleton().nextInt();
//			KeyboardInput.singleton().nextLine();
//
//			System.out.println();
//
//			keepGoing = determineWhetherToContinue(menuOption, keepGoing);
//		} while (keepGoing);
//
//		System.out.println("Peter ran away!");
//		KeyboardInput.singleton().close();
    }

    private void makePeterFight() {
        this.peter.fight(this.enemy);
    }

    private void displayMenuOptions() {
        System.out.println("What to do?");
        System.out.println(" 1 Fight!");
        System.out.println(" 2 Change weapon (and attack)");
        System.out.println(" 3 Run away");
    }

    private boolean determineWhetherToContinue(int menuOption, boolean keepGoing) {
        switch (menuOption) {
            case 1:
                makePeterFight();
                break;

            case 2:
                this.peter.switchWeapon();
                makePeterFight();
                break;

            case 3:
                keepGoing = false;
                break;

            default:
                System.out.println("Invalid option. Select 1 - 3.");
                System.out.println();
        }
        return keepGoing;
    }
}
