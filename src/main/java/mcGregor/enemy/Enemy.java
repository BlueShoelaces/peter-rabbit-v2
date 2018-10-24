package mcGregor.enemy;

public class Enemy {

	private String name;
	private double currentHealth;
	private double maxHealth;

	public Enemy(String name, double maxHealth) {

		this.name = name;

		this.maxHealth = maxHealth;
		this.currentHealth = maxHealth;
	}

	public void takeDamage(double damageTaken) {
		System.out.printf("%s takes %.1f damage.\n", this.name, damageTaken);
		System.out.println();

		this.currentHealth -= damageTaken;

		if (this.currentHealth <= 0) {
			System.out.println("" + this.name + " was slain... but miraculously recovered!");
			System.out.println();
			this.currentHealth = this.maxHealth;
		}

		System.out.printf("%s's health: %.1f\n", this.name, this.currentHealth);
		System.out.println();
	}

	public String getName() {
		return this.name;
	}
}
