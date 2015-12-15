import com.kdo.Application;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.OutputCapture;

/**
 * Created by kdo on 2015-12-14.
 */
public class MainControllerTests {
    @Rule
    public OutputCapture outputCapture = new OutputCapture();

    @Before
    public void init() {
    }

    @After
    public void after() {
    }

    @Test
    public void testHome() throws Exception {
        Application.main(new String[0]);
        String output = this.outputCapture.toString();
    }
}
