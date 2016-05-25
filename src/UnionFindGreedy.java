import java.util.Arrays;

class UnionFind{
	int[] arr;
	//static final int size = 10;
	public UnionFind(int size) {
		arr = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = i;
		}
	}
	public void union(int a, int b){
		int x = arr[a];
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==x){
				arr[i] = arr[b];
			}
				
		}
	}
	public boolean find(int a, int b){
		return arr[b]==arr[a];
	}
	@Override
	public String toString() {
		return Arrays.toString(arr);
	}
	
}

public class UnionFindGreedy {

	public static void main(String[] args) {
		UnionFind uf = new UnionFind(10);
		uf.union(3, 4);
		System.out.println(uf.toString());
		uf.union(3, 9);
		System.out.println(uf.toString());
		uf.union(3, 5);
		System.out.println(uf.toString());
		System.out.println(uf.find(4, 9));
	}

}
