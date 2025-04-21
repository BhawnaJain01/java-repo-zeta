public class Operations {
    public static void main(String[] args){
        int age=18;
        int secondage=10;
        //arithmetics operator
        System.out.println("ARITHMETIC OPERATORS");

        int nextage=age+1;
        System.out.println(nextage);
        System.out.println(nextage%2);

        //relational operator
        System.out.println("RELATIONAL OPERATORS");

        boolean isage= age>18;
        boolean isequal= age==18;
        System.out.println(isage);
        System.out.println(isequal);

        //assignment operator
        System.out.println("ASSIGNMENT OPERATORS");

        age+=1;
        age=17;
        System.out.println(age);
        age-=1;
        System.out.println(age);
        age%=2;
        System.out.println(age);

        //unary operator
        System.out.println("UNARY OPERATORS");

        int unaryage= -age;
        System.out.println(unaryage);
        int plusage= +age;
        System.out.println(plusage);

        //ternary operator
        System.out.println("TERNARY OPERATORS");

        int result = (age>19)? 1 : 0;
        System.out.println(result);

        //bitwise operator
        System.out.println("BITWISE OPERATORS");

        int bitage= age^secondage;
        System.out.println(bitage);
        int a=5, b=6;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(~a);
        System.out.println(a>>b);
        System.out.println(a<<b);

    }

}
