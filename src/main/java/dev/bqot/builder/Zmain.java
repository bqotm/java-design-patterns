package dev.bqot.builder;

public class Zmain {

    public static void main(String[] args) {


        User user= new User.Builder().id("1a").lname("android").fname("nougat").isDead(true).create();
        System.out.println(user);

        User userDead=new User.Builder().lname("rrpd").isDead(false).create();
        System.out.println(userDead);

    }

}
