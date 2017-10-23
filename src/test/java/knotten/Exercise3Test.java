import org.junit.Test;
import static org.junit.Assert.*;

import knotten.Exercise3;

public class Exercise3Test{

    @Test
    public void testTriangle0(){
	assertEquals(Exercise3.triangle(0), 0);
    }

    @Test
    public void testTriangle3(){
	assertEquals(Exercise3.triangle(3), 6);
    }

    @Test
    public void testTriangle10(){
	assertEquals(Exercise3.triangle(10), 55);
    }

    @Test
    public void testLazy0(){
	assertEquals(Exercise3.lazy(0), 1);
    }

    @Test
    public void testLazy3(){
	assertEquals(Exercise3.lazy(3), 7);
    }

    @Test
    public void testLazy10(){
	assertEquals(Exercise3.lazy(10), 56);
    }
}
