import java.math.BigInteger;
import java.security.MessageDigest;

public class MyHashMap {
    int n;
    //buckets to store data

    Node[] buckets;
    public MyHashMap(int buckets){
        n=buckets;
        this.buckets=new Node[n];

    }
    public MyHashMap(){
        this(100);
    }

    //hashing function
    private int hash(String key) {
        try {
            return Math.abs(new BigInteger(MessageDigest.getInstance("MD5").digest(key.getBytes())).intValue());
        } catch(Exception e) {
            return 0;
        }
    }

    public void put(String key,String value){
        int hashCode=hash(key);
        int idx=hashCode&(n-1);
        if(buckets[idx]==null){
            Node node =new Node(key,value);
            buckets[idx]=node;
        }
        else{
            buckets[idx].put(key,value);
        }



    }


public String get(String key){
        int hashCode=hash(key);
    int idx = hashCode&(n-1);
    if (buckets[idx] == null) {
        return null;
    }
    else {
        return buckets[idx].get(key);
    }
}


    public static void main(String[] args) {

        MyHashMap map = new MyHashMap(100);

    }
}
