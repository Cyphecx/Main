package summer2017;

import java.security.MessageDigest;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class HashMap<T, K> implements Map<T,K>{
	LinkedList[] array;
	public HashMap(){
		array = new LinkedList[128];
		for(int i = 0; i < array.length; i++){
			array[i] = new LinkedList();
		}
	}
	public HashMap(int sSize){
		array = new LinkedList[sSize];
		for(int i = 0; i < array.length; i++){
			array[i] = new LinkedList();
		}
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean containsKey(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K get(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object put(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public K remove(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int Hash(T key){
		return key.hashCode();
	}
}