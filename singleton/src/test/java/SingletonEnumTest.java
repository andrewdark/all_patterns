import org.junit.Assert;
import org.junit.Test;

public class SingletonEnumTest {

    @Test
    public void equals(){
        SingletonEnum s1 = SingletonEnum.INSTANCE;
        SingletonEnum s2 = SingletonEnum.INSTANCE;
        Assert.assertEquals(s1,s2);
    }
}
