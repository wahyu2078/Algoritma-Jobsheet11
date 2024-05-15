package Tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList scavengerHunt = new LinkedList();
        scavengerHunt.addNode("Siapakah presiden pertama Indonesia?", "Soekarno");
        scavengerHunt.addNode("Apa ibukota Indonesia?", "Jakarta");
        scavengerHunt.addNode("Apa warna bendera Indonesia?", "Merah Putih");
        scavengerHunt.addNode("Berapa jumlah provinsi di Indonesia?", "34");
        scavengerHunt.addNode("Apa nama mata uang Indonesia?", "Rupiah");

        startScavengerHunt(scavengerHunt);
    }

    public static void startScavengerHunt(LinkedList scavengerHunt) {
        Scanner scanner = new Scanner(System.in);
        Node currentPoint = scavengerHunt.getHead();

        while (currentPoint != null) {
            System.out.println(currentPoint.getQuestion());
            String playerAnswer = scanner.nextLine();

            if (playerAnswer.equalsIgnoreCase(currentPoint.getAnswer())) {
                System.out.println("Jawaban benar! Lanjut ke pertanyaan selanjutnya.");
                currentPoint = currentPoint.getNext();
            } else {
                System.out.println("Jawaban salah. Coba lagi.");
            }
        }

        scanner.close();
        System.out.println("Selamat, Anda menemukan harta karun!");
    }
}
