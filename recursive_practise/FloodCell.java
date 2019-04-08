import java.util.*;

//Recursively 'flood' a matrix, play with ascii artear

public class FloodCell{
    static boolean[][] visited = new boolean[7][7];
    public static void main(String[] args){	
    int[][] map = new int[][]{{1,1,0,1,1,1,1},{1,0,3,3,0,1,1},{1,1,0,0,0,1,1},{1,1,0,0,0,0,0},{1,1,0,0,1,1,0},{1,1,0,0,1,1,0},{1,1,0,0,1,1,0}};
    for(int i = 0; i<map.length;i++){
	for(int j =0;j<map.length; j++){
  	   visited[i][j]=false;
  	}
    }
    System.out.println("Size: "+ sizeIsland(map, 0,4));
    System.out.println("Done!");
  }
  
  public static int sizeIsland(int[][] map, int x, int y){
      point pnt = new point(x,y);
      if(good_spot(map, pnt) && !visited[x][y]){ 
        try{
          Thread.sleep(333);
        }catch(InterruptedException ex){}
        System.out.println(pnt.asString());
	visited[x][y]=true;
	printMap(visited);
	return 1+sizeIsland(map, x+1, y)+sizeIsland(map, x-1, y)+sizeIsland(map, x ,y+1)+sizeIsland(map, x, y-1);    
      }else{
       return 0;
      }
      	
  }

  public static boolean good_spot(int[][] map, point pnt){
    return (pnt.x<map.length && pnt.x >=0 && pnt.y<map[0].length && pnt.y >= 0);
  }

 public static void printMap(boolean[][] map){
    for(int i=0;i<map.length;i++){
	System.out.print("[");
        for(int j=0;j<map[i].length;j++){
	   String val = "";
           if(map[i][j]){
		val="∆";
	   }else{
	  	val="˛";
           }
	   if(j==0){
		System.out.print("|"+val+"|");
	   }else{
		System.out.print(val+"|");
	   }
	}

	System.out.print("]\n");
    }
 } 

  public static class point{
    public int x,y; 
    public point(int x,int y){this.x=x;this.y=y;}
    String asString(){
	return "("+x+","+y+")";
    } 
 }
}
