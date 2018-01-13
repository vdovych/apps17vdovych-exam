package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray{
    private Object[] values;
    public BaseArray(){
        values = new Object[1];
    }
    public BaseArray(Object[] objects){
        values = objects;
    }

    @Override
    public Object[] toArray() {
        return values;
    }

    @Override
    public String operationDescription() {
        return "Base Array.\n";
    }

    @Override
    public int size() {
        return values.length;
    }
}
