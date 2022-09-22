
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pupil
 */
public class JKTV21Temp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperatur C = ");
        String tCstr = scanner.next();
        int tC = Integer.parseInt(tCstr);
        double tF = (tC * 1.8) + 32;
        System.out.println("Temperatur F = " + tF);
    }
    
}
