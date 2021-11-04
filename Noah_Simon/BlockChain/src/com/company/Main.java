package com.company;

import javax.crypto.Cipher;

public class Main {

    public static void main(String[] args) {
        BlockChain bc = new BlockChain();

        bc.append(new Block("Alex", "Noah", 2.0));
        bc.append(new Block("Rick", "Jason", 4.0));
        bc.append(new Block("Sara", "Zack", 1.0));


//        HACK
        bc.tail.prev.destination = "Kevin";
        System.out.print("PREV:\t\t\t\t\t");
        bc.displayPrevHash();
        System.out.print("CURR: ");
        bc.displayHash();

        System.out.println(bc.isValid());

//      System.out.println(bc.display());
    }
}
