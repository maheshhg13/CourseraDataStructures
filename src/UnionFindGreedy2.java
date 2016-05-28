import java.util.Arrays;

class UnionFind2{
	int[] arr;
	//static final int size = 10;
	public UnionFind2(int size) {
		arr = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = i;
		}
	}
	private int root(int a){
		int i = arr[a];
		while(i!=arr[i]){
			i = arr[i];
		}
		return i;
	}
	
	public void union(int a, int b){
		arr[b] = a;
	}
	public boolean find(int a, int b){
		return root(a)==root(b);
	}
	@Override
	public String toString() {
		return Arrays.toString(arr);
	}
	
}

public class UnionFindGreedy2 {

	public static void main(String[] args) {
		UnionFind2 uf = new UnionFind2(10);
		uf.union(3, 4);
		System.out.println(uf.toString());
		uf.union(3, 9);
		System.out.println(uf.toString());
		uf.union(3, 5);
		System.out.println(uf.toString());
		
		System.out.println(uf.find(4, 9));
	}

}
