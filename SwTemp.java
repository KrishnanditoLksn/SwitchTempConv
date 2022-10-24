
import java.util.Scanner;
public class suhusuhu {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        int pil;
        double celcius, reamur  ,fahrenheit ;

        System.out.println("Program Konversi Suhu ");
        System.out.println("Namna : Emmanuel Krishnandito Laksana ");
        System.out.println("NIM : 225314024");

        System.out.println("Pilihan : ");
        System.out.println("1. Celcius ");
        System.out.println("2. Reamur ");
        System.out.println("3. Fahrenheit ");

        System.out.println("Pilih ? ");
        pil= input.nextInt();

        switch(pil){
            case(1):
                System.out.println("Masukkan suhu celcius ");
                celcius= input.nextDouble();
                reamur=(4.0 / 5.0 ) * celcius;
                fahrenheit=(9.0 /5.0) * celcius + 32;
                System.out.println("Suhu Reamur : " + reamur);
                System.out.println("Suhu Fahrenheit : " + fahrenheit);
                break;

            case(2):
                System.out.println("Masukkan suhu Reamur ");
                reamur= input.nextDouble();
                celcius=(5.0 /4.0) * reamur;
                fahrenheit=(9.0 /4.0) * reamur + 32;
                System.out.println(celcius);
                System.out.println(fahrenheit);
                break;

            case(3):
                System.out.println("Masukkan suhu Fahrenheit ");
                fahrenheit= input.nextDouble();
                celcius=(5.0/9.0)* (fahrenheit-32);
                reamur=(4.0/9.0) * (fahrenheit-32);
                System.out.println(celcius);
                System.out.println(reamur);
                break;

            default:
                System.out.println("Anda salah masukin wkwkwkwkw ");
        }


    }


}
