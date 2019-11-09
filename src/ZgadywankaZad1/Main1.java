package ZgadywankaZad1;

import java.util.Random;
import java.util.Scanner;

/*
Napisz prostą grę w zgadywanie liczb. Komputer ma wylosować liczbę w zakresie od 1 do 100.
Następnie:
1. wypisać: "Zgadnij liczbę" i pobrać liczbę z klawiatury;
2. sprawdzić, czy wprowadzony napis, to rzeczywiście liczba i w razie błędu wyświetlić komunikat: "To
nie jest liczba", po czym wrócić do pkt. 1;
3. jeśli liczba podana przez użytkownika jest mniejsza niż wylosowana, wyświetlić komunikat: "Za
mało!", po czym wrócić do pkt. 1;
4. jeśli liczba podana przez użytkownika jest większa niż wylosowana, wyświetlić komunikat: "Za
dużo!", po czym wrócić do pkt. 1;
5. jeśli liczba podana przez użytkownika jest równa wylosowanej, wyświetlić komunikat: "Zgadłeś!",
po czym zakończyć działanie programu.
 */
public class Main1 {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int number;
        int shot = 0;
        int count = 0;
        Random rand = new Random();
        System.out.print("Zgadnij jaka liczbę wylosował komputer: ");
        number = rand.nextInt(100)+1;
        while(number != shot){
            shot = scr.nextInt();
            count++;
            if(shot < number){
                System.out.println("To za mało.");
            }
            else if(shot > number){
                System.out.println("To za dużo");
            }
            else{
                System.out.println("Gratulacje zgadłeś(aś) za "+count+" razem");
            }
        }
    }
}
