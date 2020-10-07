public class Calculator {
    public static void main(String[] args) {
        Person person = new Person();
        Person.MakeSomeThing makeConcat = (a, b) -> a + b;
        System.out.println(new StringBuffer(person.doSomething("Hello", "World", makeConcat)).reverse());
    }
}
