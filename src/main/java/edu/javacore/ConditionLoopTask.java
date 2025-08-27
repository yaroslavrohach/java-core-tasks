package edu.javacore;

public class ConditionLoopTask {
    /* https://www.e-olymp.com/en/problems/902
    Determine the level of educational achievements for the pupil (elementary, average, sufficient, high) according to the given grade (from 1 to 12).

    Input
        One number that is a grade for the pupil.

    Output
        Print Initial for elementary level (grade from 1 to 3), Average for average level (grade from 4 to 6), Sufficient for sufficient level (grade from 7 to 9) and High for high level (grade from 10 to 12).
    */
    public String levelEducationAchievements(int grade) {
        switch (grade) {
            case 1: case 2: case 3: return "Initial"; 
            case 4: case 5: case 6: return "Average";
            case 7: case 8: case 9: return "Sufficient";
            case 10: case 11: case 12: return "High";
        }
        return null;
    }

    /* https://www.e-olymp.com/en/problems/923
    Determine the season name by the month number using the compound conditions.

    Input
        The number of the month.

    Output
        For spring months print Spring, for summer - Summer, for autumn - Autumn and for winter - Winter.
     */
    public String season(int month) {
        if ( month == 12 || month < 3 && month > 0 ) {
            return "Winter";
        }
        else if (month > 2 && month < 6) {
            return "Spring";        
        }
        else if (month >5 && month < 9) {
            return "Summer";
        }
        else if (month > 8 && month < 12)
        {
            return "Autumn";
        }
        return null;
    }

    /* https://www.e-olymp.com/en/problems/107
    Blank compact discs are on sale in packages of three kinds. A package with 100 disсs costs 100 UAH, one with 20 discs costs 30 UAH, and one disс costs 2 UAH. What minimal sum of money should you pay to buy n such disсs?

    Input
        The natural number n (n ≤ 1000).

    Output
        Print the minimal sum to buy n disсs.
 */
    public int compactDiscs(int numberOfDiscs) {
        return 0;
    }

    /* https://www.e-olymp.com/en/problems/918
    Which quarter?
        It set a point with co-ordinates х and y. Define, in what co-ordinate quarter it is located.

    Input
        In a unique line through a blank 2 material numbers - co-ordinates of a point are set, value of co-ordinates on the module do not exceed 100.

    Output
        The singular is the number of a corresponding quarter, or 0 if unequivocally define a quarter it is impossible.
     */
    public int whichQuarter(int x, int y) {
        return 0;
    }

    /*https://www.e-olymp.com/en/problems/903
    First or last?
        Three digit number is given. What digit is bigger: the first digit or the last digit?

    Input
        One three digit number.

    Output
        Print the bigger digit between first and last. In case of equality, print "=" (without quotes).
    */
    public String firstOrLast(int number) {
        return null;
    }

    /*https://www.e-olymp.com/en/problems/108
    Median number
        Three different numbers a, b, c are given. Print the median number.

    Input
        Integers a, b, c that do not exceed 1000 by absolute value.

    Output
        Print the median among three numbers.
     */
    public int medianNumber(int a, int b, int c) {
        return 0;
    }

    /*https://www.e-olymp.com/en/problems/906
    Product of digits
        Three digital number is given. Find the product of its digits.

    Input
        One three digital positive integer n.

    Output
        Print the product of digits in n.
     */
    public int productOfDigits(int digit) {
        return 0;
    }

    /*https://www.e-olymp.com/en/problems/2
    Digits
        Find the number of digits in a non-negative integer n.

    Input
        One non-negative integer n (0 ≤ n ≤ 2 *109).

    Output
        Print the number of digits in number n.
     */
    public int numberOfDigits(int digit) {
        return 0;
    }
}
