import java.util.LinkedList;

public class addtwonumbers {
	

		public static void main(String[] args) {
			LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
			LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
			LinkedList<Integer> linkedList3 = new LinkedList<Integer>();
			linkedList1.add(2);
			linkedList1.add(4);
			linkedList1.add(3);
			linkedList2.add(5);
			linkedList2.add(6);
			linkedList2.add(4);
			linkedList3 = addTwoLists(linkedList1,linkedList2);
			linkedList3.forEach(a -> System.out.print(" "+a));
		}
		private static LinkedList<integer> addTwoLists(LinkedList<integer> l1, LinkedList<integer> l2) {
			int carry =0;
			LinkedList<integer> l3 = new LinkedList<integer>();
			for(int i=l1.size()-1;i>=0;i--) {
				int parseInt = Integer.parseInt(l1.get(i).toString());
				int parseInt2 = Integer.parseInt(l2.get(i).toString());
				int sum =parseInt + parseInt2+carry;
				int value=sum%10;
				carry =sum/10;
				l3.add(value);
			}
			return l3;
		}
}
