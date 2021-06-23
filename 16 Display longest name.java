class GFG {
    String longest(String names[], int n) {
      int maxLength = 0;
      String longestString = null;
      for (String s : names) {
          if (s.length() > maxLength) {
              maxLength = s.length();
              longestString = s;
          }
      }
      return longestString;
}
}
