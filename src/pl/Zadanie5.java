package pl;

import java.util.Scanner;

public class Zadanie5 {

    public static void deltaZero(double a, double b){
        double x;
        x=-b/(2*a);
        System.out.println("x = "+x);
    } //ta metoda liczy miejsce zerowe, kiedy delta = 0

    public static void deltaPositive(double a, double b, double delta){
        double x1, x2;
        x1 = (-b - Math.sqrt(delta))/(2*a);
        x2 = (-b + Math.sqrt(delta))/(2*a);
        System.out.println("x1 = "+x1+" x2 = "+x2);
    } //ta metoda liczy miejsca zerowe dla dodatniej delty

    public static void main(String[] args) {

        double a, b, c, delta;
        Scanner scan = new Scanner(System.in);
        System.out.print("a: ");
        a=scan.nextDouble();
        System.out.print("b: ");
        b=scan.nextDouble();
        System.out.print("c: ");
        c=scan.nextDouble();
        delta=Math.pow(b,2)-4*a*c;

        if (delta==0){
            deltaZero(a,b);
        }
        else if (delta>0){
            deltaPositive(a,b,delta);
        }
        else System.out.println("Brak rozwiązań, delta ujemna");
        //program pobiera od użytkownika wartości a,b i c, a następnie wyświetla wynik równania kwadratowego
        // lub komunikat o braku rozwiązań
    }
}
