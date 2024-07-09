class Solution {
    public double averageWaitingTime(int[][] customers) {
        int[] arr = new int[customers.length];
        int time=customers[0][0];
        for(int i=0;i<customers.length;i++){
            int arrivalTime=customers[i][0];
            if(time>=arrivalTime){
                time+=customers[i][1];
            }else{
                time=arrivalTime+customers[i][1];
            }
            arr[i]=time-arrivalTime;
        }
        return average(arr);
    }
    
    public static double average(int[] arr){
        double sum=0;
        for(int i:arr) sum+=i;
        return sum/arr.length;
    }
}