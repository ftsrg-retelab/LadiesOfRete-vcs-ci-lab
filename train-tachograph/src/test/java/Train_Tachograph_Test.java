import hu.bme.mit.train_tachograph.Train_Tachograph;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Train_Tachograph_Test {
    Train_Tachograph tacho;
    @Before
    public void before() {
    tacho=new Train_Tachograph();
    tacho.addElement();
    }

    @Test
    public void HasElement() {
        Assert.assertEquals(true,tacho.HasElements());
    }
}
