package string;

public class AddingStringAndNumbers {
        public static void main(String[] args) {
            String s="JAVA";
            String s1=new String("JAVA");
            System.out.println(4+4+""+8+4);  // o/p- 884
            System.out.println(80+80+"Selenium"+40+40);  // 160Selenium4040
            System.out.println(40+40); //80
            System.out.println(80+80+1+s+40+40); //161JAVA4040
            System.out.println(80+80+1+s1+40+40); //161JAVA4040
            System.out.println("hello"+80+80+"Selenium"+40+40); //hello8080Selenium4040
            System.out.println("hello"+80+80+"Selenium"+(40+40));   //hello8080Selenium80
        }
}
