package com.hashmap;

class Hashmap<K,V> {

	 static class Entry<K, V> {
         K key;
         public K getKey() {
			return key;
		}
		public V getValue() {
			return value;
		}

		V value;
         public Entry<K, V> getNext() {
			return next;
		}
		public void setNext(Entry<K, V> next) {
			this.next = next;
		}
		public void setKey(K key) {
			this.key = key;
		}
		public void setValue(V value) {
			this.value = value;
		}

		Entry<K,V> next;
     
         public Entry(K key, V value, Entry<K,V> next){
             this.key = key;
             this.value = value;
             this.next = next;
         }
     }
     
	static int SIZE = 16;
	Entry<K,V>[] table;

	@SuppressWarnings("unchecked")
	Hashmap(int Capacity) {
		table=new Entry[Capacity];
	}

	public  void put(K k, V v) {

		int hash = k.hashCode()%16;
		Entry<K,V> e = table[hash];
		Entry<K,V> newEntry = new Entry<K,V>(k, v,null);
		if (e != null) {
			while (e.next != null) {
				if (e.getKey().equals(k)) {
					e.setValue(v);
				}
				else
				e = e.next;
			}
			if (e.next == null) {
				if (e.getKey().equals(k)) {
					e.setValue(v);
				}
				else{
				e.next = newEntry;}
			}
		} else {
			table[hash] = newEntry;
		}

	}

	Entry<K,V> get(String k) {
		int hash = k.hashCode()%16;
		Entry<K,V> e = table[hash];
		while (e != null) {
			if (e.getKey().equals(k)) {
				return e;
			}
			e = e.next;
		}

		return null;
	}
	
	public void display(){
		for(int i=0;i<SIZE;i++){
			if(table[i]!=null){
			Entry<K,V> e=table[i];
			while(e!=null){
				System.out.println(e.getKey() + "" + e.getValue());
			    e=e.next;
			}
		}}
	}

}
