/**
 * Created by Bálint on 2017. 07. 10..
 */
public class JumpInExercise {

  public static double averageOfEvenNumbers(int[] numbers) {
    int count = 0;
    int total = 0;

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 != 0) {
        count++;
        total += numbers[i];
      }
    }

    double avg = (double) total / (double) count;
    return avg;
  }
}
