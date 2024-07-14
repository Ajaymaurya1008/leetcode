class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count=numBottles;
        int fullBottles=numBottles;
        int emptyBottles=numBottles;
        while(emptyBottles>=numExchange){
            fullBottles=emptyBottles/numExchange;
            System.out.println("fullBottles "+fullBottles);
            count+=fullBottles;
            System.out.println("count "+count);
            emptyBottles=fullBottles+emptyBottles%numExchange;
            System.out.println("emptyBottles "+emptyBottles);
        }

        return count;
    }
}