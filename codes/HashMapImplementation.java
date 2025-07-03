package DSA.codes;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;

public class HashMapImplementation {

    static class MyHashMap<K, V>{
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;
        private int n;
        private LinkedList<Node>[] buckets;

        private class Node{
            K key;
            V value;

            //Constructor.
            Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        public MyHashMap(){
            initBuckets(DEFAULT_CAPACITY);
            //DEFAULT CONSTRUCTOR.
        }

        //To form new buckets at every index of linkedlist.
        private void initBuckets(int N){
            buckets = new LinkedList[N];

            for(int i=0; i< buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunc(K key){
            int hc = key.hashCode();
            return (Math.abs(hc)) %  buckets.length;
        }
        public int size(){
            return n;
        }

        private int searchInBucket(LinkedList<Node> ll, K key){
            for(int i=0; i<ll.size(); i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }

        public int capacity(){
            return buckets.length;
        }

        public float loadFactor(){
            return (n*1.0f)/buckets.length;
        }
        public void rehash(){
            LinkedList<Node>[] oldBuckets = buckets;
            initBuckets(oldBuckets.length * 2);
            n=0;

            for(var buckets : oldBuckets){
                for(var node : buckets){
                    put(node.key, node.value);
                }
            }
        }
        public void put(K key, V value){
            int bucketIndex = hashFunc(key);
            LinkedList<Node> currBucket = buckets[bucketIndex];
            int ei = searchInBucket(currBucket, key);

            if(ei==-1){ //means key doesn't exists
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
            }
            else{ //key exsits
                Node currNode = currBucket.get(ei);
                currNode.value = value;
            }

            //threshold value = current capacity*load factor.
            //current capacity = buckets.length;
            if(n>=buckets.length*DEFAULT_LOAD_FACTOR){
                rehash();
            }
        }

        public V get(K key){
            int bucketIndex = hashFunc(key);
            LinkedList<Node> currBucket = buckets[bucketIndex];
            int ei = searchInBucket(currBucket, key);

            if(ei!=-1){ //Key exists
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
            return null;
        }

        public V remove(K key){
            int bucketIndex = hashFunc(key);
            LinkedList<Node> currBucket = buckets[bucketIndex];
            int ei = searchInBucket(currBucket, key);

            if(ei!=-1){
                Node currNode = currBucket.get(ei);
                V value = currNode.value;
                currBucket.remove(ei);
                n--;
                return value;
            }
            return null;
        }
    }
    public static void main(String[] args) {
        MyHashMap<String, Integer> mp = new MyHashMap<>();
        mp.put("ritik", 1);
        mp.put("gagan", 2);
        mp.put("sorab", 3);

        System.out.println(mp.get("sorab"));
        mp.remove("ritik");
        System.out.println(mp.get("ritik"));

        System.out.println(mp.capacity());
        System.out.println(mp.loadFactor());//<0.75
    }
}
