package com.company;



public class Main {

    public static void main(String[] args) {

    }

}




































/*
    public static void main(String[] args) throws FileNotFoundException {
        String[] names = new String[1000];
        Random rand = new Random();
        String name = "";

        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 4; j++) {
                name += (char) (rand.nextInt(26) + 'a');
            }
            names[i] = name;
            name = "";
        }

        for(String n: names){
            System.out.println(n);
        }

        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(new File("src/com/company/names4letter.txt"));
        while(sc.hasNext()){
            String line = sc.next();
            list.add(line);
        }

        System.out.println(list);
    }

 */