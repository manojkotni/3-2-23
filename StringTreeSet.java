package set;

import java.util.Set;
import java.util.TreeSet;

import comparator.StringComparator;

public class StringTreeSet {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<>(new StringComparator());

		set.add("aaaasas");
		set.add("fgdfgfd");
		set.add("dddaasdade");
		set.add("mno");

		for (String obj : set) {
			System.out.println(obj);
		}

	}

}
