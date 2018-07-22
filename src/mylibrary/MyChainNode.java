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
public class MyChainNode extends ChainNode {
    private Object element=null;
    private ChainNode previous=null;
    private ChainNode next=null;
    

    @Override
    public void insertAfter(ChainNode node) {
        
        ChainNode tmpNode=this.next;
        this.next=node;
        node.setNext(tmpNode);
        node.setPrevious(this);
        if (tmpNode!=null)
            tmpNode.setPrevious(node);
    }

    @Override
    public void insertBefore(ChainNode node) {
        node.setNext(this);
        ChainNode tmpNode=this.getPrevious();
        node.setPrevious(tmpNode);
        this.setPrevious(node);
    }

    @Override
    public void remove() {
        ChainNode previous=this.getPrevious();
        ChainNode next=this.getNext();
        if (previous!=null) {
            previous.setNext(next);
        }
        if (next!=null) {
            next.setPrevious(previous);
        }
    }

    @Override
    public ChainNode getNext() {
        return this.next;
    }

    @Override
    public ChainNode getPrevious() {
        return this.previous;
    }

    @Override
    public Object getElement() {
        return this.element;
    }

    @Override
    public void setNext(ChainNode node) {
        this.next=node;
    }

    @Override
    public void setPrevious(ChainNode node) {
        this.previous=node;
    }

    @Override
    public void setElement(Object obj) {
        this.element=obj;
    }
    
}
