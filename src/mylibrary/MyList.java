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
abstract public class MyList {

    abstract public int size();

    abstract public Object get(int index);

    abstract public void insert(Object element, int index);

    abstract public void add(Object element);

    abstract public void remove(int index);

    abstract public void remove(Object element);

    abstract public int search(Object element);

}
