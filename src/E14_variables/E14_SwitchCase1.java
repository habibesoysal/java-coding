package E14_variables;

import java.util.Scanner;

public class E14_SwitchCase1 {
    public static void main(String[] args) {
        // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütden 3 basamaklı bir sayı giriniz");
        int sayi=scan.nextInt();

        int birlerBas=sayi%10, onlarBas=(sayi/10)%10, yüzlerBas=sayi/100;
        if (sayi>99 && sayi<1000){
            switch (yüzlerBas) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("yüz\t");
                    break;
                case 2:
                    System.out.println("ikiyüz\t");
                    break;
                case 3:
                    System.out.println("ücyüz\t");
                    break;
                case 4:
                    System.out.println("dörtyüz\t");
                    break;
                case 5:
                    System.out.println("besyüz\t");
                    break;
                case 6:
                    System.out.println("altıyüz\t");
                    break;
                case 7:
                    System.out.println("yediyüz\t");
                    break;
                case 8:
                    System.out.println("sekizyüz\t");
                    break;
                case 9:
                    System.out.println("dokuzyüz\t");
                    break;

            }switch (onlarBas){
                    case 0: System.out.println("");break;
                    case 1: System.out.println("on\t");break;
                    case 2: System.out.println("yirmi\t");break;
                    case 3: System.out.println("otuz\t");break;
                    case 4: System.out.println("kırk\t");break;
                    case 5: System.out.println("elli\t");break;
                    case 6: System.out.println("altmış\t");break;
                    case 7: System.out.println("yetmiş\t");break;
                    case 8: System.out.println("seksen\t");break;
                    case 9: System.out.println("doksan\t");break;

            }switch (birlerBas){
                    case 0: System.out.println("");break;
                    case 1: System.out.println("bir\t");break;
                    case 2: System.out.println("iki\t");break;
                    case 3: System.out.println("üç\t");break;
                    case 4: System.out.println("dört\t");break;
                    case 5: System.out.println("bes\t");break;
                    case 6: System.out.println("altı\t");break;
                    case 7: System.out.println("yedi\t");break;
                    case 8: System.out.println("sekiz\t");break;
                    case 9: System.out.println("dokuz\t");break;

                }
        }
    }
}