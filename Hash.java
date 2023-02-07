import java.util.ArrayList;

public class Hash {
  private ArrayList<ArrayList<Integer>> buckets;
  private int size;

  public Hash(int size) {
    this.buckets = new ArrayList<>(size);
    for(int i = 0; i<size; i++) {
      this.buckets.add(new ArrayList<>());
    }
    this.size = size;
  }

  private int hash(int key) {
    return key % this.size;
  }

  public void add(int key, int value) {
    int index = hash(key);
    buckets.get(index).add(value);
  }

  public ArrayList<Integer> get(int key) {
    int index = hash(key);
    return buckets.get(index);
  }

  public void remove(int key, int value) {
    int index = hash(key);
    buckets.get(index).remove(new Integer(value));
  }
}
