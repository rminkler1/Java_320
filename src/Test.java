public class Test {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
    }
}

class Case {
    int num;

    Case() {
        num = 1;
    }

    Case(int number) {
        num = number;
    }

    public void setNum(int number) {
        this.num = number;
    }

    public int getNum() {
        return num;
    }

}
