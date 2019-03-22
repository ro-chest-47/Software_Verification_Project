import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class ClockTest {

    Clock clock = new Clock();

    @Test
    @DisplayName("Check If Time Exceeded")
    void timecheck() {
        assertTimeout(ofMillis(100), ()->clock.ticking());
        assertTimeout(ofMillis(100), ()->clock.alarming());
        assertTimeout(ofMillis(100), ()->clock.broken());
    }

}