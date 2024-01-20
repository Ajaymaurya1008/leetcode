class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] arr = new int[temperatures.length];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
                int prevday = s.pop();
                arr[prevday] = i - prevday;
            }
            s.push(i);
        }
        return arr;
    }
}

 // Brute force

        // for(int i=0;i<temperatures.length;i++){
        //     for(int j=i;j<temperatures.length;j++){
        //         if(temperatures[j]>temperatures[i]){
        //             arr[i]=j-i;
        //             break;
        //         }
        //     }
        // }