import java.util.ArrayList;

public class DynamicArray<A> {
    ArrayList<A> DynamicArray = new ArrayList<>();

    public DynamicArray(int size){
        DynamicArray = new ArrayList<>(size);
    }

    public void add(A value){
        
    }

    public A get(int index){
        if(index >= DynamicArray.size()){
            return null;
        }
        else return DynamicArray.get(index);
    }

    public void set(int index, A value){
        if(index >= DynamicArray.size()){
            growArray();
            set(index,value);
        }
        else{
            DynamicArray.set(index,value);
        }
    }


}