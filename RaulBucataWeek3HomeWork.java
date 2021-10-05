import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;


public class RaulBucataWeek3HomeWork {


    public static void main(String[] args) {
        System.out.println("The result for exercise 1 is :");
        exercise1w2();
        System.out.println("The result for exercise 2 is :");
        exercise2w2();
        System.out.println("The result for exercise 3 is :");
        exercise3w2();
        System.out.println("The result for exercise 4 is :");
        exercise4w2();

    }
    public static void exercise1w2(){

        String s1 = "viezure";
        String s2 = "veverita";


        if (s1 == s2) {
            System.out.println("Strings are the same");
        } else
            System.out.println("Strings are different");
        String stringUnit = s1.concat(s2);
        System.out.println("This string is concated:" + stringUnit);
    }


    public static void exercise2w2(){
        String pal = "radar";
        String reverse = "";

        for (int i = pal.length() - 1; i >= 0; i--) {
            reverse += pal.charAt(i);
        }
        boolean palindrome = true;
        for (int i = 0; i < pal.length(); i++) {
            if (pal.charAt(i) != reverse.charAt(i)) {
                palindrome = false;
            }
        }
        if (palindrome) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT A PALINDROME");
        }
    }
    public static void exercise3w2() {


        String emptyString = "";
        String[] emptyArray = {""};
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("CoLeaGues");
        lista.add("afTerClaSS");
        lista.add("extrA");
        lista.add("no");

//Exercise 3a://
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

//Exercise 3ai://
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).startsWith("A") || lista.get(i).startsWith("a") || lista.get(i).startsWith("E") ||
                    lista.get(i).startsWith("e") || lista.get(i).startsWith("I") || lista.get(i).startsWith("i") ||
                    lista.get(i).startsWith("O") || lista.get(i).startsWith("o") || lista.get(i).startsWith("U") ||
                    lista.get(i).startsWith("u")) {
                emptyString = lista.get(i).toLowerCase();
                System.out.println("Words that start with a vowel are: " + emptyString);
            } else for (int j = 0; j < emptyArray.length; j++) {
                emptyArray[j] = lista.get(i).toUpperCase();
                System.out.println("Words that start with a consonant are: " + emptyArray[j]);
            }
        }

//Exercise 3aii://
        for (String word : lista) {
            if (word.indexOf('x') != -1 || word.indexOf('X') != -1 || word.length() < 3) {
                System.out.println("skipped " + word);
            }
        }

    }
    //Exercise 4a://
    public static void exercise4w2() {
        HashMap<String, String> entries = new HashMap<String, String>();
        entries.put("Anton Andrei", "anton@andrei.com");
        entries.put("Bogdan Barbulovici", "bogdan@barbulovici.com");
        entries.put("Cosmin Cotet", "cosmin@cotet.com");
        entries.put("Dan Diaconescu", "dan@diaconescu.com");
        entries.put("Elena Elvis", "elena@elvis.com");

        //Exercise 4b://
        System.out.println("Map size:" + entries.size());

        //Exercise 4c://

        System.out.println("Does the map contain the name Elena Elvis?: " + entries.containsKey("Elena Elvis"));

        //Exercise 4d://
        if (entries.containsKey("Anton Andrei")) {
            System.out.println("The email is: " + "anton@andrei.com");
        }


        //Exercise 4e://
        String removed = (String) entries.remove("Anton");
        System.out.println("Updated list of entries with the removed entry: " + entries);

        //Exercise 4f://
        TreeMap<String, String> sortedUsers = new TreeMap<>(entries);
        System.out.println("The sorted map by key looks like this: " + sortedUsers);
    }
}


