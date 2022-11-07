package discriminant;

public class Solution {
    private int x1,x2;

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }
}

class DiscriminantSolver {

    public static Solution quadraticEquation(int a, int b, int c) {


        int discriminant = solveDiscriminant(a, b, c);
        if (discriminant > 0)
            return rootsWhereDiscriminantIsMoreThanZero(discriminant, a, b);
        else if (discriminant == 0)
            return rootsWhereDiscriminantIsEqualToZero(a, b);

        return null; // Discriminant is less than zero
    }

    private static int solveDiscriminant(int a, int b, int c) {
        return (int) (Math.pow(b, 2) - (4 * a * c));
    }

    private static Solution rootsWhereDiscriminantIsMoreThanZero(int d, int a, int b) {
        Solution solution = new Solution();
        int x1;
        int x2;
        x1 = (int) ((-b + Math.sqrt(d)) / (2 * a));
        x2 = (int) ((-b - Math.sqrt(d)) / (2 * a));
        solution.setX1(x1);
        solution.setX2(x2);
        return solution;
    }

    private static Solution rootsWhereDiscriminantIsEqualToZero(int a, int b) {
        Solution solution = new Solution();
        int x;
        x = -b / (2 * a);
        solution.setX1(x);
        solution.setX2(x);
        return solution;
    }
}
