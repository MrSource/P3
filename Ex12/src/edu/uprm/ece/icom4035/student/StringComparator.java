package edu.uprm.ece.icom4035.student;

import edu.uprm.ece.icom4035.bst.KeyComparator;

public class StringComparator implements KeyComparator<String> {

	@Override
	public int compareTo(String key1, String key2) {
		// TODO Auto-generated method stub
		return key1.compareTo(key2);
	}


}
