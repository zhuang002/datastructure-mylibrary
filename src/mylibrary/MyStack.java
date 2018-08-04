/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylibrary;

/**
 *
 * @author huang
 */
public class MyStack implements BufferInterface {
    Object[] buffer;
    int capacity;
    int top=0;
    
    public MyStack(int cap) {
        this.capacity=cap;
        buffer=new Object[cap];
    }

    @Override
    public void push(Object o) {
        if (!isFull()) {
            this.buffer[top]=o;
            top++;
        }
    }

    @Override
    public Object pop() {
        if (!isEmpty())
        {
            top--;
            Object v= buffer[top];
            return v;
        }
        return null;
    }

    @Override
    public Object peek() {
        if (isEmpty()) return null;
        return buffer[top-1];
    }

    @Override
    public boolean isFull() {
        return top>=capacity;
    }

    @Override
    public boolean isEmpty() {
        return top==0;
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public int capacity() {
        return capacity;
    }
    
}
