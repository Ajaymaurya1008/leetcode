import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int maximumWealth(int[][] accounts) {
        ArrayList<Integer> store = new ArrayList<Integer>();
        for(int i=0;i<accounts.length;i++){
            int addd=0;
            for(int j=0;j<accounts[i].length;j++){
                addd+=accounts[i][j];
                
            }
            store.add(addd);
        }
        int f=Collections.max(store);
        return f;
    }
}

