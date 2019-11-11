import java.util.ArrayList;
import java.util.List;

public class UnlimitedArray<T> {
    ArrayList<T> unlimitedArray = new ArrayList<>();

    public UnlimitedArray(int size){
        unlimitedArray = new ArrayList<>(size);
    }

    public T get(int index){
        if(index >= unlimitedArray.size()){
            return null;
        }
        else return unlimitedArray.get(index);
    }

    public void set(int index, T value){
        if(index >= unlimitedArray.size()){
            growArray();
            set(index,value);
        }
        else{
            unlimitedArray.set(index,value);
        }
    }

    private void growArray(){
        int desiredSize = unlimitedArray.size()*2;
        unlimitedArray.ensureCapacity(desiredSize);
        while(desiredSize >= unlimitedArray.size()){
            unlimitedArray.add(null);
        }
    }
}
