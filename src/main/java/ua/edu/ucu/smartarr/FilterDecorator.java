package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator{

    public FilterDecorator(SmartArray smartArray, MyPredicate predicate) {
        super(smartArray);
        Object newArray[] = new Object[smartArray.size()];
        int i = 0;
        for (Object object:
             smartArray.toArray()) {
            if(predicate.test(object)) {
                newArray[i] = object;
                i++;
            }
        }
        Object newNewArray[] = new Object[i];
        for(int o=0;o<i;o++){
            newNewArray[o] = newArray[o];
        }
        this.smartArray = new BaseArray(newNewArray);
    }

    @Override
    public String operationDescription() {
        return "Filter Decorator.\n";
    }
}
