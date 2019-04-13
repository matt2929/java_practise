public class Runner{

  public static void main(String[] args){
      RandomBinaryTree generateTree = new RandomBinaryTree();
      Tree tree = generateTree.generateTree(.9d);

      BreadthFirstSearch bfs = new BreadthFirstSearch();
      bfs.init(tree);
      while(bfs.next()!=null){
        Node node = bfs.current();
        System.out.println(""+node.getValue()+" "+ node.getStr());
      }

      System.out.println("\n");

      DepthFirstSearch dfs = new DepthFirstSearch();
      dfs.init(tree);
      while(dfs.next()!=null){
        Node node = dfs.current();
        System.out.println(""+node.getValue()+" "+ node.getStr());
      }
  }

}
