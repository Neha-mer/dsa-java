import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShopKeeperShoesProbelm {

    //{1,2,3,5,6,8}//ans 3, club the sets which have diff as 1


    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> a = new ArrayList<>(6);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(5);
        a.add(6);
        a.add(8);
        int box = 0;

        for (int i = 0; i < a.size(); i++) {

            if (a.get(i + 1) - a.get(i) > 1) {
                box++;
            }

        }

    }
}
