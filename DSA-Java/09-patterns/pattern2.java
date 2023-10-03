import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int N = sc.nextInt();

        for(int i=0; i<=N; i++) {
            for(int j=0; j<=N; j++) {
                if(j<=i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}