class Solution {
  public int minOperations(String s) {
    var cnt = 0;
    var n = s.length();

    for (var i=0; i<n; i++) {
      if (i % 2 == 0) {
        if (s.charAt(i) == '0') cnt++;
      } else {
        if (s.charAt(i) == '1') cnt++;
      }
    }
    return Math.min(cnt, n - cnt);
  }
}