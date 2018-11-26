import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingletonDoubleCheckedLockingTest {

    @Test
    public void equals(){
        SingletonDoubleCheckedLocking s1 = SingletonDoubleCheckedLocking.getInstance();
        SingletonDoubleCheckedLocking s2 = SingletonDoubleCheckedLocking.getInstance();

        assertEquals(s1,s2);
    }
}
