package Oops;

public class Encapsulation {
    private static String name = "Abhishek";

    public String getName(){
        return name;
    }
}


class Main{
    public static void main(String[] args) {
        Encapsulation en = new Encapsulation();
        System.out.println(en.getName());
    }
}
