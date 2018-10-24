package mcGregor.application;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mcGregor.enemy.Enemy;
import mcGregor.io.KeyboardInput;
import mcGregor.peter.Peter;
import mcGregor.weapon.BattleAxe;
import mcGregor.weapon.CuddlyPaws;
import mcGregor.weapon.Sword;
import mcGregor.weapon.Weapon;

@Data
public class Application {

	private static Application INSTANCE;

	private Peter peter;
	private Enemy enemy;

	private Application() {
//		final ArrayList<Weapon> weapons = new ArrayList<>();
//		weapons.add(0, new CuddlyPaws());
//		weapons.add(new Sword());
//		weapons.add(new BattleAxe());
//
//		this.peter = new Peter(weapons);
		this.peter = new Peter();
//
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
