package NGS.NHN.code.day07;

import java.util.Iterator;

public class Utilities {
    public static int max(int i, int j) {
        if (i > j)
            return i;
        else 
            return j;
    }

    public static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

    public static int swap2(int i, int j) {
        return i;
    }

    public static String reverseString(String s) {
        String result = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            result = result + s.charAt(i);
        }

        return result;
    }

    public static boolean isCharSequence(Object object) {
        if (object instanceof CharSequence) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void display(Object item) {
        IPrintable iPrintable;
        if (item instanceof IPrintable) {
            iPrintable = (IPrintable)item;
            iPrintable.print();
        } else {
            System.out.println(item.toString());
        }
    }
}

class TypeMain {
    public static void main(String[] args) {
        int i = 0;
        Integer number = 1;
        String s = "Hello";

        System.out.println(Utilities.isCharSequence(i));
        System.out.println(Utilities.isCharSequence(number));
        System.out.println(Utilities.isCharSequence(s));

        Message message = new Message("Greetings");
        Utilities.display(number);
        Utilities.display(message);
    }
}
