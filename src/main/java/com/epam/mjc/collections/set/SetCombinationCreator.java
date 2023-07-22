package com.epam.mjc.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> linkedHashSet = new LinkedHashSet<>();

        Iterator<String> iterator1 = firstSet.iterator();
        while (iterator1.hasNext()) {
            String element = iterator1.next();
            if (secondSet.contains(element) && !thirdSet.contains(element))
                linkedHashSet.add(element);
        }

        Iterator<String> iterator2 = thirdSet.iterator();
        while (iterator2.hasNext()) {
            String element = iterator2.next();
            if (!firstSet.contains(element) && !secondSet.contains(element))
                linkedHashSet.add(element);
        }

        return linkedHashSet;
    }
}
