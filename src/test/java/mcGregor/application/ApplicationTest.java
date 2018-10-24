package mcGregor.application;

import mcGregor.peter.Peter;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.*;

public class ApplicationTest {

    @Test
    public void shouldAlwaysReturnSameInstance() {
        Application firstInvocation = Application.singleton();
        Application secondInvocation = Application.singleton();

        assertThat(firstInvocation, sameInstance(secondInvocation));
    }

    @Test
    public void peterShouldBeInitialized() {
        Peter expectedPeter = new Peter();
        Peter actualPeter = Application.singleton().getPeter();
        assertThat(actualPeter, is(expectedPeter));
    }
}