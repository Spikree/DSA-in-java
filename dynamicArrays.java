
public class dynamicArrays {  
    public static void main(String[] args) {
        // dynamic arrays are can change their size to their requirement
        // ArrayList<String> arrayList = new ArrayList<String>();

        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        dynamicArray.insert(0, "x");
        dynamicArray.delete("A");

        System.out.println(dynamicArray);
        System.out.println("size:" + dynamicArray.size);
        System.out.println("capacity:" + dynamicArray.capacity);
        System.out.println("empyt:" + dynamicArray.isEmpty());
    }
}

