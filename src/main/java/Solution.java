public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
        boolean bool = false;
        if (x.length() > 1) {
            if (x.substring(x.length()-2, x.length()).equals("ly")) {
            bool = true;
            }
        }
        return bool;
    }

    public String conCat(String s1, String s2) {
        String concat = "";
         if (s1.equals("") || s2.equals("")) {
            if (s1.equals("")) {
                concat = s2;
            } else {
                concat = s1;
            }
        } else if (s1.substring(s1.length()-1).equals(s2.substring(0, 1))) {
            concat = s1.substring(0, s1.length()-1) + s2;
        } else {
            concat = s1 + s2;
        }
        return concat;
    }

    public String withoutX(String s1) {
        String x = "";
        if (s1.substring(0, 1).equals("x") && s1.substring(s1.length()-1).equals("x")) {
            if (s1.equals("xx")) {
                x = "";
            } else {
                x = s1.substring(1, s1.length() - 1);
            } 
        } else if (s1.substring(0, 1).equals("x")) {
            if (s1.equals("x ")) {
                x = " ";
            } else {
                x = s1.substring(1, s1.length());
            }
        } else if (s1.substring(s1.length()-1).equals("x")) {
            if (s1.equals(" x")) {
                x = " ";
            } else {
                x = s1.substring(0, s1.length()-1);
            }
        }
        return x;
    }

    public String fizzString(String s1) {
        String fb = s1;
        if (s1.substring(0, 1).equals("f")) {
            fb = "Fizz";
        }
        if (s1.substring(s1.length()-1).equals("b")) {
            fb = "Buzz";
        }
        if (s1.substring(0, 1).equals("f") && s1.substring(s1.length()-1).equals("b")) {
            fb = "FizzBuzz";
        }
        return fb;
    }

    public String fizzString2(int x) {
        String fb = "";
        if ((x % 3 == 0) && (x % 5 == 0)) {
            fb = "FizzBuzz!";
        } else if (x % 3 == 0) {
            fb = "Fizz!";
        } else if (x % 5 == 0) {
            fb = "Buzz!";
        } else {
            fb = x + "!";
        }
        return fb;
    }

}
