package com.uudaddy.test;
/*
Problem 3
())) => out put 2, because 3 right parens - 1 left paren = 2
()() ==> outpiut 0
 */
public class FindBalanceExercise {
    public int findBalance(String inputString)
    {
        int count_left_parens = 0;
        int count_right_parens = 0;
        //System.out.println(inputString.length());

        for(int ii=0; ii<inputString.length(); ii++)
        {
            //System.out.println(ii);

            //System.out.println(inputString.substring(ii,ii+1));

            if( inputString.substring(ii,ii+1).equalsIgnoreCase("(") ) {
                count_left_parens++;
            }

            if( inputString.substring(ii,ii+1).equalsIgnoreCase(")") ) {
                count_right_parens++;
            }
        }

        //System.out.println(count_left_parens);
        //System.out.println(count_right_parens);

        return (count_left_parens>count_right_parens) ? count_left_parens-count_right_parens : count_right_parens-count_left_parens;
    }

}
