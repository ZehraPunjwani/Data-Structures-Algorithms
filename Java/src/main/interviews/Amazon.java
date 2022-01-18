package main.interviews;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Amazon {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        System.out.println(splitIntoTwo(Arrays.asList(10,4,-8,7)));
        System.out.println(splitIntoTwo(Arrays.asList(5, -3, -2, 10, 20, -30)));

        System.out.println(maxEvents(Arrays.asList(1, 3, 3, 5, 7), Arrays.asList(2, 2, 1, 2, 1)));
    }

    public static int getSum(List<Integer> arr) {
        int counter = 0;
        for(int i = 0; i < arr.size(); i++) {
            counter += arr.get(i);
        }

        return counter;
    }

    public static int splitIntoTwo(List<Integer> arr) {
        int counter = 0;
        if(arr.size() == 2 && arr.get(0) > arr.get(1)) {
            counter++;
        }
        if(arr.size() > 2) {
            for (int i = 1; i < arr.size() - 1; i++) {
                List<Integer> sec1 = arr.subList(0, i);
                List<Integer> sec2 = arr.subList(i, arr.size());

                if (!(sec1.isEmpty() && sec2.isEmpty()) && (getSum(sec1) > getSum(sec2))) {
                    counter++;
                }
            }
        }

        return counter;
    }

    public static int maxEvents(List<Integer> arrival, List<Integer> duration) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < arrival.size(); i++) {
            list.add(Arrays.asList(arrival.get(i), arrival.get(i) + duration.get(i)));
        }
        list.sort(Comparator.comparingInt(i -> i.get(1)));

        int numberOfPresentations = 0;
        int TimeOfPrevDeparture = 0;

        for (List<Integer> i : list) {
            if (i.get(0) >= TimeOfPrevDeparture) {
                numberOfPresentations++;
                TimeOfPrevDeparture = i.get(1);
            }
        }

        return numberOfPresentations;
    }


}
