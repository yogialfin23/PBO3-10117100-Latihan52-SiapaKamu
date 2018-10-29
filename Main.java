package com.company;

/**
 * Yogie Alfin Salim
 * 10117100
 * IF-3
 */
public class Main {

    public static void main(String[] args) {
        Manusia mns = new Manusia();
        Dosen dsn = new Dosen();
        Mahasiswa mhs = new Mahasiswa();

        dsn.setNama("Rizki Adam Kurniawan");
        dsn.setUmur(27);
        dsn.setNip("41227829930");
        dsn.setMataKuliah("PBO");
        mhs.setNama("Nindi");
        mhs.setUmur(17);
        mhs.setNim("10110269");
        mhs.setKelas("PBO2");

        System.out.println("NIP DOSEN : " +dsn.getNip());
        dsn.siapaKamu();
        dsn.mengajarApa();

        System.out.println("\nNIM MAHASISWA : " +mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
    }
}
