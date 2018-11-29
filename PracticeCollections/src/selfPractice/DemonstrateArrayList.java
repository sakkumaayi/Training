package selfPractice;

import java.util.ArrayList;

public class DemonstrateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		ArrayList al=new ArrayList(n);
		for(int i=0;i<n;i++) {
			al.add(i);
		}
		System.out.println(al);
		
		ArrayList aladdall=new ArrayList(10);
		aladdall.addAll(al);
		aladdall.addAll(5, al);//// inserting all elements of al at sixth position
		System.out.println(aladdall);
		System.out.println(al.size());
		System.out.println(aladdall.size());
		System.out.println(al.get(3));//get element at 3rd index
		al.add(null);
		al.add(7);
		System.out.println(al);
		
		System.out.println(al.contains(null));
		System.out.println(al.contains(7));
		System.out.println(al.contains(10));
		
		
		System.out.println(al.isEmpty());
		
		
		ArrayList a= new ArrayList();
		System.out.println(a.isEmpty());
		
		/*void clear(): This method is used to remove all the elements from any list.
void add(int index, Object element): This method is used to insert a specific element at a specific position index in a list.
void trimToSize(): This method is used to trim the capacity of the instance of the ArrayLis to the list’s current size.
int indexOf(Object O): The index the first occurrence of a specific element is either returned, or -1 in case the element is not in the list.
int lastIndexOf(Object O): The index the last occurrence of a specific element is either returned, or -1 in case the element is not in the list.
Object clone(): This method is used to return a shallow copy of an ArrayList.
Object[] toArray(): This method is used to return an array containing all of the elements in the list in correct order.
Object[] toArray(Object[] O): It is also used to return an array containing all of the elements in this list in the correct order same as the previous method.
boolean addAll(Collection C): This method is used to append all the elements from a specific collection to the end of the mentioned list, in such a order that the values are returned by the specified collection’s iterator.
boolean add(Object o): This method is used to append a specificd element to the end of a list.
boolean addAll(int index, Collection C): Used to insert all of the elements starting at the specified position from a specific collection into the mentioned list.*/
	}

}
