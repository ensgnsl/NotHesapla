import java.awt.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a,b,c,d,e,f,ortalama;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik NOtunu Girin :");
        a=inp.nextInt();

        System.out.print("Fizik Notunu Girin :");
        b=inp.nextInt();

        System.out.print("Kimya Notunu Gİrin :");
        c=inp.nextInt();

        System.out.print("Türkçe Notunu Girin :");
        d=inp.nextInt();

        System.out.print("Tarih Notunu Girin :");
        e=inp.nextInt();

        System.out.print("Müzik Notunu Girin");
        f=inp.nextInt();

        ortalama=(a+b+c+d+f+e)/6;
        System.out.println("Ortalama Notunuz :"+ortalama);
        boolean d1 = ortalama>=60;
        String d2= d1 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(d2);

    }
}