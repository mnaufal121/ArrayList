/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kegiatan1;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class List {

    public void arr() {
        ArrayList<String> namaMahasiswa = new ArrayList<>();
        namaMahasiswa.add("Lala");
        namaMahasiswa.add("Shani");
        namaMahasiswa.add("Gracia");
        namaMahasiswa.add("Kyla");
        namaMahasiswa.add("Gio");
        System.out.println("Awal : "+namaMahasiswa);
        
        namaMahasiswa.add(0, "Jamal");
        namaMahasiswa.add(3, "Ageng");
        System.out.println("Tambah : "+namaMahasiswa);
        
        namaMahasiswa.remove(2);
        namaMahasiswa.remove(4);
        System.out.println("Hapus : "+namaMahasiswa);
        
        System.out.println("Lala di Index ke-"+namaMahasiswa.indexOf("Lala"));
        System.out.println("Gracia di Index ke-"+namaMahasiswa.indexOf("Gracia"));
    }
}

class driver{
    public static void main(String[] args) {
        List array = new List();
        array.arr();
    }
}
