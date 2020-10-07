public class Person {

    String doSomething(String a, String b, MakeSomeThing op){
        return op.myFunk(a, b);
    }

    interface MakeSomeThing{
        String myFunk(String a, String b);
    }
}
