package tugas3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] a) {
        // ArrayList mahasiswas = new ArrayList();
        ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        boolean next = true;
        while (next) {
            System.out.print("masukkan NIM Mahasiswa : ");
            String nim = scanner.nextLine();

            System.out.print("Masukkan Nama Mahasiswa : ");
            String nama = scanner.nextLine();

            Mahasiswa mhs = new Mahasiswa();
            mhs.setNim(nim);
            mhs.setNama(nama);

            // ArrayList mataKuliahs = new ArrayList();
            ArrayList<MataKuliah> mataKuliahs = new ArrayList<>();
            boolean nextMatkul = true;
            while (nextMatkul) {
                MataKuliah matkul = new MataKuliah();

                System.out.print("Masukkan Kode Mata Kuliah : ");
                String kode = scanner.nextLine();
                matkul.setKode(kode);

                System.out.print("Masukkan Nama Mata Kuliah : ");
                String namaMK = scanner.nextLine();
                matkul.setNamaMK(namaMK);

                System.out.print("Masukkan Nilai Angka : ");
                double nilaiAngka = scanner.nextDouble();
                scanner.nextLine();
                matkul.setNilaiAngka(nilaiAngka);

                mataKuliahs.add(matkul);

                System.out.print("Tambah Mata Kuliah (y/n) ?");
                String tambahMatkul = scanner.nextLine();

                if (!tambahMatkul.equalsIgnoreCase("y")) {
                    nextMatkul = false;
                }
            }

            mhs.setMataKuliahs(mataKuliahs);
            mahasiswas.add(mhs);

            System.out.print("Tambah Mahasiswa Lagi (y/n) ?");
            String tambah = scanner.nextLine();

            if (!tambah.equalsIgnoreCase("y")){
                next = false;
            }
        }

        System.out.println("\nKartu Hasil Studi (KHS) : ");
        System.out.println("============================");
        for (Mahasiswa mhs : mahasiswas ) {
            System.out.println("Mahasiswa: " + mhs.getNim() + " - " + mhs.getNama());
            System.out.println("Mata Kuliah:");
            for (MataKuliah matkul : mhs.getMataKuliahs()) {
                System.out.println(" - Kode: " + matkul.getKode() +
                ", Nama:" + matkul.getNamaMK() + 
                ", Nilai Huruf : " + matkul.hitungNilaiHuruf());
            }
            System.out.println("============================");
        }
    
    }
}