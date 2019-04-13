import java.io.*;
import java.util.*;

public class BreadthFirstSearch implements SearchTree {

Node current = null;
Queue<Node> stack = new LinkedList<Node>();
Set<Node> visited = new HashSet<Node>();

public void init(Tree tree){
        this.current=tree.getRoot();
        stack.offer(current);
}

public void init(Node start){
        this.current=start;
        stack.offer(start);

}

public Node current(){
        return current;
}

public Node next(){
        current = stack.poll();
        if(current==null){return null;}
        if(current.getLNode()!=null) stack.offer(current.getLNode());
        if(current.getRNode()!=null) stack.offer(current.getRNode());
        return current;
}
}
