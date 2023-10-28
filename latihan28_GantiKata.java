package tipedata;
import java.util.Scanner;
public class latihan28_GantiKata {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("======== PROGRAM MENGGANTI KATA ========");
        System.out.print("Masukan Kalimat : ");
        String kalimat = input.nextLine();
        System.out.print("Ganti Kata : ");
        String ganti = input.nextLine();
        System.out.print("Menjadi Kata : ");
        String kata = input.nextLine();
        
        String newSentence = kalimat.replace(ganti, kata);

        System.out.println("===Hasil Formatting===");
        System.out.println("Kalimat awal : " + kalimat);
        System.out.println("Kalimat baru : " + newSentence);
    }
}
