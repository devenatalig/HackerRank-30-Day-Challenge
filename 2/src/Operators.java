/**
 * Solution to Day 2: Operators.
 * See <a href="https://www.hackerrank.com/challenges/30-operators/problem">link</a>
 * @author devendiaz
 * @version 1.0
 */

class Operators {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    
    //Find tax dollar amount from percent
    double tax_amount = meal_cost * (double) tax_percent/100.00;
    //Find tip dollar amount from percent
    double tip_amount = meal_cost * (double) tip_percent/100.00;
    //Find the total cost of the meal
    double total = meal_cost + tax_amount + tip_amount;

    //print the total cost of the meal
    System.out.println(Math.round(total));
    
    //Math.round(float f) returns int
    //Math.round(double d) returns long 
    }
    
    public static void main(String[] args) {
        solve(50.00, 20, 5);
    }

}
