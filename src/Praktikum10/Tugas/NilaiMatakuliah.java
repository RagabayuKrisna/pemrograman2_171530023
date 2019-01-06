package Praktikum10.Tugas;

import java.util.Scanner;

public class NilaiMatakuliah {
    
    public static void main (String [] args){
        String nama , nim ;
        Double bobot_uts;
        Double bobot_uas;
        Double bobot_lain2;
        Double nilai_uts;
        Double nilai_uas;
        Double nilai_lain2;
        Double nilai_akhir;
        String Grade;
        
        Scanner input = new Scanner (System.in);
        System.out.println("===== Menghitung Nilai Mahasiswa=====\n");
        System.out.print("Masukan nama : ");
        nama = input.nextLine();
        System.out.print("Masukan NIM : ");
        nim = input.nextLine();
        System.out.print("Nilai UTS : ");
        nilai_uts = input.nextDouble();
        System.out.print("Nilai UAS : ");
        nilai_uas = input.nextDouble();
        System.out.print("Nilai Lain-Lain : ");
        nilai_lain2 = input.nextDouble();
        System.out.print("Bobot Nilai UTS : ");
        bobot_uts = input.nextDouble();
        System.out.print("Bobot Nilai UAS : ");
        bobot_uas = input.nextDouble();
        System.out.print("Bobot Nilai Lain-Lain : ");
        bobot_lain2 = input.nextDouble();
        nilai_akhir = (bobot_uts * nilai_uts + bobot_uas * nilai_uas + bobot_lain2 * nilai_lain2);
        System.out.println(nama+" dengan NIM "+nim+" memiliki nilai akhir "+nilai_akhir);
    }
    
    public void Grade(){
        
    }
}
