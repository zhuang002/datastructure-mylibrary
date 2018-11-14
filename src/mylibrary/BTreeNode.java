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
public class BTreeNode extends TreeNode {
    public BTreeNode getLeftTree() {
        return (BTreeNode)this.children.get(0);
    }
    
    public void setLeftTree(BTreeNode node) {
        this.children.set(0, node);
    }
    
    public BTreeNode getRightTree() {
        return (BTreeNode)this.children.get(1);
    }
    
    public void setRightTree(BTreeNode node) {
        this.children.set(1, node);
    }
    
    @Override
    public void addChild(TreeNode node) {
        throw new InvalidMethodException();
    }
    
    @Override 
    public void removeChild(TreeNode node) {
        throw new InvalidMethodException();
    }
}
