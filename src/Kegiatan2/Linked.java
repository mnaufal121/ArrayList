/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kegiatan2;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Linked {

    Node head;

    public void addNode(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    public void shortList() {
        Node current = head, index = null;
        int temp;
        if (head == null) {
            System.out.println("Tak Bisa Diurutkan");
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public void showData() {
        Node current = head;
        if (head == null) {
            System.out.println("Listnya Kosong");
            return;
        }
        while (current != null) {
            System.out.print(" " + current.data);
            current = current.next;
        }
        System.out.println();
    }
}

class Driver {

    public static void main(String[] args) {
        Linked link = new Linked();

//        char jawab='y';
//        int input;
//        Scanner n = new Scanner(System.in);
//        while(jawab=='y'){
//            System.out.println("Masukkan angka: ");
//            input=n.nextInt();
//            link.addNode(input);
//            System.out.println("Masukkan lagi: ");
//            jawab=n.next().charAt(0);
//        }
        link.addNode(9);
        link.addNode(7);
        link.addNode(5);
        link.addNode(2);
        link.addNode(3);
        System.out.println("Unsorted Data : ");
        link.showData();
        System.out.println("");
        link.addNode(1);
        link.addNode(10);
        link.addNode(10);
        link.shortList();
        System.out.println("Sorted Data : ");
        link.showData();
    }
}
