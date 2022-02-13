package recursiveTreeGraphDFS_BFS;

/*
아래 그림과 같은 이진트리에서 루트 노드 1에서 말단노드까지의 길이 중 가장 짧은 길이를
구하는 프로그램을 작성하세요.

각 경로의 길이는 루트노드에서 말단노드까지 가는데 이동하는 횟수를 즉 간선(에지)의 개수를
길이로 하겠습니다.

      (1)
   (2)   (3)
(4)  (5)

가장 짧은 길이는 3번 노느까지의 길이인 1이다.
 */
class Node_BFS1 {
	int data;
	Node_BFS1 lt, rt;

	public Node_BFS1(int val) {
		data = val;
		lt = rt = null;
	}
}

public class Tree_말단노드까지의가장짧은경로_BFS {

	Node_BFS1 root;

	public int DFS(int L, Node_BFS1 root) {
		if (root.lt == null && root.rt == null) {
			return L;
		} else {
			return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
		}
	}

	public static void main(String[] args) {
		Tree_말단노드까지의가장짧은경로_BFS tree = new Tree_말단노드까지의가장짧은경로_BFS();
		tree.root = new Node_BFS1(1);
		tree.root.lt = new Node_BFS1(2);
		tree.root.rt = new Node_BFS1(3);
		tree.root.lt.lt = new Node_BFS1(4);
		tree.root.lt.rt = new Node_BFS1(5);
		System.out.println(tree.DFS(0, tree.root));
	}
}
