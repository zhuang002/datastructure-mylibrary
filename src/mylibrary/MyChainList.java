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
public class MyChainList extends MyList{
    private ChainNode head=null;

    @Override
    public int size() {
        int i=0;
        ChainNode node=this.head;
        while (node!=null) {
            i++;
            node=node.getNext();
        }
        return i;
    }

    @Override
    public Object get(int index) {
        int i=0;
        ChainNode node=this.head;
        while (node!=null) {
            if (i==index) return node.getElement();
            i++;
            node=node.getNext();
        }
        return null;
    }

    @Override
    public void insert(Object element, int index) {
        int i=0;
        ChainNode node=this.head;
        ChainNode newNode=new MyChainNode();
        newNode.setElement(element);
        while (node!=null) {
            if (i==index) {
                node.insertBefore(newNode);
                if (index==0) {
                    this.head=newNode;
                }
                return;
            }
            i++;
            node=node.getNext();
        }
        this.head=newNode;
    }

    @Override
    public void add(Object element) {
        
        ChainNode node=this.head;
        ChainNode prevNode=null;
        while (node!=null) {
            prevNode=node;
            node=node.getNext();
        }
        ChainNode newNode=new MyChainNode();
        newNode.setElement(element);
        if (prevNode!=null)
            prevNode.insertAfter(newNode); 
        else {
            this.head=newNode;
        }
    }

    @Override
    public void remove(int index) {
        int i=0;
        ChainNode node=this.head;
        while (node!=null) {
            if (i==index) {
                if (index==0) {
                    this.head=node.getNext();
                }
                node.remove();
                return;
            }
            i++;
            node=node.getNext();
        }
    }

    @Override
    public void remove(Object element) {
        ChainNode node=this.head;
        while (node!=null) {
            if (node.getElement().equals(element)) {
                node.remove();
                return;
            }
            node=node.getNext();
        }
    }

    @Override
    public int search(Object element) {
        int i=0;
        ChainNode node=this.head;
        while (node!=null) {
            if (node.getElement().equals(element)) {
                return i;
            }
            i++;
            node=node.getNext();
        }
        return -1;
    }
    
}
