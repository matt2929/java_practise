import java.io.*;
import java.util.*;

public class DepthFirstSearch implements SearchTree {

Node current = null;
Stack<Node> stack = new Stack<Node>();
Set<Node> visited = new HashSet<Node>();

public void init(Tree tree){
        this.current=tree.getRoot();
        stack.push(current);
}

public void init(Node start){
        this.current=start;
        stack.push(start);

}

public Node current(){
        return current;
}

public Node next(){
        try{
                current = stack.pop();
        }catch(EmptyStackException e) {
                return null;
        }
        if(current.getLNode()!=null) stack.push(current.getLNode());
        if(current.getRNode()!=null) stack.push(current.getRNode());
        return current;
}
}
