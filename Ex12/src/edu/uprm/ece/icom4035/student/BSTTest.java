package edu.uprm.ece.icom4035.student;

import edu.uprm.ece.icom4035.bst.BSTImp;
import edu.uprm.ece.icom4035.bst.BinarySearchTree;
import edu.uprm.ece.icom4035.list.List;

public class BSTTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s1 = new Student("123","Apu","Diaz", 30, 4.00, "SF");
		Student s2 = new Student("734","Tom","Smith", 21, 3.00, "LA");
		Student s3 = new Student("321","Amy","Li", 18, 3.92, "NY");
		Student s4 = new Student("823","Joe","Lu", 25, 1.00, "SF");
		Student s5 = new Student("100","Ned","Bo", 22, 3.00, "SF");

		System.out.println("Testing S1: " + s1 + "\n");
	
		
//		MapFactory<String, Student> factory = 
//				new LinkedListMapFactory<String, Student>();

		BinarySearchTree<String,Student> theTree = 
				new BSTImp<String,Student>(new StringComparator());
		theTree.add(s1.getStdId(), s1);
		theTree.add(s5.getStdId(), s5);
		theTree.add(s2.getStdId(), s2);
		theTree.add(s3.getStdId(), s3);
		theTree.add(s4.getStdId(), s4);
		
		theTree.print(System.out);
		
		System.out.println("\n theMap.get(123): " + theTree.get("123"));
		System.out.println("theMap.get(111): " + theTree.get("111"));
		
		theTree.add("111", new Student("111","Tim","Tom", 22, 2.00, "PR"));
		System.out.println("theMap.get(111): " + theTree.get("111"));

		theTree.add("124", new Student("124","Joe","Li", 21, 3.50, "PR"));
		theTree.print(System.out);
		
//		System.out.println("remove 321: " + theTree.remove("321"));
//		System.out.println("remove 31: " + theTree.remove("31"));
//		theTree.print(System.out);

		theTree.add("128", new Student("128","Xi","Xi", 21, 3.50, "SF"));
		theTree.print(System.out);
		System.out.println("Keys: ");
		printKeys(theTree.getKeys());
		System.out.println("Values: ");
		//printValues(theTree.getValues());
		System.out.println();
		theTree.print(System.out);
		System.out.println();
		theTree.remove("123");
		theTree.print(System.out);
		System.out.println("Done!");
	}

	private static void printValues(List<Student> values) {
		for (Student s: values){
			System.out.println(s);
		}
	}

	private static void printKeys(List<String> keys) {
		for (String s: keys){
			System.out.println(s);
		}
		
	}

}
