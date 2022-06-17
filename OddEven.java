import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("masukkan angka: ");
        int number = inputUser.nextInt();
        System.out.println("Bilangan ganjil: ");
        for (int i =1;i<=number;i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
        System.out.println("Bilangan genap: ");
        for (int i =1;i<=number;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
