package recursiveTreeGraphDFS_BFS;

import java.util.*;

// 레벨 탐색 순회 출력 : 1 2 3 4 5 6 7
class Node_BFS {
	int data;
	Node_BFS lt, rt;

	public Node_BFS(int val) {
		data = val;
		lt = rt = null;
	}
}

public class 이진트리순회_넓이우선탐색_레벨탐색 {
	Node_BFS root;

	public void BFS(Node_BFS root) {
		Queue<Node_BFS> Q = new LinkedList<>();
		Q.add(root);
		int L = 0;
		while (!Q.isEmpty()) {
			int len = Q.size();
			System.out.print(L + " : ");
			for (int i = 0; i < len; i++) {
				Node_BFS cur = Q.poll();
				System.out.print(cur.data + " ");
				if (cur.lt != null)
					Q.add(cur.lt);
				if (cur.rt != null)
					Q.add(cur.rt);
			}
			L++;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		이진트리순회_넓이우선탐색_레벨탐색 tree = new 이진트리순회_넓이우선탐색_레벨탐색();
		tree.root = new Node_BFS(1);
		tree.root = new Node_BFS(2);
		tree.root = new Node_BFS(3);
		tree.root = new Node_BFS(4);
		tree.root = new Node_BFS(5);
		tree.root = new Node_BFS(6);
		tree.root = new Node_BFS(7);
		tree.BFS(tree.root);
	}
	
}
