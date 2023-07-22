package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> modifiedSet = new HashSet<>();

        Iterator<Integer> iterator = sourceList.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 == 0) {
                while (number >= 1) {
                    modifiedSet.add(number);
                    number /= 2;
                }
            }
            else {
                modifiedSet.add(number);
                modifiedSet.add(2 * number);
            }
        }

        return modifiedSet;
    }
}
