package com.uudaddy.test;

/*
Hack rank - the auto parts co

Problem
% 4 && % 7 ==0 , Customer Service
%4 not %7 => Auto
% 7 not %4 => Parts
Rest just put out numbers (number is from 1 to 30)

string, replace f with d
Muffle => muddle

Problem 3
())) => out put 2, because 3 right parens - 1 left paren = 2

 */

public class ConditionsExercise {

    public void output(int lines) {
        for(int ii = 1; ii <= lines; ii++)
        {
            if( ii % 4 == 0  && ii % 7 == 0 )
            {
                System.out.println("Customer Service");
            }
            else if( ii % 4 == 0  && ii % 7 != 0 )
            {
                System.out.println("Auto");
            }
            else if( ii % 4 != 0  && ii % 7 == 0 )
            {
                System.out.println("Parts");
            }
            else
            {
                System.out.println(ii);
            }
        }
    }
}
