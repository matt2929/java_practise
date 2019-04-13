import java.util.Random;

public class RandomBinaryTree {

Random generate = new Random();

String alpha = "abcdefghijklmnopqrstuvwxyz";

public RandomBinaryTree(){

}

public Tree generateTree(double rate){
        Tree tree = new Tree(0, "root");
        Node root = tree.getRoot();
        maybeAdd(root, 0, rate);
        return tree;
}

private void maybeAdd(Node node, int level, double rate){
    double percentL = generate.nextDouble();
    level++;
    Double newRate=rateFormula(level, rate);
    if(percentL<=rate){
      System.out.println("new left at "+ level);
      node.setLNode(new Node(level, randomName()));
      maybeAdd(node.getLNode(), level, newRate);
    }
    double percentR = generate.nextDouble();
    if(percentR<=rate){
      System.out.println("new left at "+ level);
      node.setRNode(new Node(level, randomName()));
      maybeAdd(node.getRNode(),level, newRate);
    }

    return;
}

private double rateFormula(double level, double current){
  return (current * .9d);
}

private String randomName(){
  String out = "";
  for(int i = 0; i <4 ;i++){
    int index = generate.nextInt(26);
    out+=""+alpha.charAt(index);
  }
  return out;
}

}
