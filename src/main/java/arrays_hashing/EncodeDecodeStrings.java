package arrays_hashing;

import java.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.lang.StringBuilder;
/**
 * LeetCode Problem: Encode and Decode Strings
 * Description: Design an algorithm to encode a list of strings to a single string and decode it back.
 */
public class EncodeDecodeStrings {
    public String encode(List<String> strs) {
        if (strs == null || strs.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str:strs) {
            sb.append(str.length())
                    .append('#')
                    .append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str){
            List<String> decoded = new ArrayList<>();

            if(str == null || str.isEmpty()){
                return decoded;
            }

            int i = 0;

            while (i<str.length()){
                int delimiter = str.indexOf('#', i);

                int length = Integer.parseInt(
                        str.substring(i, delimiter)
                );

                int start = delimiter + 1;
                int end = start + length;
                decoded.add(str.substring(start, end));

                i = end;
            }
            return decoded;
    }

}