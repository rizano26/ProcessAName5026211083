import java.util.Scanner;
import java.lang.String;
public class ProcessAName5026211083 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String namaDepan, namaBelakang;
        
        System.out.print("Nama Depan :");
        namaDepan = input.nextLine();
        
        
        System.out.print("Nama Belakang :");
        namaBelakang = input.nextLine();

        System.out.println("Namamu adalah : "+ namaBelakang + ", " + namaDepan.charAt(0) + ".");
    }
}