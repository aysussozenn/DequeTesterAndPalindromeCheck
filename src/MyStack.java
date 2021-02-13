
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
public class MyStack<Character> {

    private ArrayList<Character> myStack = new ArrayList<Character>();

    public void push(Character x) {
        myStack.add(x);
    }

    public Object pop() {
        if (isEmpty() == false) {
            return myStack.remove(myStack.size() - 1);
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        if (myStack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

}
