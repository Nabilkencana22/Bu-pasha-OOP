package Tugas;

import java.util.Scanner;

public class TesPerson {
    public static void main(String[] args) {
        String perulangan = "iya";
        String type = "";
        int i = 0;
        while (perulangan.equals("iya")) {
            Scanner in = new Scanner(System.in);
            System.out.println("Pilih salah satu");
            System.out.println("1.Student");
            System.out.println("2.Teacher");
            System.out.println("3.Exit");
            System.out.print("Masukkan Angka Pilihan Anda : ");
            System.out.println("");
            System.out.println("-----------------------------------");
            int pilihan = in.nextInt();
            System.out.println("-----------------------------------");
            System.out.print("Nama : ");
            String nama = in.next();
            System.out.print("Umur : ");
            int umur = in.nextInt();
            System.out.println("-----------------------------------");
            in.nextLine();

            if (pilihan == 1) {
                System.out.print("Nomor Pelajar : ");
                int nomorPelajar = in.nextInt();
                System.out.print("Nilai : ");
                int nilai = in.nextInt();
                System.out.print("Jurusan : ");
                String Jurusan = in.next();
                Student s1 = new Student(nama, umur, nomorPelajar, nilai, Jurusan);
                System.out.println("----------------------------");
                System.out.println("         DATA SISWA");
                System.out.println("----------------------------");
                s1.print();
            } else if (pilihan == 2) {
                System.out.println("Pilih Salah Satu");
                System.out.println("1.FullTime ");
                System.out.println("2.PartTime ");
                System.out.println("3.Exit");
                System.out.println("Masukkan Angka Pilihan Anda : ");
                System.out.println("-----------------------------------");
                int pilih = in.nextInt();
                System.out.println("-----------------------------------");
                in.nextLine();

                if (pilih == 1) {
                    System.out.print("Mapel : ");
                    String mapel = in.next();
                    System.out.print("Gaji Tahunan : ");
                    int gajiTahunan = in.nextInt();
                    System.out.print("Unit : ");
                    String unit = in.next();
                    FullTime f1 = new FullTime(gajiTahunan, unit, mapel, nama, umur);
                    System.out.println("----------------------------");
                    System.out.println("         DATA FULL TIME");
                    System.out.println("----------------------------");
                    f1.print();
                } else if (pilih == 2) {
                    System.out.print("Mapel : ");
                    String mapel = in.next();
                    System.out.print("Jam Kerja : ");
                    int jamKerja = in.nextInt();
                    PartTime p1 = new PartTime(jamKerja, mapel, nama, umur);
                    System.out.println("----------------------------");
                    System.out.println("         DATA PART TIME");
                    System.out.println("----------------------------");
                    p1.print();
                } else {
                    System.out.println("Anda Keluar Dari Program");
                }
            }
            in.nextLine();
            System.out.println("-----------------------------------");
            System.out.println("Mau Pilih Lagi ?? (Iya / Tidak)");
            System.out.println("-----------------------------------");
            perulangan = in.nextLine();
            i++;
        }

    }
}
