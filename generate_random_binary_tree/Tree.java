public class Tree{

  public Node root = null;

  public Tree(){

  }

  public Tree(Node root){
    this.root=root;
  }

  public Tree(int rootVal, String str){
    this.root=new Node(rootVal, str);
  }

  public Node getRoot(){
    return this.root;
  }



}
