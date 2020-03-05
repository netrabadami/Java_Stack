import java.lang.Math;

public class Pythagorean{

    public double calculteHypotenuse(int legA, int legB){
        double squareLegC = (legA * legA) + (legB * legB);
        double squareRoot = Math.sqrt(squareLegC);
        return squareRoot;
    }

}