package ua.edu.ucu.smartarr;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {

    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
        Object newArray[] = new Object[smartArray.size()];
        Object arr[] = smartArray.toArray();
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean distinct = true;
            for (int o = i; o < arr.length; o++) {
                if (i == o)
                    continue;
                if (arr[i].equals(arr[o])) {
                    distinct = false;
                    break;
                }
            }
            if (distinct) {
                newArray[a] = arr[i];
                a++;
            }

        }
        Object newNewArray[] = new Object[a];
        for (int o = 0; o < a; o++) {
            newNewArray[o] = newArray[o];
        }
        this.smartArray = new BaseArray(newNewArray);
    }

    @Override
    public String operationDescription() {
        return "DistDeco\n";
    }
}
