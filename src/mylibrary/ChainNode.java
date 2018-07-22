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
abstract public class ChainNode {
    abstract public void insertAfter(ChainNode node);
    abstract public void insertBefore(ChainNode node);
    abstract public void remove();
    abstract public ChainNode getNext();
    abstract public void setNext(ChainNode node);
    abstract public ChainNode getPrevious();
    abstract public void setPrevious(ChainNode node);
    abstract public Object getElement();
    abstract public void setElement(Object obj);
}
