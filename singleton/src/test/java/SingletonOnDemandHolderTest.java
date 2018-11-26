import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingletonOnDemandHolderTest {

    @Test
    public void equals() {
        SingletonOnDemandHolder s1 = SingletonOnDemandHolder.getInstance();
        SingletonOnDemandHolder s2 = SingletonOnDemandHolder.getInstance();
        SingletonOnDemandHolder s3 = SingletonOnDemandHolder.SingletonHolder.HOLDER_INSTANCE;
        assertEquals("Ololo", s1, s2);
        assertEquals("Ololo", s2, s3);
        assertEquals("Ololo", s1, s3);
    }
}
