
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aysu
 */
public class MyDeque {

    private ArrayList<Integer> myDeque = new ArrayList<Integer>();

    //inserting item on the front end

    public void push(int x) {
        myDeque.add(0, x);
        System.out.println(myDeque);
    }

    //removing item on the front 

    public int pop() {
        if (myDeque.isEmpty()) {
            System.out.println("Deque is empty !!");

        }
        int removedElement = myDeque.remove(0);
        System.out.println(myDeque);
        return removedElement;

    }

    //inserting item on the back

    public void inject(int x) {

        myDeque.add(x);
        System.out.println(myDeque);

    }

    //removing item on the back

    public int eject() {
        if (myDeque.isEmpty()) {
            System.out.println("Deque is empty !!");

        }
        int removedElement = myDeque.remove(myDeque.size() - 1);
        System.out.println(myDeque);
        return removedElement;

    }

}
