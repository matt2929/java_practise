public class TreeNode{

  private TreeNode TreeNodeLeft=null;
  private TreeNode TreeNodeRight=null;
  private int value;
  public TreeNode(int value){
    this.value=value;
  }

  public void setLeftNode(TreeNode left){
    this.TreeNodeLeft=left;
  }
  public void setRightNode(TreeNode right){
    this.TreeNodeRight=right;
  }

  public TreeNode getLeftNode(){
    return this.TreeNodeLeft;
  }
  public TreeNode getRightNode(){
    return this.TreeNodeRight;
  }

  public int getVal(){
    return this.value;
  }

}
