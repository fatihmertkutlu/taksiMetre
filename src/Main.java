import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km,StartPrice = 10;
        double perKm = 2.20,total;
        Scanner input =new Scanner(System.in);
        System.out.println("Açılıs Ücreti 10 TL");
        System.out.print("Gitmek istediğiniz KM'yi giriniz : ");
        km = input.nextInt();
        total = perKm * km;
        total += StartPrice;
        total = (total<20) ? 20 : total;
        System.out.println("Ödemeniz Gereken Ücret : "+total);
    }
}