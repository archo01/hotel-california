package arc.oop.model.chamber.impls;

import arc.oop.model.chamber.interfaces.IChamber;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by initium on 17.03.17.
 */
public class OneBedTest {
    OneBed testOneBed = new OneBed(1
    ,true,true,true,true);

    @Test
    public void getBillAllinclusive() throws Exception {
        int result = testOneBed.getBill();
        Assert.assertEquals(950, result);
    }


    @Test
    public void getBillAllinclusiveJacusiAbsent() throws Exception {
        testOneBed.setJacusi(false);
        int result = testOneBed.getBill();
        Assert.assertEquals(600, result);
    }


}