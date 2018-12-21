package mcGregor.application;

import mcGregor.peter.Peter;
import mcGregor.weapon.BattleAxe;
import mcGregor.weapon.CuddlyPaws;
import mcGregor.weapon.Sword;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class ApplicationTest {

    @Test
    public void shouldAlwaysReturnSameInstance() {
        Application firstInvocation = Application.singleton();
        Application secondInvocation = Application.singleton();

        assertThat(firstInvocation, sameInstance(secondInvocation));
    }

    @Test
    public void peterStartsWithCuddlyPaws() {
        Peter actualPeter = Application.singleton().getPeter();
        assertTrue(actualPeter.getWeapons().contains(new CuddlyPaws()));
    }

    @Test
    public void peterStartsWithSword() {
        Peter actualPeter = Application.singleton().getPeter();
        assertTrue(actualPeter.getWeapons().contains(new Sword()));
    }

    @Test
    public void peterStartsWithBattleAxe() {
        Peter actualPeter = Application.singleton().getPeter();
        assertTrue(actualPeter.getWeapons().contains(new BattleAxe()));
    }
}