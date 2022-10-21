package discriminant;
import org.testng.Assert;
import org.testng.annotations.Test;



public class SolverTest {

    Solver solver=new Solver();
    @Test
    public  void positiveDiscriminant(){
        Assert.assertTrue(solver.solve(1,-4,-5),"Discriminant is not more than zero");

    }
    @Test
    public  void zeroDiscriminant(){

        Assert.assertTrue(solver.solve(3,-18,27),"Discriminant is not zero");

    }
    @Test
    public  void negativeDiscriminant(){

        Assert.assertTrue(solver.solve(3,-4,2), "Discriminant is not less than zero");

    }
}
