import java.util.*;

public class JavaTugasSr {
    public static void main(String[] args) {

        // a % 2 == 0 genap

        int input;
        boolean isTrue = false;
        Scanner user = new Scanner(System.in);
        

        do {
            try {
                System.out.println("Masukkan angka -->");
                input = user.nextInt();
                if (input % 2 == 0) {
                    System.out.println(input + " Adalah Bilangan Genap");
                 
                } else {
                    System.out.println(input + " Adalah Bilangan Ganjil");
                }
                isTrue = false;
            } catch (Exception e) {
                System.out.println("Dilarang memasukkan huruf !");
                user.next();
                isTrue = true;
            }
        } while (isTrue);

    }
}
