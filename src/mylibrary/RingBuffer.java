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
public class RingBuffer implements BufferInterface {

    Object[] buffer;
    int capacity = 10;
    int header = 0;
    int tail = 0;
    boolean empty;

    public RingBuffer(int cap) {
        this.capacity = cap;
        this.buffer = new Object[cap];
        this.empty = true;
    }

    @Override
    public void push(Object o) {
        if (!isFull()) {
            this.buffer[tail] = o;
            tail++;
            if (tail > this.capacity - 1) {
                tail = 0;
            }
            this.empty = false;
        }
    }

    @Override
    public Object pop() {
        if (!isEmpty()) {
            Object v = this.buffer[header];
            header++;
            if (header > capacity - 1) {
                header = 0;
            }
            if (header == tail) {
                this.empty = true;
            }
            return v;
        }
        return null;
    }

    @Override
    public Object peek() {
        return this.buffer[header];
    }

    @Override
    public boolean isFull() {
        return (header == tail) && !empty;
    }

    @Override
    public boolean isEmpty() {
        return this.empty;
    }

    @Override
    public int size() {
        if (isEmpty()) {
            return 0;
        }
        if (header == tail) {
            return this.capacity;
        }
        if (tail > header) {
            return tail - header;
        }
        return tail + capacity - header;
    }

    @Override
    public int capacity() {
        return this.capacity;
    }

}
