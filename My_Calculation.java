/**
 * Created by maxalekhnovich on 6/15/17.
 */

class Calculation{
    int z;

    public void addition(int x, int y){
        z = x + y;
        System.out.println("The sum of the given numbers:"+z);
    }

    public void Subtration(int x, int y){
        z  = x - y;
        System.out.println("The difference between the given numbers:"+z);
    }

    public void division(int x, int y){
        float d = x/y;
        System.out.println("The quotient is "+d);
    }
}



public class My_Calculation extends Calculation {
    public void multiplication(int x, int y){
        z = x*y;
        System.out.println("The product of the given numbers:"+z);
    }
    public static void main(String[]args){
        int a =20, b =10;
        My_Calculation demo = new My_Calculation();
        demo.addition(a,b);
        demo.Subtration(a,b);
        demo.multiplication(a,b);
        demo.division(a,b);
    }
}
