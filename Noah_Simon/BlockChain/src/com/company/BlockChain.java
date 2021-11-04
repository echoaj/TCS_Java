package com.company;


public class BlockChain {

    int length;
    Block head;
    Block tail;

    public BlockChain(){
        head = new Block(null, null, 0.0);
        tail = head;
        head.hash = head.get_hash();
        length = 1;
    }

    public void append(Block block){
        block.prevHash = tail.hash;
        block.prev = tail;
        block.hash = block.get_hash();
        tail = block;
        length++;
    }

    // TODO for loop that checks if blockchain is valid
    public boolean isValid(){
        Block cur = this.tail;
        while(cur != this.head){
            if (!cur.hash.equals(cur.get_hash())) {
                System.out.println("FIRST");
                return false;
            }
            if (!cur.prevHash.equals(cur.prev.get_hash())){
                System.out.println("SECOND");
                return false;
            }
            cur = cur.prev;
        }
        if(!cur.hash.equals(cur.get_hash()))
            return false;
        return true;
    }



    // TODO Proof of work
    // 1) check if first n character match to an array of n zeros
    // 2) keep adding nonce value and recalculate hash
    // 3) increment nonce till hash matches

    public String display(){
        Block cur = this.tail;
        String print = "";
        while(cur != this.head){
            String temp = cur.from + " to " + cur.destination + " " + cur.timestamp;
            print = temp + " <- " + print;
            cur = cur.prev;
        }
        String temp = cur.from + " to  " + cur.destination + " " + cur.timestamp;
        print = temp + " <- " + print;
        return print;
    }

    public void displayHash(){
        Block cur = this.tail;
        String print = "";
        while(cur != this.head){
            String temp = cur.hash;
            print = temp + " <- " + print;
            cur = cur.prev;
        }
        String temp = cur.hash;
        print = temp + " <- " + print;
        System.out.println(print);
    }

    public void displayPrevHash(){
        Block cur = this.tail;
        String print = "";
        while(cur != this.head){
            String temp = cur.prevHash;
            print = temp + " <- " + print;
            cur = cur.prev;
        }
        String temp = cur.prevHash;
        print = temp + " <- " + print;
        System.out.println(print);
    }

}
