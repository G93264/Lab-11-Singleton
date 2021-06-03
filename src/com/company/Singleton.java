package com.company;

public class Singleton {

//    Creating Singleton:: Eager Instantiation
    private static Singleton uniqueInstance;

//    Private Constructor only to be used by this class
    private Singleton(){
    }

//    Method to get the uniqueSingleton
    public static Singleton getInstance() {
        if (uniqueInstance==null)
        {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

}
