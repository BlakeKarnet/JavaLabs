package main.java.org.example.chapter02.task15;

import java.util.ArrayList;

public class Network {
    private ArrayList<Member> members = new ArrayList<>();

    public static class Member {
        private final String name;

        public Member(String name) {
            this.name = name;
        }

        public void show() {
            System.out.println(name);
        }
    }

    public Member join(String name) {
        Member m = new Member(name);
        members.add(m);
        return m;
    }
}