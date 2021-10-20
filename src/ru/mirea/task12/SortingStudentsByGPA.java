package ru.mirea.task12;

public class SortingStudentsByGPA implements Comparable {
    @Override
    /*public  void quickSort(int[] grades, int left, int right) {
        int data=grades[(left+right)/2];
        int leftMarker=left;
        int rightMarker=right;
        do{
            while(grades[leftMarker]<data) rightMarker--;
            if(leftMarker<=rightMarker){
                int tmp=grades[leftMarker];
                grades[leftMarker]=grades[rightMarker];
                grades[rightMarker]=tmp;
            }
            leftMarker++;
            rightMarker--;
        } while (leftMarker<= rightMarker);
        if(leftMarker<rightMarker) quickSort(grades,leftMarker,right);
        if (left<rightMarker) quickSort(grades,left,rightMarker);
    }*/
    public void quickSort(int[] array, int left, int right) {
        int leftMarker = left;
        int rightMarker = right;
        int temp = array[(leftMarker + rightMarker) / 2];
        do {
            // Двигаем левый маркер слева направо пока элемент больше, чем temp
            while (array[leftMarker] > temp) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент меньше, чем temp
            while (array[rightMarker] < temp) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    int buf = array[leftMarker];
                    array[leftMarker] = array[rightMarker];
                    array[rightMarker] = buf;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < right) {
            quickSort(array, leftMarker, right);
        }
        if (left < rightMarker) {
            quickSort(array, left, rightMarker);
        }
    }
    public static void main(String[] args) {

        int[] grades=new int[30];
        for (int i=0;i<20;i++) grades[i]=(int)(Math.random()*100);
        System.out.println("Entered grades");
        for (int i=0;i<20;i++) System.out.print(grades[i]+" ");
        System.out.println();
        SortingStudentsByGPA s=new SortingStudentsByGPA();
        s.quickSort(grades,0,20);
        System.out.println("Obtained values");
        for (int i=0;i<20;i++) System.out.print(grades[i]+" ");

    }


    }

