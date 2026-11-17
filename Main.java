import java.util.*; // Imports all accessible types directly inside that package.

public class Main{
    public static void main(String[] args){

        Qu q = new Qu();
        q.tasks();



    }

}

class Qu{
    Queue<Integer> queue = new LinkedList<>();

    public void tasks(){
        queue.add(25);
        queue.add(30);
        queue.add(35);

        System.out.println(queue);

        System.out.println(queue.remove());

        System.out.println(queue);


    }
}