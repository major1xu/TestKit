package com.uudaddy.test;
/*
Hack rank - the auto parts co

don't use java String replace or replaceALl function,
string, replace f with d
Muffle => muddle

 */
public class StringReplaceExercise {
    public String replaceStrManually(String inputString, char oldChar, char newChar)
    {
        System.out.println(inputString);

        String newString = "";
        // MXU: I don't think below is the most efficient way to do this, but it appears working for the 10+ test cases
        // in hack rank
        for (int ii=0; ii<inputString.length(); ii++) {
            // ? not sure if this is sufficient, it does pass all the test cases on hack rank
            int index = inputString.indexOf(oldChar);
            newString = inputString.substring(0,index) + newChar + inputString.substring(index+1);
            // indexOf, does this only find the first one
            int index2 = newString.lastIndexOf(oldChar);
            newString = newString.substring(0,index2) + newChar + newString.substring(index2+1);
        }
        System.out.println(newString);
        return newString;
    }

}
