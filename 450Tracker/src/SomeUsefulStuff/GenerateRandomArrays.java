package SomeUsefulStuff;

import java.util.ArrayList;
import java.util.List;
public class GenerateRandomArrays {
	public ArrayList<List<List<Integer>>> ThreeD(int d, int l, int w){
		ArrayList<List<List<Integer>>> result = new ArrayList<List<List<Integer>>>();
		for (int i = 0; i < d; i ++) {
			result.add(TwoD(l,w));
		}
		return result;
	}
	public ArrayList<List<Integer>> TwoD(int row, int col){
		ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int i = 0; i < row; i ++) {
			result.add(OneD(col));
		}
		return result;
	}
	public ArrayList<Integer> OneD(int size){
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0 ; i < size; i ++) {
			result.add((int) (Math.random() * 101) );
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateRandomArrays g = new GenerateRandomArrays();
		System.out.println(g.OneD(100));
		System.out.println(g.TwoD(3,3));
		System.out.println(g.ThreeD(2,3,3));
		
		HeapSort hs = new HeapSort();
		ArrayList<Integer> f = g.OneD(10);
		System.out.println(f + " HeapSOrt 1");
		hs.Sort(f);
		System.out.println(f);



	}

}
