package com.exemple.ch4;

public class TestZoo {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(10);
        zoo.addFelin(new Tigre());
        zoo.addFelin(new Chat());
        zoo.appeler();
    }
}
