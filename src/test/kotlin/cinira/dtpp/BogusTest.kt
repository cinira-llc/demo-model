import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BogusTest {

    @Test
    fun doNothing() {
        assertThat(true).isEqualTo(true)
    }
}