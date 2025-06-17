import java.util.PriorityQueue;
public class PQExample{
   public static void main(String[] args){
       PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
       pq.add(10);
       pq.add(5);
       pq.add(30);
       System.out.println("priority queue:"+pq);
       System.out.println("min:"+pq.peek());
       System.out.println("remove min:"+pq.poll());
       System.out.println("new min:"+pq.peek());
    }
}