package org.example;

import java.util.ArrayList;

public class Main {

    /*
    Para definir o tipo do objeto ArrayList
    Tipos Primitivos  =>    Wrapper Class
    int  =>                 Integer
    float  =>               Float
    double =>               Double
    char =>                 Character

     */
    public static void main(String[] args) {


        Lista  l = new Lista();
        ArrayList<String> p1 = l.list1;
     p1.add("Emerson");
     p1.add("Julia");

        System.out.println(p1.get(0));

     p1.remove(0);

        //Ultimo da ArrayList
        System.out.println(p1 +p1.get(p1.size() - 1));

        //Tamanho da Array list
        System.out.println(p1.size());

        //foreatch
        for(String nome : p1){
            System.out.println(nome);
        }

        //Remove todos elementos da Array list
        p1.clear();



    }


}