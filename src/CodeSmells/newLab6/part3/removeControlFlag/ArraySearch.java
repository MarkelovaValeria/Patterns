package CodeSmells.newLab6.part3.removeControlFlag;

public class ArraySearch {
    public void searchElement(int[] array, int target){
        for(int i = 0; i < array.length; i++){
            if(array[i] == target){
                System.out.println("Element found");
                return;
            }
        }
        System.out.println("Element not found");
    }
}
