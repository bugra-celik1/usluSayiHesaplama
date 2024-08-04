import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x,y;
        System.out.print("Üssü alınacak sayıyı giriniz:");
        x = inp.nextInt();
        System.out.print("Üssü giriniz:");
        y = inp.nextInt();
        int total=1;

        for(int i=1;i<=y ;i++){
            total *= x;
        }
        System.out.println("Sonuç:" +total);


    }
}