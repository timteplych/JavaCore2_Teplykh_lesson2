package ru.ttv.javacore;

import ru.ttv.javacore.Exceptions.MyArrayDataException;
import ru.ttv.javacore.Exceptions.MyArraySizeException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        String[][] array =  new String[][]{{"2", "4", "7", "0"}, {"2", "5", "2", "0"}, {"2", "5", "7", "0"},  {"2", "5", "7", "0"}};
        try {
           int result = processArray(array);
           System.out.println("Result is: "+result);
        } catch (MyArraySizeException e) {
            System.out.println("Array size mismatch!");
        }catch (MyArrayDataException e){
            System.out.println(e.getErrorMessage());
        }
    }

    private static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if(array.length > 4 || array[0].length > 4){
            throw new MyArraySizeException();
        }

        int sum = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                try{
                    sum += Integer.parseInt(array[i][j]);
                }catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, sum);
                }

            }
        }
        return sum;
    }
}
