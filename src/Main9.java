import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main9 {
    public static void main(String[] args) {
        ArrayList<String> list = generateParens(6);
        System.out.println(list);
        System.out.println(list.size());
    }


    public static void addParen(ArrayList list, int leftRem, int rightRem, char[] str, int index) {
        if (leftRem < 0 || rightRem < leftRem) return;

        if (leftRem == 0 && rightRem == 0) {
            list.add(String.copyValueOf(str));
        } else {
            str[index] = '(';
            addParen(list, leftRem - 1, rightRem, str, index + 1);

            str[index] = ')';
            addParen(list, leftRem, rightRem - 1, str, index + 1);
        }
    }

        public static ArrayList generateParens ( int count){
            char[] str = new char[count * 2];
            ArrayList list = new ArrayList();
            addParen(list, count, count, str, 0);
            return list;
        }
    }

