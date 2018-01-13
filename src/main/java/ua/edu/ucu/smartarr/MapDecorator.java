package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {

    public MapDecorator(SmartArray smartArray, MyFunction function) {
        super(smartArray);
        Object newArray[] = new Object[smartArray.size()];
        int i = 0;
        for (Object object :
                smartArray.toArray()) {
            object = function.apply(object);
            newArray[i] = object;
            i++;
        }
        this.smartArray = new BaseArray(newArray);
    }


    @Override
    public String operationDescription() {
        return "MapDeco\n";
    }
}
