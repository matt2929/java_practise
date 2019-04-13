public class Node{
  int value = 0;
  public Node lnode = null;
  public Node rnode = null;
  String str = "";
  Object object = null;
  public Node(){

  }



  public Node(int value, String str){
    this.value=value;
    this.str = str;
  }



  public Node(int value, String str, Node lnode, Node rnode){
    this.value=value;
    this.lnode=lnode;
    this.rnode=rnode;
    this.str = str;
  }

  public void setVal(int val){
    this.value=val;
  }

  public void setLNode(Node lnode){
    this.lnode=lnode;
  }

  public void setRNode(Node rnode){
    this.rnode=rnode;
  }

  public String getStr(){
    return this.str;
  }

  public int getValue(){
    return this.value;
  }

  public Node getLNode(){
    return this.lnode;
  }

  public Node getRNode(){
    return this.rnode;
  }
}
