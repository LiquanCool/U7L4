import java.util.ArrayList;
import java.util.Locale;

public class ArrayListAlgorithms {
    public static boolean containsTarget(ArrayList<String> stringList, String target)
    {
        for (int i = 0;i<stringList.size();i++)
        {
            if (stringList.get(i).indexOf(target)>=0)
            {
                return true;
            }
        }
        return false;
    }
    public static int belowAverage(ArrayList<Integer> intList)
    {
        double average = 0;
        double total =0;
        int count = 0;
        for (int i = 0;i<intList.size();i++)
        {
            total+=intList.get(i);
            count++;
        }
        average = total/count;
        count =0;
        for (int i = 0;i<intList.size();i++)
        {
            if (intList.get(i)<average)
            {
                count++;
            }
        }
        return count;
    }
    public static void replaceWithCaps(ArrayList<String> wordList)
    {
        for (int i = 0;i<wordList.size();i++)
        {
            if (wordList.get(i).substring(wordList.get(i).length()-1).equals("s"))
            {
                wordList.set(i,wordList.get(i).toUpperCase());
            }
        }
    }
    public static int indexOfMinimum(ArrayList<Integer> intList)
    {
        int minimum = intList.get(0);
        int index = 0;
        for (int i = 1;i<intList.size();i++)
        {
            if(intList.get(i)<minimum)
            {
                minimum = intList.get(i);
                index = i;
            }
        }
        return index;
    }
}
