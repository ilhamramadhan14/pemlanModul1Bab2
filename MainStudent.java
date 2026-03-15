import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa yang diinput: ");
        int jumlah = input.nextInt();
        input.nextLine();

        Student[] siswa = new Student[jumlah];

        for(int i = 0; i < jumlah; i++){

            System.out.println("\nData siswa ke-" + (i+1));

            System.out.print("Nama: ");
            String nama = input.nextLine();

            System.out.print("Alamat: ");
            String alamat = input.nextLine();

            System.out.print("Umur: ");
            int umur = input.nextInt();

            System.out.print("Masukkan nilai math: ");
            double math = input.nextDouble();

            System.out.print("Masukkan nilai english: ");
            double english = input.nextDouble();

            System.out.print("Masukkan nilai science: ");
            double science = input.nextDouble();
            input.nextLine();

            siswa[i] = new Student(nama, alamat, umur);
            siswa[i].setMath(math);
            siswa[i].setEnglish(english);
            siswa[i].setScience(science);
        }

        System.out.println("\n===== DATA SISWA =====");
        for(int i = 0; i < jumlah; i++){
            System.out.println("---------------------");
            siswa[i].displayMessage();
        }
        
        System.out.println();
        Student.jumlahObjek();
        input.close();
    }
}