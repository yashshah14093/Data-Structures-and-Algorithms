public class BinaryTree<E>{
    
    TreeNode<E> root;
    
    public BinaryTree(){
    }

    private void preorder(TreeNode<E> node){
        if(node!=null){
            System.out.println(node.value);
            preorder(node.getLeftChild());
            preorder(node.getRightChild());
        }
    }
    
    private void inorder(TreeNode<E> node){
        if(node!=null){
            inorder(node.getLeftChild());
            System.out.println(node.value);
            inorder(node.getRightChild());
        }
    }
    
    private void postorder(TreeNode<E> node){
        if(node!=null){
            postorder(node.getLeftChild());
            postorder(node.getRightChild());
            System.out.println(node.value);
        }
    }
    
    
    public void preorder(){
        this.preorder(root);
    }
    
    public void inorder(){
        this.inorder(root);
    }
    
    public void postorder(){
        this.postorder(root);
    }
    
    public void levelOrder(){
        Queue<TreeNode<E>> q = new LinkedList<TreeNode<E>>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode<E> curr = q.remove();
            if(curr!=null){
                System.out.println(curr.value);
                q.add(curr.getLeftChild());
                q.add(curr.getRightChild());
            }
        }
    }



    public boolean searchBinaryTree(E x,TreeNode<E> root){

    	if(root!=null){
	    	if(root.value == x){
	    		return true;
	    	}
	    	else if(root.value>x){
	    		return searchBinaryTree(x,root.getLeftChild());
	    	}
	    	else if(root.value<x){
	    		return searchBinaryTree(x,root.getRightChild());
	    	}
    	}
    	return false;
    
}