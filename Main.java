import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Scanner inp = new Scanner(System.in);

        try {
            File file = new File("../out/out.txt");
            Scanner read = new Scanner(file);

            while (read.hasNextLine()) {
                String data = read.nextLine();
                String splitter[] = data.split(":");
                ll.add(splitter[0]);

                if(ll.searchData(splitter[0]) != null){
                    ll.searchData(splitter[0]).getData().addJudul(splitter[1]);
                }
            }
            read.close();
        } catch (Exception e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        ll.sort();
        // tampilan program        
        while (true) {
            System.out.print("\n--------LinkedList Program--------\n\n1. Cari nama editor\n2. Tampilkan seluruh data editor\n3. Cari nama editor dan tampilkan judul artikel\n4. Exit\nMasukkan Pilihan : ");
            int pilihan = Integer.parseInt(inp.nextLine());
            if (pilihan == 1) {
                System.out.print("Masukkan nama editor : ");
                String editor = inp.nextLine();
                ll.searchContainsEditor(editor);
            } else if (pilihan == 2) {
                ll.display();
                System.out.println("");
            } else if (pilihan == 3) {
                System.out.print("input : ");
                String editor = inp.nextLine();
                ll.fiturBaru(editor);
            } else if (pilihan == 4) {
                System.exit(1);
            } else {
                System.out.println("Pilihan tidak ditemukan\n");
            }

        }
    }
}