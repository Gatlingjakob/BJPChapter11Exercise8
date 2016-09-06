import java.util.*;


/**
 * Created by Jakob on 31-08-2016.
 */
public class minLength {

    public static void main (String[] args) {

        Set<String> set= new HashSet<String>();
        set.addAll(Arrays.asList("Hi", "mate", "seems", "like", "you", "could", "use", "a", "hug"));


        System.out.println(minLengths(set));

    }

    public static int minLengths (Set<String> set){


Iterator countshortest = set.iterator();

String element =  countshortest.next().toString();
        int shorty = element.length();

        while (countshortest.hasNext()){
            String tempElement = countshortest.next().toString();
            int shortest = tempElement.length();

            if(shortest < shorty){
                shorty = shortest;
            }
        }
        if(shorty>0) {
            return shorty;
        }
        else {
            return 0;
        }
        }

    }






