package LinearEquations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation solve = new LinearEquation(a, b, c, d, e, f);
        if(solve.IsSolvable()){
            System.out.println("X : " + solve.getX());
            System.out.println("Y : " + solve.getY());
        }
        else {
            System.out.println("The equation has no solution.");
        }
    }
}
