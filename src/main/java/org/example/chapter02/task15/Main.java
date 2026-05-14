package main.java.org.example.chapter02.task15;

import main.java.org.example.chapter02.task15.Network;

public class Main {
    public static void main(String[] args) {
        Network network = new Network();
        Network.Member m = network.join("Kirill");
        m.show();
    }
}