/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylibrary;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author huang
 */
public class TreeNode {
    ArrayList<TreeNode> children=new ArrayList();
    TreeNode parent=null;
    Object data;
    
    public Collection<TreeNode> getChildren() {
        return this.children;
    }
    public TreeNode getPrarent() {
        return this.parent;
    }
    public void addChild(TreeNode child) {
        this.children.add(child);
    }
    
    public void removeChild(TreeNode child) {
        this.children.remove(child);
    }
    public Object getData() {
        return this.data;
    }
    
    public void setData(Object obj) {
        this.data=obj;
    }
    
}
