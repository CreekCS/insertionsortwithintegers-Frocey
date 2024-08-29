import java.util.*;  
import java.io.File;
import java.io.FileNotFoundException;

public class InsSortInt {
    public static void main(String[] args) throws FileNotFoundException{
        ArrayList<Integer> nums = new ArrayList<>();
        try{
            Scanner scanner = new Scanner(new File("randInts.txt"));
            while (scanner.hasNext()){
            nums.add(scanner.nextInt());
            }
        }
        catch(FileNotFoundException ex){
            System.out.println("file not found");
        }
        InsSort(nums);
        System.out.println("the smallest number is: " + nums.get(0));
        System.out.println("the Largest number is: " + nums.get(nums.size()-1));

    }
    public static void InsSort(ArrayList<Integer> newList){
        for(int i = 1; i < newList.size(); i++){
            int key = newList.get(i);
            int j = i-1;
            while(j>=0 && newList.get(j) > key){
                newList.set(j+1,newList.get(j));
                j=j-1;
            }
            newList.set(j+1,key);
        }
        
    }
    
}
