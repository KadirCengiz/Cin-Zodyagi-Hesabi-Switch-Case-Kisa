import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenlerin tanımlanması.

        int dogumyili,sonuc;
        String zodYagi = "";

        //Bilgi girişi yapılma işlemi.

        Scanner input=new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        dogumyili=input.nextInt();

        //Çin Zodyağı burcu karşılaştırma işlemi.

        sonuc=dogumyili%12;

        switch(sonuc){

            case 0:
                zodYagi="Maymun";
                break;

            case 1:
                zodYagi="Horoz";
                break;

            case 2:
                zodYagi="Köpek";
                break;

            case 3:
                zodYagi="Domuz";
                break;

            case 4:
                zodYagi="Fare";
                break;

            case 5:
                zodYagi="Öküz";
                break;

            case 6:
                zodYagi="Kaplan";
                break;

            case 7:
                zodYagi="Tavşan";
                break;

            case 8:
                zodYagi="Ejderha";
                break;

            case 9:
                zodYagi="Yılan";
                break;

            case 10:
                zodYagi="At";
                break;

            case 11:
                zodYagi="Koyun";
                break;
        }

        //Çin Zodyağı burcu sonucu yazdırma işlemi.

        System.out.println("Çin zodyağı burcunuz: "+zodYagi);

    }
}