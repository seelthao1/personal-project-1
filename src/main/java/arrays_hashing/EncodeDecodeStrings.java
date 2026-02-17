package arrays_hashing;

import java.util.*;

public class EncodeDecodeStrings {

    public String encode(List<String> strs) {
        if (strs == null || strs.isEmpty()) return "";

        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            if (str == null) str = ""; // optional: normalize nulls
            sb.append(str.length()).append('#').append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.isEmpty()) return result;

        int i = 0;
        while (i < s.length()) {
            int j = s.indexOf('#', i);
            if (j == -1) throw new IllegalArgumentException("Invalid encoding: missing #");

            int length = Integer.parseInt(s.substring(i, j));
            int start = j + 1;
            int end = start + length;

            if (end > s.length()) throw new IllegalArgumentException("Invalid encoding: length out of bounds");

            result.add(s.substring(start, end));
            i = end; // move to next token
        }
        return result;
    }
}