package Dasar_Java;

import java.util.Scanner;

public class APP_tebakan {
    public static void main(String[] args) {


        System.out.print("Masukan Tingakatan Kesulitan : \n" +
                "1. Mudah\n" +
                "2. Medium\n"+
                "3. Sulit \n"+
                "Silakan masukan Angkanya :");
//input user memilih tingkatan kesulitan soal
        Scanner keyboard = new Scanner(System.in);

        int tebakanKamu = keyboard.nextInt();
//kelola pilihan user
        switch (tebakanKamu){
            case 1:
                soalMudah();
                break;
            case 2:
               soalMedium();
                break;
            case 3:
               soalSulit();
                break;
            default:
                System.out.println("Pilihan anda tidak dalam tingkatan!!!");
        }
        keyboard.close();

    }
    static void soalMudah(){
        String tebakanBenar = "kucing"; //set jawaban sebagai kucing
        System.out.print("-------------------------");
        System.out.print("Soal Mudah");
        System.out.print("-------------------------");
        System.out.print("\n\n");
        System.out.println("Soal 1");
        System.out.print("Hewan yang berbunyi meowg disebut hewaan apa ?\n" +
                "a.Kucing\n" +
                "b.Anjing\n" +
                "c.Rusa\n" +
                "Masukann Pilihan Gandanya : ");
//        input dari user untuk memilih jawaban yang benar
        Scanner input = new Scanner(System.in);
        tebakanBenar = input.nextLine();
//kelola tebakan user
        switch(tebakanBenar){
            case "a":
                System.out.println("Selamat Jawaban Anda Benar ");
            break;
            default:
                System.out.println("Jawaban Anda Salah, Jawaban yang benar adalah"+tebakanBenar);
                break;
        }
        input.close();

    }
    static void soalMedium(){
        String tebakanBenar = "Bika Ambon";//set jawaban sebagai bika ambon
        System.out.print("-------------------------");
        System.out.print("Soal Medium");
        System.out.print("-------------------------");
        System.out.print("\n\n");
        System.out.println("Soal 2");
        System.out.print("Makanan khas medan,yang berwarna kuning?\n" +
                "a.Gado-Gado\n" +
                "b.Bika Ambon\n" +
                "c.Sate \n" +
                "Masukan pilihan Anda : ");
        //        input dari user untuk memilih jawaban yang benar
        Scanner input = new Scanner(System.in);
        String jawabanKamu  = input.nextLine();
//kelola tebakan user
        switch (jawabanKamu){
            case "b":
                System.out.println("Jawaban anda benar !");
                break;
            default:
                System.out.println("Jawaban kamu salah, jawaban yang benar adalah "+tebakanBenar);
                break;
        }
        input.close();

    }
    static void soalSulit(){
        String tebakanBenar = "kalimatan barat";//set jawaban sebagai kalimatan barat
        System.out.print("-------------------------");
        System.out.print("Soal Sulit");
        System.out.print("-------------------------");
        System.out.print("\n\n");
        System.out.println("Soal 3");
        System.out.print("ikan Arwana berasal dari perairan apa?\n" +
                "a.nusa tenggara timur\n" +
                "b.papua\n" +
                "c.kalimatan barat\n" +
                "Masukan pilihan anda :\n ");
        //        input dari user untuk memilih jawaban yang benar
        Scanner input = new Scanner(System.in);
        String jawabanKamu = input.nextLine();
//kelola tebakan user 
        switch (jawabanKamu){
            case "c":
                System.out.println("Jawban Kamu benar !");
                break;
            default:
                System.out.println("Jawaban kamu salah!, jawaban yang benar adalah "+tebakanBenar);
                break;
        }
        input.close();
    }
}
