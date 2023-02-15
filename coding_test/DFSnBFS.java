package coding_test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
그래프 검색 방법 중 깊이 우선 검색(DFS)
Stack을 이용해서 구현한다.

그래프 검색 방법 중 넓이 우선 검색(BFS)
Queue를 이용해서 구현한다.

*/
public class DFSnBFS {

    public static void main(String[] args) {
        Graph graph = new Graph(9);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,4);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(3,5);
        graph.addEdge(5,6);
        graph.addEdge(5,7);
        graph.addEdge(6,8);
        graph.bfs(3);
    }

}

class Graph{
    Node[] nodes;
    Graph(int size){
        nodes = new Node[size];
        for(int i = 0; i <size; i++){
            nodes[i] = new Node(i);
        }
    }

    void addEdge(int i1, int i2){
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];
        if(!n1.linked.contains(n2)){
            n1.linked.add(n2);
        }
        if(!n2.linked.contains(n1)){
            n2.linked.add(n1);
        }
    }

    void dfs(){
        dfs(0);
    }
    void dfs(int index){
        Node root = nodes[index];
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        root.marked = true;
        while(!stack.isEmpty()){
            Node r = stack.pop();
            for(Node n : r.linked){
                if(!n.marked){
                    n.marked = true;
                    stack.push(n);
                }
            }
            visit(r); // 방문했을 때 출력해주는 함수
        }
    }

    // 리커시브, 즉 재귀로 DFS하는 법
    void dfsR(Node r){
        if(r ==null) return;
        r.marked = true;
        visit(r);
        for(Node n :r.linked){
            if(!n.marked){
                dfsR(n);
            }
        }
    }

    // 재귀 호출인데 index 를 받아서 넘기는 것
    void dfsR(int index){
        Node r = nodes[index];
        dfsR(r);
    }
    void dfsR(){
        dfsR(0);
    }
    void bfs(){
        bfs(0);
    }

    void bfs(int index){
        Node root = nodes[index];
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        root.marked = true;
        while(!queue.isEmpty()){
            Node r = queue.poll();
            for(Node n : r.linked){
                if(!n.marked){
                    n.marked = true;
                    queue.add(n);
                }
            }
            visit(r);
        }
    }

    void visit(Node n){
        System.out.println(n.data + " ");
    }

    class Node{
        int data;
        LinkedList<Node> linked;
        boolean marked;

        Node(int data){
            this.data = data;
            this.marked = false;
            linked = new LinkedList<Node>();
        }
    }
}
