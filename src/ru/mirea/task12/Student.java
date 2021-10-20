package ru.mirea.task12;

public class Student {
    public static void main(String[] args) {
    int[] idNumber=new int[20];
    for (int i=0;i<20;i++) idNumber[i]=(int)(Math.random()*200);
        System.out.println("Entered values");
    for (int i=0;i<20;i++) System.out.print(idNumber[i]+" ");
        System.out.println();
    for(int left=0; left<20;left++){
        int data=idNumber[left];
        int i=left-1;
        while(i>=0){
            if(data<idNumber[i]) idNumber[i+1]=idNumber[i];
            else break;
            i--;
        }
        idNumber[i+1]=data;
    }
        System.out.println("Obtained values");
    for (int i=0;i<20;i++) System.out.print(idNumber[i]+" ");
}}
