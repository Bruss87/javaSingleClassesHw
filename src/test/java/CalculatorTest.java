import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    private Calculator myMachine;

    @Before
    public void before(){ myMachine = new Calculator(75, 15); }

    @Test
    public void addsNum(){ assertEquals(90, myMachine.addNum());}

    @Test
    public void substractsNum(){ assertEquals(60, myMachine.substractNum());}

    @Test
    public void multipliesNum(){ assertEquals(1125, myMachine.multiplyNum());}

    @Test
    public void dividesNum(){ assertEquals(5, myMachine.divideNum(), 0.01);}



}
