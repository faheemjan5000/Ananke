package demo;

import java.util.List;

public class StringListMethods {

	public String append(String orig, String s) {
		return orig+s;
	}
	public String insert(String orig, int offset, String str) {
		return orig.substring(0, offset)+str + orig.substring(offset);
	}
	public String delete(String orig, int start, int end) {
		return orig.substring(0, start)+ orig.substring(end);
	}
	public String deleteCharAt(String orig, int index) {
		return orig.substring(0, index)+ orig.substring(index+1);
	}
	public String reverse(String orig) {
		 StringBuilder sb = new StringBuilder(orig);
		 sb.reverse();
		 return sb.toString();
	}
	public boolean equals(List<Object> list1, List<Object> list2) {
		 if(list1.size()!=list2.size()) {
			 return false;
		 }
		 else
		 {
			 for(int i = 0; i<list1.size();i++) {
				 if(list1.get(i)!=list2.get(i)) {
					 return false;
				 }
			 }
		 }
		
		return true;
	}
	
}
