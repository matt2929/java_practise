
public class Runner{
  public static void main(String[] args){
    TreeNode root = new TreeNode(1);
    TreeNode[] nodes = new TreeNode[13];
    for(int i=0; i < 13; i++){
      nodes[i]=new TreeNode(i);
    }
    nodes[0].setLeftNode(nodes[1]);
    nodes[0].setRightNode(nodes[7]);

    nodes[1].setLeftNode(nodes[2]);
    nodes[1].setRightNode(nodes[5]);

    nodes[2].setLeftNode(nodes[3]);
    nodes[2].setRightNode(nodes[4]);

    nodes[5].setRightNode(nodes[6]);

    nodes[7].setLeftNode(nodes[8]);
    nodes[7].setRightNode(nodes[9]);

    nodes[9].setLeftNode(nodes[10]);

    nodes[10].setLeftNode(nodes[11]);
    nodes[10].setRightNode(nodes[12]);

    System.out.println("Inorder: ");
    inorder(nodes[0]);

    System.out.println("Preorder: ");
    preorder(nodes[0]);

    System.out.println("Postorder: ");
    postorder(nodes[0]);
  }

  public static void inorder(TreeNode node){
    if(node == null) return;
    inorder(node.getLeftNode());
    System.out.print(node.getVal()+" ");
    inorder(node.getRightNode());
  }

  public static void preorder(TreeNode node){
    if(node == null) return;
    System.out.print(node.getVal()+" ");
    preorder(node.getLeftNode());
    preorder(node.getRightNode());
  }

  public static void postorder(TreeNode node){
    if(node == null) return;
    postorder(node.getLeftNode());
    postorder(node.getRightNode());
    System.out.print(node.getVal()+" ");

  }

}
