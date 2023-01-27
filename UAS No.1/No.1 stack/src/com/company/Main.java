package com.company;

public class Main {

    public static void main(String[] args) {
  
        Employee Didhan = new Employee("Didhan", "Aditya", 1);
        Employee Syahrul = new Employee("Syahrul", "Hidayat", 2);
        Employee Wardah = new Employee("Wardah", "Nisa", 3);
        Employee Rizky = new Employee("Rizky", "Muhammad", 4);
        Employee Damayanti = new Employee("Damayanti", "Eka", 5);

        LinkedStack stack = new LinkedStack();

        stack.push(Didhan);
        stack.push(Syahrul);
        stack.push(Wardah);
        stack.push(Rizky);
        stack.push(Damayanti);

        System.out.println("\n");
        System.out.println("Show After Stack :");
        stack.printStack();

        System.out.println("\n");
        System.out.println("Insert Front After Stack :");
        System.out.println(stack.peek());

        stack.pop();

        System.out.println("\n");
        System.out.println("After Deletion Stack :");
        stack.printStack();
        System.out.println("\n");
    }
}
