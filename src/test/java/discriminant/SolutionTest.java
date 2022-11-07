package discriminant;
import org.testng.Assert;
import org.testng.annotations.Test;
import static discriminant.DiscriminantSolver.quadraticEquation;



public class SolutionTest {

    @Test
    public void testSolutionWhenDiscriminantIsLessThanZero() {
        Solution solution = quadraticEquation(3, -4, 2);
        Assert.assertNull(solution, "When discriminant is less than zero,null should be returned");
    }

    @Test
    public void testSolutionWhenDiscriminantIsMoreThanZero() {
        Solution solution = quadraticEquation(1, -4, -5);
        Assert.assertTrue((solution.getX1() == 5), "Roots are incorrect when Discriminant is more than zero");
        Assert.assertTrue((solution.getX2() == -1), "Roots are incorrect when Discriminant is more than zero");
    }

    @Test
    public void testSolutionWhenDiscriminantIsEqualToZero() {
        Solution solution = quadraticEquation(3, -18, 27);
        Assert.assertTrue((solution.getX1() == solution.getX2())," Roots are incorrect when Discriminant is equal to zero");
        Assert.assertEquals(solution.getX1(),3,"Roots are incorrect when Discriminant is equal to zero");
    }






}
