package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator{

    public SortDecorator(SmartArray smartArray, MyComparator comparator) {
        super(smartArray);
        Object newArray[] = smartArray.toArray();
        Arrays.sort(newArray, comparator);
        this.smartArray = new BaseArray(newArray);
    }

    @Override
    public String operationDescription() {
        return "SortDeco\n";
    }
}
