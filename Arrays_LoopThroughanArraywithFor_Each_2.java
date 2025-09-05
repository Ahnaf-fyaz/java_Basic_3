public class Arrays_LoopThroughanArraywithFor_Each_2 {
  public static void main(String[] args) {
    String[] seats = {"Jenny", "Liam", "Angie", "Bo"};

    for (int i = 0; i < seats.length; i++) {
      System.out.println("Seat number " + i + " is taken by " + seats[i]);
    }
  }
}
