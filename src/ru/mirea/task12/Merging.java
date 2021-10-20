package ru.mirea.task12;
import java.util.Arrays;
public class Merging {
    /*public void mergeSort(int[] source, int left, int right){
        int delimiter=left+((right-left)/2)+1;
        if (delimiter > 0 && right > (left+1)){
            mergeSort(source,left,delimiter-1);
            mergeSort(source,delimiter,right);
        }
        int[] buffer= new int[right-left+1];
        int cursor=left;
        for( int i=0;i<buffer.length;i++){
            if (delimiter>right||source[cursor]>source[delimiter]){
                buffer[i]=source[cursor];
                cursor++;
            }else
            {
                buffer[i]=source[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer,0,source,left,buffer.length);
    }*/
    public static void mergeSort(int[] array, int low, int high) {
        if (high <= low) return;

        int mid = (low+high)/2;
        mergeSort(array, low, mid);
        mergeSort(array, mid+1, high);
        merge(array, low, mid, high);
    }
    public static void merge(int[] array, int low, int mid, int high) {
        // Creating temporary subarrays
        int leftArray[] = new int[mid - low + 1];
        int rightArray[] = new int[high - mid];

        // Copying our subarrays into temporaries
        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = array[low + i];
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = array[mid + i + 1];

        // Iterators containing current index of temp subarrays
        int leftIndex = 0;
        int rightIndex = 0;

        // Copying from leftArray and rightArray back into array
        for (int i = low; i < high + 1; i++) {
            // If there are still uncopied elements in R and L, copy minimum of the two
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                // If all elements have been copied from rightArray, copy rest of leftArray
                array[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                // If all elements have been copied from leftArray, copy rest of rightArray
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
    public static void main(String[] args) {

        int[] array = new int[30];
        for (int i=0;i<array.length;i++) array[i]=(int)(Math.random()*100);
        System.out.println("Entered grades");
        for (int i=0;i<array.length;i++) System.out.print(array[i]+" ");
        mergeSort(array, 0, array.length-1);
        System.out.println();
        System.out.println(Arrays.toString(array));
        /*int[] grades=new int[20];
        for (int i=0;i<grades.length;i++) grades[i]=(int)(Math.random()*100);
        System.out.println("Entered grades");
        for (int i=0;i<grades.length;i++) System.out.print(grades[i]+" ");
        System.out.println();
        Merging m=new Merging();
        m.mergeSort(grades,0,grades.length);
        System.out.println("Obtained values");
        for (int i=0;i<grades.length;i++) System.out.print(grades[i]+" ");

    }*/

}}
