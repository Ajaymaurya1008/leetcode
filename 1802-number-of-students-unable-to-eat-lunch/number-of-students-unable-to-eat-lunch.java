class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q1 = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        for(int i:students){
            q1.add(i);
        }
        for(int i=sandwiches.length-1;i>-1;i--){
            s.push(sandwiches[i]);
        }
        int z = students.length;
        while(z>0){
            int m = s.peek();
            int n = q1.peek();
            int count =0;
            while(m!=n){
                q1.add(q1.remove());
                n=q1.peek();
                count++;
                System.out.println(q1);
                if(count>students.length){
                    return z;
                }
            }
            s.pop();
            q1.remove();
            z--;
        }
        return z;
    }
}