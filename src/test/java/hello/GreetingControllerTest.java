package hello;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class GreetingControllerTest {

	@Test
	public void greeting_Sean() {
    GreetingController c = new GreetingController();

    assertThat(c.greeting("Sean").getContent(), equalTo("Hello, Sean"));
	}
}
