package codingninjas.HashMap;

import java.util.ArrayList;

public class Map<K, V> {

    ArrayList<MapNode<K, V>> buckets;
    int size;
    int numBuckets;

    public Map() {
        numBuckets = 20;
        buckets = new ArrayList<>();

        for (int i = 0; i < buckets.size(); i++) {
            buckets.add(null);
        }

    }

    private int getBucketIndex(K key) {
        int hashcode = key.hashCode();
        return hashcode % numBuckets;
    }

    public void insert(K key, V value) {
        int bucketIndex = getBucketIndex(key);
    }

}
