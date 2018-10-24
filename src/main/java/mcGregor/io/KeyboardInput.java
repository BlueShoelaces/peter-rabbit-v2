package mcGregor.io;

import java.util.Scanner;

public class KeyboardInput {

	private static KeyboardInput INSTANCE;
	private Scanner keyboard;

	private KeyboardInput() {
		this.keyboard = new Scanner(System.in);
	}

	public static KeyboardInput singleton() {
		if (INSTANCE == null) {
			INSTANCE = new KeyboardInput();
		}

		return INSTANCE;
	}

	public int nextInt() {
		return this.keyboard.nextInt();
	}

	public String nextLine() {
		return this.keyboard.nextLine();
	}

	public void close() {
		this.keyboard.close();
		INSTANCE = null;
	}
}
