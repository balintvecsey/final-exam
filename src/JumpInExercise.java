/**
 * Created by Bálint on 2017. 07. 10..
 */
public class JumpInExercise {

  public static double averageOfEvenNumbers(int[] numbers) {
    int count = 0;
    int total = 0;

    for (int number : numbers) {
      if (number % 2 != 0) {
        count++;
        total += number;
      }
    }

    return (double) total / (double) count;
  }
}
