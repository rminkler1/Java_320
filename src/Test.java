public class Test{

  public static void main(String [] arrg){

    int dayNum = 6;
    
    String result = switch (dayNum) {
        case 0      -> "Sunday";
        case 1      -> "Monday";
        case 2      -> "Tuesday";
        case 3      -> "Wednesday";
        case 4      -> "Thursday";
        case 5      -> "Friday";
        case 6      -> "Saturday";
        default -> throw new IllegalStateException("Unexpected value: " + dayNum);
    };

    System.out.println(result);

  }

}