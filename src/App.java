import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Umur(dari 1-1000) :");

        String input = sc.nextLine();
        String[] arrUmur = input.split(" ");

        int[] arrUmurint = new int[arrUmur.length];

        for (int i = 0; i < arrUmur.length; i++) {
            arrUmurint[i] = Integer.parseInt(arrUmur[i]);

            if(arrUmurint[i] < 1){
                System.out.println("Inputan umur tidak bisa dibawah 1");
                return;
            }

            if(arrUmurint[i] > 1000){
                System.out.println("Inputan umur tidak bisa diatas 1000");
                return;
            }
        }

        Queue<Integer> queueLolos = new LinkedList<>();
        Queue<Integer> queueTidakLolos = new LinkedList<>();

        for (int i = 0; i < arrUmurint.length; i++) {

            if(arrUmurint[i] >= 28 && arrUmurint[i] <= 118){
                queueLolos.add(arrUmurint[i]);
            } 
            else {
                queueTidakLolos.add(arrUmurint[i]);
            }
        }

        System.out.println("Umur - umur yang lolos : " + queueLolos);
        System.out.println("Umur - umur yang tidak lolos : " + queueTidakLolos);
    }
}