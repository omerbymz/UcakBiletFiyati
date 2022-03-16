import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km , yas;
        int tipi;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi girin: ");
        km = input.nextInt();

        double ucret =  km*(0.10);


        System.out.print("Yolcu yaşı : ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini seçiniz \n1- Tek Yön \n2- Çift Yön olmalıdır. ");
        tipi = input.nextInt();

        if (yas<12){
            if(tipi == 1){
                System.out.print("İndirimli Ücretiniz : " + ucret/2);
            }else if (tipi == 2){
                System.out.println("Yeni Ücretiniz : " + ucret*0.20);
            }else {
                System.out.println("Lütfen Geçerli Bir Değer Giriniz!");
            }
        }

        else if (yas>=12 && yas < 24 ){
            if(tipi == 1){
                System.out.print("İndirimli Ücretiniz : " + ucret*0.90);
            }else if (tipi == 2){
                System.out.println("Yeni Ücretiniz : " + ucret*0.72);
            }else {
                System.out.println("Lütfen Geçerli Bir Değer Giriniz!");
            }
        }

        else if (yas>=24 && yas < 65 ){
            if(tipi == 1){
                System.out.print("Ücretiniz : " + ucret);
            }else if (tipi == 2){
                System.out.println("Yeni Ücretiniz : " + ucret*0.8);
            }else {
                System.out.println("Lütfen Geçerli Bir Değer Giriniz!");
            }
        }

        else if (yas>=65){
            if(tipi == 1){
                System.out.print("İndirimli Ücretiniz : " + ucret*0.7);
            }else if (tipi == 2){
                System.out.print("Yeni Ücretiniz : " + ucret*0.56);
            }
        }
        else {
            System.out.println("Lütfen Geçerli Bir Değer Giriniz!");
        }



    }
}
