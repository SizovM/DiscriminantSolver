package discriminant;

public class Solution {
    private double x1,x2;

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }
}

class DiscriminantSolver {

    public static Solution quadraticEquation(double a, double b, double c) {


        double discriminant = solveDiscriminant(a, b, c);
        if (discriminant > 0)
            return rootsWhereDiscriminantIsMoreThanZero(discriminant, a, b);
        else if (discriminant == 0)
            return rootsWhereDiscriminantIsEqualToZero(a, b);

        return null; // Discriminant is less than zero
    }

    private static double solveDiscriminant(double a, double b, double c) {
        return Math.pow(b, 2) - (4 * a * c);
    }

    private static Solution rootsWhereDiscriminantIsMoreThanZero(double d, double a, double b) {
        Solution solution = new Solution();
        double x1;
        double x2;
        x1 = (-b + Math.sqrt(d)) / (2 * a);
        x2 = (-b - Math.sqrt(d)) / (2 * a);
        solution.setX1(x1);
        solution.setX2(x2);
        return solution;
    }

    private static Solution rootsWhereDiscriminantIsEqualToZero(double a, double b) {
        Solution solution = new Solution();
        double x;
        x = -b / (2 * a);
        solution.setX1(x);
        solution.setX2(x);
        return solution;
    }
}
