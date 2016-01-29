import org.junit.Test;
import org.junit.runner.RunWith;
import org.unitils.UnitilsJUnit4TestClassRunner;
import org.unitils.testlink.annotation.TestLink;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by kenichiro_ota on 2016/01/28.
 */
@RunWith(UnitilsJUnit4TestClassRunner.class)
public class TestLinkIntegrationTest {
    @TestLink(value="junit-1")
    @Test
    public void createTodoList() throws Exception {
        assertThat(true, is(true));
    }

    @TestLink(value="junit-2")
    @Test
    public void readTodoList() throws Exception {
        assertThat(true, is(true));
    }

    @TestLink(value="junit-3")
    @Test
    public void updateTodoList() throws Exception {
        assertThat(false, is(true));
    }

    @TestLink(value="junit-4")
    @Test
    public void deleteTodoList() throws Exception {
        assertThat(true, is(true));
    }

}
