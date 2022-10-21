package discriminant;

public class Solver {

  private int a;
  private int b;
  private int c;

    public boolean solve(int a,int b,int c){

        this.a = a;
        this.b = b;
        this.c = c;

      int D = b * b - 4 * a * c;

        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            return x1 != x2;
        }
        else if (D == 0) {
            double x1, x2;
            x1 = -b / (2 * a);
            x2 = -b / (2 * a);
            return x1 == x2;
        }
        else {
             return null == null;

        }


    }

}
