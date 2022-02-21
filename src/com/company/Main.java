package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int f(int tal) {
        if(tal<7)
            System.out.println("1");
        else if(tal<9)
            System.out.println("2");
        else if(tal<13)
            System.out.println("3");
        else
            System.out.println("4");
        return tal;
    }

    public void udskriv(int nr,String besked) {
        if (nr < 100) {
            if (besked == "ja")
                System.out.println("Godkendt 1");
        }
        if (nr > 100) {
            if (besked == "ja")
                System.out.println("Godkendt 2");
        }
        if (nr < 100) {
            if (besked == "nej")
                System.out.println("Ikke Godkendt 4");
        }
        if (nr > 100) {
            if (besked == "nej")
                System.out.println("Ikke Godkendt 5");
        }
        if (nr == 100) {
            System.out.println("Godkendt");
        }

    }


}
