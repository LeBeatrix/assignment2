package ac.za.cput.projects;

import java.util.*;

public class App 
{
    static String[] colors = {"red", "white", "blue", "green", "gray", "orange", "tan", "white", "cyan", "peach", "gray", "orange"};

    public static void main( String[] args ) {

        //List
        Collection<String> list = Arrays.asList(colors);
        System.out.println("*****************************************************************************************************");
        System.out.println("LIST AND SET");
        System.out.println();
        System.out.printf("List: %s%n", list);

        //eliminate duplicates

        printNonDuplicates(list);

        //Map
        Map<String, Integer> myMap = new HashMap<>();

        createMap(myMap);
        displayMap(myMap);

    }

    private static void createMap(Map<String, Integer> map)
    {
        String input = "this-is-a-sample-sentence-with-several-words-this-is-another-sample-sentence-with-several-different-words";

        String[] tokens = input.split("-");

        //Scanner scan = new Scanner(System.in);
        //System.out.println("Enter a String:");
        //String input = scan.nextLine();

        //String[] tokens = input.split(" ");

        for(String token : tokens)
        {
            String word = token.toLowerCase();

                if(map.containsKey(word))
                {
                    int count = map.get(word);
                    map.put(word, count+1);
                }
                    else
                        map.put(word, 1);
        }
    }

    private static void displayMap(Map<String, Integer> map)
    {
        Set<String> keys = map.keySet();

        //Sort keys
        TreeSet<String> sortedKeys = new TreeSet<>(keys);

        System.out.println();
        System.out.println("*****************************************************************************************************");
        System.out.println("MAP AND SET");
        System.out.println();
        System.out.printf("%nMap Contains:%nKey\t\tValues%n");

        //generate output for each key in map
        for(String key: sortedKeys)
            System.out.printf("%-10s%10s%n", key, map.get(key));

                System.out.println("*****************************************************************************************************");

                        System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());

        System.out.println("*****************************************************************************************************");

    }

    private static void printNonDuplicates(Collection<String> values)
    {
        //HashSet
        Set<String> set = new HashSet<>(values);

        System.out.printf("%nNonduplicates are: ");

        for(String value : set)
            System.out.printf("%s ",value);

        System.out.println();
    }
}
