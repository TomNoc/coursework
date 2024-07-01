
/**
 * Simulates rolling dice.
 * 
 * @Thomas Nocera    
 * @2/8/15
 */
public class RollingDice
{
    public static void main(String[] args)
    {
        int dice1, dice2, total;
        dice1 = (int) (Math.random() * 6 + 1);
        System.out.println("The first dice rolled: " + dice1);
        dice2 = (int) (Math.random() * 6 + 1);
        System.out.println("The second dice rolled: " + dice2);
        total = dice1 + dice2;
        System.out.println("The sum of the dice is: " + total);
    }
}
