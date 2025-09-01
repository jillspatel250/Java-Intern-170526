//how to remove duplicate elements from an arratList

//ans:-
//1st way using LinkedHashSet
//2nd way using javaSteamAPI

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewQue {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,2,3,1,2,4,5,6,5,5,6,7,8,9,4,2));

        //1.LinkedHashSet
        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>(numbers);

        ArrayList<Integer> numbersWithOutDuplicates = new ArrayList<>(linkedHashSet);
        System.out.println(numbersWithOutDuplicates);

        System.out.println("----------------------");
        //2. using Streams:-
        ArrayList<Integer> marks=new ArrayList<>(Arrays.asList(1,2,2,3,1,2,4,5,6,5,5,6,7,8,9,4,2));
        //1 st way
        marks.stream().distinct().forEach(System.out::println);
        //2nd way
        List<Integer> marksListUnique=marks.stream().distinct().collect(Collectors.toList());
        System.out.println(marksListUnique);



    }
}
