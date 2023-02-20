/*
* File: Beker.java
* Author: Kondor Marcell
* Copyright: 2023, Kondor Marcell
* Group: Szoft 1/n
* Date: 2023-02-20
* Github: https://github.com/Kotkodaa/doga1.git
*/
import java.util.Scanner;

public class Beker {
    
    public Beker() {
        feladat0354();
    }

    public static void feladat0354() {
        System.out.println("Készítette: Kondor Marcell, Szoft 1/n, 2023.02.20");
        System.out.println("0354 megoldás");
        System.out.println("Telek területe");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Oldal a: ");
        double side_a = Double.parseDouble(scanner.nextLine());
        System.out.print("oldal b: ");
        double side_b = Double.parseDouble(scanner.nextLine());
        scanner.close();
        double terulet = Egyenlet.calcterulet(side_a, side_b);
        System.out.println("a terület: " + terulet);
    }
}

