package cs171.sum2023.lab6.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> printerQueue = new LinkedList<>();

        // Add some print jobs to the printer queue
        printerQueue.add("Document1");
        printerQueue.add("Document2");
        printerQueue.add("Document3");
        printerQueue.add("Document4");
        System.out.println("size: " + printerQueue.size());
        System.out.println("Poll: " + printerQueue.poll());
        System.out.println("Poll: " + printerQueue.poll());
        printerQueue.add("Document5");
        System.out.println("size: " + printerQueue.size());

        System.out.println("Poll: " + printerQueue.poll());
        System.out.println("Poll: " + printerQueue.poll());
        printerQueue.add("Document6");
        printerQueue.add("Document7");
        printerQueue.add("Document8");
        printerQueue.add("Document9");
        printerQueue.add("Document10");
        printerQueue.offer("DocumentX1"); //returns false if queue is full
        printerQueue.offer("DocumentX2");
        printerQueue.add("Document11");

        System.out.println(printerQueue);
        System.out.println("Poll: " + printerQueue.poll());

        System.out.println("Peek: " + printerQueue.peek());
        System.out.println("Peek: " + printerQueue.peek());
        System.out.println("Peek: " + printerQueue.peek());

        System.out.println("Poll: " + printerQueue.poll());
        System.out.println("Peek: " + printerQueue.peek());

        System.out.println("size: " + printerQueue.size());


        // Print the documents in the order they were added
//        while (!printerQueue.isEmpty()) {
//            System.out.println("Poll: " + printerQueue.poll());
//        }
    }
}
