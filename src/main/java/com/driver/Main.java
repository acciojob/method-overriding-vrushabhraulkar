package com.driver;

public class Main {
    public static class A{
        public String meth(){
            String s = "Invoking method from class A";
            return s;
        }
    }

    public static class B extends A{

        public String meth(){
            String z = "Method is overridden in Extendend class B";
            return z;
        }

    }


    public static void main(String[] args){
        B objb= new B();
        System.out.println(objb.meth());

    }

}