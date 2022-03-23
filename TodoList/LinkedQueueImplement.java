package TodoList;

import java.util.*;

public class LinkedQueueImplement {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        linkedQueue lq = new linkedQueue();

        System.out.println("_________________To-Do List_________________");
        char ch;
        System.out.println("\n-----------------Pilihan Menu-----------------");
        System.out.println("1. Menambahkan Nama Pekerjaan");
        System.out.println("2. Menghapus Pekerjaan Yang Sudah Diselesaikan");
        System.out.println("3. Melihat Data yang Terdepan");
        System.out.println("4. Status Empty Nama Pekerjaan");
        System.out.println("5. Status Jumlah Data\n");
        do
        {
            System.out.print("Pilih Menu :  ");
            int Pilih = scan.nextInt();
            switch (Pilih)
            {
                case 1:
                    System.out.print("Masukan Nama Pekerjaan : ");
                    lq.insert(scan.next());
                    break;
                case 2:
                    try
                    {
                        System.out.println("Removed Element = " + lq.remove());
                    }
                    catch (Exception e)
                    {
                        System.out.println("Error : " + e.getMessage());
                    }
                    break;
                case 3:
                    try
                    {
                        System.out.println("Peek Element = " + lq.peek());
                    }
                    catch (Exception e)
                    {
                        System.out.println("Error : " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Empty status = " + lq.isEmpty());
                    break;

                case 5:
                    System.out.println("Size = " + lq.getSize());
                    break;

                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            // display queue     
            lq.display();

            System.out.print("\nApakah Ingin Melanjutkan ( 'Y' Atau 'N') : ");
            ch = scan.next().charAt(0);
        }
        while (ch == 'Y' || ch == 'y');
    }
}    

