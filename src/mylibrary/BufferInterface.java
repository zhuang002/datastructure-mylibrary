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
public interface BufferInterface {
    void push(Object o);
    Object pop();
    Object peek();
    boolean isFull();
    boolean isEmpty();
    int size();
    int capacity();
}
