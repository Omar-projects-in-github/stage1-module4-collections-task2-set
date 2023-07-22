package com.epam.mjc.collections.set;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> treeSet = new TreeSet<>();

        Iterator<Integer> iterator = sourceList.iterator();

        while (iterator.hasNext()) {
            int number = (int)Math.pow(iterator.next(), 2);
            if (number >= lowerBound && number <= upperBound)
                treeSet.add(number);
        }

        return treeSet;
    }
}
