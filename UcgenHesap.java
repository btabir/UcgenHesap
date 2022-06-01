package Hesaplamalar;

import java.util.Scanner;

public class UcgenHesap {
    public static void main(String[] args) {

        double a,b,c,u,alan;

        Scanner input=new Scanner(System.in);

       /* Bu kisimda hipotenüs bulma formülü var

        System.out.println("Ucgenin A Kenarini Giriniz : " );
        a = input.nextDouble();

        System.out.println("Ucgenin B Kenarini Giriniz : ");
        b = input.nextDouble();

        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Ucgenin C Kenari : "+ c);
        */

        System.out.println("Ucgenin A Kenarini Giriniz");
        a = input.nextDouble();

        System.out.println("Ucgenin B Kenarini Giriniz");
        b = input.nextDouble();

        System.out.println("Ucgenin C Kenarini Giriniz");
        c= input.nextDouble();

        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Ucgenin Alani : "+alan);







    }


}
