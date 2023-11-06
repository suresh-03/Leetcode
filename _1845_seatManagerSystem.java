import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class _1845_seatManagerSystem {
    class SeatManager {
    int num = 1;
    ArrayList<Integer> list = new ArrayList<>();
    HashSet<Integer> set;
    public SeatManager(int n) {
        set = new HashSet<>(n);
    }
    
    public int reserve() {
        if(!list.isEmpty()){
            Collections.sort(list);
            int temp = list.get(0);
            set.add(list.get(0));
            list.remove(0);
            return temp;

        }
        else{
            int temp = num;
            set.add(num);
            num++;
            return temp;
        }
    }
    
    public void unreserve(int seatNumber) {
        set.remove(seatNumber);
        list.add(0,seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
}
