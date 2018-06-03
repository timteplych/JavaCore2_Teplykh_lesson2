package ru.ttv.javacore.Exceptions;

public class MyArrayDataException extends Exception {
    private int i;
    private int j;
    private int result;
    public MyArrayDataException(int i, int j, int result){
        this.i = i;
        this.j = j;
        this.result = result;
    }

    public String getErrorMessage(){
        return "Data cast error in cell: ("+i+","+j+"), result is: "+result;
    }
}
