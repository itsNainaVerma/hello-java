package string;

public class StringComparison {

    public static void main(String[] args) {
        String s1 = "JAVA";
        String s2 = new String("JAVA");
        String s3 = new String("JAVA");
        String s4 = "JAVA";

        System.out.println(s1==s2);  //false
        System.out.println(s1==s4);  //true
        System.out.println(s2==s3);  //false
        System.out.println(s1.equals(s2)); //true
        System.out.println(s2.equals(s3));  //true
        System.out.println(s3.equals(s4));  //true
    }
}
