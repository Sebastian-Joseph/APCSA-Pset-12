import java.util.ArrayList;

public class ProblemSet12 {

    public long factorial(int n) {

if (n <= 0) {
    return -1;
} else if (n >= 1) {
    return n * factorial(n-1);
}
return 1;
    }

    public long fibonacci(int n) {
    if(n < 0) {
        return -1;
    } if (n == 0 || n == 1) {
        return n;
        } else {
        return fibonacci(n-2) + fibonacci(n-1);
        }
    }

    public long triangle(int rows) {
    if (rows < 0){
        return -1;
    } else if (rows == 0) {
        return 0;
    }
    return rows + triangle(rows - 1);
    }

    public long sumDigits(int n) {
    if (n < 0) {
        return -1;
    }
    if (n ==0) {
        return 0;
    }
    return n % 10 + sumDigits(n / 10);
    }

    public long powerN(int base, int exponent) {
        if (base < 1 || exponent < 1) {
            return -1;
        } if (base == 1) {
            return 1;
        }
        return base * powerN(base, exponent - 1);

    }

    public String changeXY(String text) {
        if(text == null){
            return null;
        }
        if(text.length() == 0)
            return text;

        if(text.charAt(0) == 'x')
            return 'y' + changeXY(text.substring(1));

        return text.charAt(0) + changeXY(text.substring(1));

    }

    public int array11(int[] data, int index) {
        if(data == null){
            return -1;
        }

        if(index < 0){
            return -1;
        }
        if(index >= data.length)
            return 0;

        if(data[index] == 11)
            return 1 + array11(data, index + 1);

        return array11(data, index + 1);
    }

    public int strCount(String text, String sub) {
        if(text == null){
            return -1;
        }
        if(sub == null ){
            return -1;
        }
        if(sub.length() == 0){
            return -1;
        }
        if(text.length() < sub.length())
            return 0;

        if(text.substring(0, sub.length()).equals(sub))
            return 1 + strCount(text.substring(sub.length()), sub);

        return strCount(text.substring(1), sub);
    }

    public boolean strCopies(String text, String sub, int n) {
        if(text == null){
            return false;
        }
        if(sub == null ){
            return false;
        }
        if(sub.length() == 0){
            return false;
        }
        if(n<0){
            return false;
        }
        if(n == 0) {
            return true;
        }
        if(text.length() < sub.length()) {
            return false;
        }
        if(text.substring(0, sub.length()).equals(sub))
            return strCopies(text.substring(1), sub, n-1);

        return strCopies(text.substring(1), sub, n);
    }

    public int strDist(String text, String sub) {
        if(text == null){
            return -1;
        }
        if(sub == null ){
            return -1;
        }
        if(sub.length() == 0){
            return -1;
        }

        if(text.length() < sub.length()) {
            return 0;
        }
        if(text.substring(0, sub.length()).equals(sub) && text.substring(text.length() - sub.length()).equals(sub)) {
            return text.length();
        }
        if(!text.substring(0, sub.length()).equals(sub))
            return strDist(text.substring(1), sub);

        return strDist(text.substring(0, text.length()-1), sub);
    }
}