package fr.rouen.mastergil.tptest.bonus;

import java.util.HashSet;

public class StringManipulation {


    public static boolean a(String s) {
        if (s == null || s.length() == 0) return false;

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public int b(String s) {
        int count = 0;
        HashSet<Character> substring = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (!substring.contains(s.charAt(j)))
                    substring.add(s.charAt(j));
                else {
                    count = Math.max(substring.size(), count);
                    substring.clear();
                    break;
                }

                if (j == s.length() - 1)
                    count = Math.max(substring.size(), count);

            }
        }
        return count;
    }

    public String c(String[] strs) {
        if (strs.length == 0)
            return "";

        for (int i = strs[0].length(); i > 0; i--) {
            boolean isSame = true;
            String prefix = strs[0].substring(0, i);
            for (int j = 1; j < strs.length; j++) {
                if (!strs[j].startsWith(prefix)) {
                    isSame = false;
                    break;
                }
            }
            if (isSame)
                return strs[0].substring(0, i);
        }
        return "";
    }

    public int d(String S, String T) {
        int[][] f = new int[S.length() + 1][T.length() + 1];
        for (int k = 0; k < S.length(); k++)
            f[k][0] = 1;
        for (int i = 1; i <= S.length(); i++) {
            for (int j = 1; j <= T.length(); j++) {
                if (S.charAt(i - 1) == T.charAt(j - 1)) {
                    f[i][j] += f[i - 1][j] + f[i - 1][j - 1];
                } else {
                    f[i][j] += f[i - 1][j];
                }
            }
        }
        return f[S.length()][T.length()];
    }

    private String e(String str) {
        str = str.toLowerCase();
        str = str.replace("a", "4");
        str = str.replace("b", "8");
        str = str.replace("e", "3");
        str = str.replace("g", "9");
        str = str.replace("i", "1");
        str = str.replace("o", "0");
        str = str.replace("s", "5");
        str = str.replace("t", "7");
        str = str.replace("z", "2");
        return str;

    }
}
