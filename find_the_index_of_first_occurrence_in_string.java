//FIND_THE_INDEX_OF_FIRST_OCCURRENCE_IN_STRING
class Solution {
  public int strStr(String haystack, String needle) {
    int haystackLength = haystack.length();
    int needleLength = needle.length();
    if (needleLength == 0) {
      return 0;
    }
    for (int i = 0; i <= haystackLength - needleLength; i++) {
      int j = 0;
      while (j < needleLength && haystack.charAt(i + j) == needle.charAt(j)) {
        j++;
      }

      if (j == needleLength) {
        return i;
      }
    }

    return -1;
  }

}