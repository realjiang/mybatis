import com.superj.junit.Calculator;
import org.junit.Test;

/**
 * 测试用例类-手动编写的
 *  1.单独测试某一个方法,在方法名上右键,运行
 *  2.同时测试多个方法,在类名上右键,运行
 */
public class CalculatorTest {
    private Calculator cal = new Calculator();

    /**
     * 测试用例的方法命名约定如下:
     *  1.与原方法保持一致
     *  2. 在原方法前增加test前缀
     */

    @Test
    public void testAdd(){
        int result = cal.add(1, 2);
        System.out.println(result);
    }

    @Test
    public void testSubtract(){
        int result = cal.subtract(1, 2);
        System.out.println(result);
    }

    @Test
    public void testMultiply(){
        int result = cal.multiply(1, 2);
        System.out.println(result);
    }

    @Test
    public void testDivide(){
        float result = cal.divide(1, 2);
        System.out.println(result);
    }
    @Test
    public void testDivide1(){
        float result = cal.divide(1, 0);
        System.out.println(result);
    }
    /**
     * 出现了异常,不代表测试用例一定有问题,要看结果与预期是否相符
     */

}
