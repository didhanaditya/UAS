public class Main {
    public static void main(String[] args) {

        Employee DidhanAditya = new Employee("Didhan", "Aditya", 1);
        Employee SyahrulHidayat = new Employee("Syahrul", "Hidayat", 2);
        Employee ArdiNaufan = new Employee("Ardi", "Naufan", 3);
        Employee ChristoperJansen = new Employee("Christoper", "Jansen", 4);
        Employee UmarSaid = new Employee("Umar", "Said", 5);

        ArrayQueue queue = new ArrayQueue(10);

        queue.enqueue(DidhanAditya);
        queue.enqueue(SyahrulHidayat);
        queue.enqueue(ArdiNaufan);
        queue.enqueue(ChristoperJansen);
        queue.enqueue(UmarSaid);

        System.out.println("\n");
        System.out.println("Show All Queue :");
        queue.printQueue();

        System.out.println("\n");
        System.out.println("After Deletion Queue :");
        queue.dequeue();
        queue.printQueue();

        System.out.println("\n");
        System.out.println("Insert Rear Queue :");
        queue.printQueue();
        System.out.println(queue.peekRear());
        System.out.println("\n");
    }
}