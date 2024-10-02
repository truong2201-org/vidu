import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("nhap vao thang de hien thị mua ");
//
//        int n= new Scanner(System.in).nextInt();
//
//            switch (n) {
//                case 1:
//                case 2:
//                case 12:
//                    System.out.printf("muaxuan");
//                    break;
//                case 3:
//                case 4:
//                case 5:
//                    System.out.printf("muahe");
//                    break;
//                case 6:
//                case 8:
//                case 7:
//                    System.out.printf("muathu");
//                    break;
//                case 9:
//                case 10:
//                case 11:
//                    System.out.printf("muadong");
//                    break;
//                default:
//                    System.out.printf("nhap qua 12 thang");
//                    break;
//            }
//
//
//
//        System.out.printf(" nhap vao so n ");
//
//        int n = new Scanner(System.in).nextInt();
//        while (n < 0) {
//            System.out.printf(" nhap vao so n ");
//
//            n = new Scanner(System.in).nextInt();
//        }
//// tong cac so
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
//        System.out.printf("\n sum= " + sum);
//        // tong cac so chan
//        int sum1 = 0;
//        int i = 0;
//        do {
//            sum1 += i;
//            i += 2;
//        } while (i <= n);
//        System.out.printf(" \n sum1 = " + sum1);
//        // tong cac so nguyen to
//        int tong = 0;
//        for (int j = 1; j <= n; j++) {
//            if (j == 1)
//                continue;
//            if (j <= 3) {
//                System.out.printf("\n so nguyen to : " + j);
//                tong += j;
//            } else {
//                if (kt(j)) {
//                    System.out.printf("\n so nguyen to : " + j);
//                    tong += j;
//                }
//            }
//        }
//        System.out.printf("\n tong cac so nguyen to la : " + tong);
//    }
//
//    public static boolean kt(int j) {
//        for (int i = 2; i < j; i++) {
//            if (j % i == 0) {
//                return false;
//            }
//        }
//        return true;
        System.out.printf(" nhap so a : ");
        int a=new Scanner(System.in).nextInt();
        System.out.printf(" nhap so b : ");
        int b=new Scanner(System.in).nextInt();
        System.out.printf(" nhap so c : ");
        int c=new Scanner(System.in).nextInt();
        if(a>b&&a>c){
            System.out.printf("a la so lon nhat : "+a);
        }
        if(c>b&&c>a){
            System.out.printf("c la so lon nhat : "+c);
        }
        if(b>a&&b>c){
            System.out.printf("b la so lon nhat : "+b);
        }

   }
}

