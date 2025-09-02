import java.util.*;

public class StackQueueDemo {
    public static void main(String[] args) {
        //Stack -> Last in first Out / First in Last out
        //Operations can be performed only from one side
        //implementations -> Stack class(Legacy) ->not recommended
        //Use Deque interface and its implementing classes
        Deque<Integer> stack=new ArrayDeque<>();
        stack.push(1);
        stack.push(3);
        stack.push(9);
        stack.push(24);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.poll());
        System.out.println(stack);


        //Queue->First in First out/Last in Last Out
        //Operations can be perfomed only from one side
        //implementation -> Using Queue Interface
        Queue<Integer> queue=new ArrayDeque<>();
        queue.add(12);
        queue.offer(10);
        queue.offer(14);
        queue.offer(19);

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println("-------------------------------");

        //PriorityQueue
        //PriorityQueue use heap data Structure Internally...
        //Lowest Number highest Priority -> MinHeap
        //Highest Number Lowest Priority -> MaxHeap

        Queue<Integer> pq=new PriorityQueue<>();//lowest number highest priority..
        pq.offer(21);
        pq.offer(2);
        pq.offer(45);
        pq.offer(32);
        System.out.println(pq); //[2, 21, 45, 32]
        System.out.println(pq.poll());//2 is delete
        //now pq is [21,32,45]
        System.out.println(pq.poll());//21 is delete
        //now pq is [32,45]
        System.out.println(pq.poll());//32 is delete
        //now pq is [45]


        //if we want to reverse Order or priority highest number highest Priority
        Queue<Integer> pq1=new PriorityQueue<>(Comparator.reverseOrder());
        pq1.offer(21);
        pq1.offer(2);
        pq1.offer(45);
        pq1.offer(32);

        System.out.println(pq1); //[45, 32, 21, 2]

    }
}
