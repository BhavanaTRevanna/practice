package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

import org.testng.annotations.Test;


public class Collections {
	@Test
	public  void treemap() {
	   TreeMap<Object, Object> ht=new TreeMap<Object, Object>();
		ht.put("Bhavana", "test engineer");
		ht.put("Sinchana", "test engineer");
		ht.put("Prashanth", "garage");
		ht.put("Tanya","test eng");
		ht.put("Prashanth", "garage");
		ht.put("shivu", "test eng");
		for(Entry<Object, Object> h:ht.entrySet()) {
			System.out.println(h.getKey()+"--->"+h.getValue());
		}
	}
	@Test
	public  void hashmap() {
		HashMap<Object, Object> map=new HashMap<Object, Object>();
		map.put("Bhavana", "test engineer");
		map.put("Sinchana", "test engineer");
		map.put("Prashanth", "test engineer");
		map.put(null, null);
		map.put("Bhavana", null);
		map.put(1, "Bhavana");
		map.put(2, "bbbb");
		map.put(3, "ccc");
		
		for(Entry<Object, Object> h:map.entrySet()) {
			System.out.println(h.getKey()+"--->"+h.getValue());
		}
		
	}
	@Test
	public  void hashtable() {
		Hashtable<Object, Object> ht=new Hashtable<Object, Object>();
		ht.put("Bhavana", "test engineer");
		ht.put("Sinchana", "test engineer");
		ht.put("Prashanth", "garage");
		ht.put("Tanya", "test eng");
		ht.put("shivu", "test eng");
		for(Entry<Object, Object> h:ht.entrySet()) {
			System.out.println(h.getKey()+"--->"+h.getValue());
		}
		
	}
	@Test
	public  void treeset() {
		TreeSet<Object> ts=new TreeSet<Object>();
		ts.add(1);
		ts.add(3);
		ts.add(6);
		ts.add(0);
		System.out.println(ts);
		
	}
	@Test
	public  static void linkedhs() {
		LinkedHashSet<Object> lhs=new LinkedHashSet<Object>();
		lhs.add(1);
		lhs.add("123");
		lhs.add(null);
		lhs.add("123456");
		System.out.println(lhs);
		
	}
	@Test
	public  void arrayList() {
		ArrayList<Object> alist=new ArrayList<Object>();
		alist.add(2);
		alist.add("bhavana");
		alist.add(null);
		alist.add(1);
		alist.add("sinchana");
		alist.add(null);
		System.out.println(alist);
	}
	@Test
	public  void list() {
		List<Object> list=new ArrayList<Object>();
		list.add(1);
		list.add("prashanth");
		list.add(null);
		list.add(1);
		list.add("tanya");
		list.add(null);
		System.out.println(list);
	}
	@Test
	public  void priorityQueue() {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(1);
		pq.add(10);
		pq.add(4);
		pq.add(3);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
	}
	@Test
	public  void linkedlist() {

		LinkedList<Object> ll=new LinkedList<Object>();
		ll.add(1);
		ll.add("Shivu");
		ll.addFirst("hii");
		ll.addLast("Bye");
		ll.add(1);
		ll.add(null);
		System.out.println(ll.getFirst());
	}
	@Test
	public  void hashset() {
		HashSet<Object> hs=new HashSet<Object>();
		hs.add(1);
		hs.add("123");
		hs.add(null);
		hs.add(null);
		
		Iterator<Object> i=hs.iterator();
		while (i.hasNext()) {
			Object object = (Object) i.next();
			System.out.println(object);
		}
	}
	

}
