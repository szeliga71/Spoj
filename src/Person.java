public class Person {

    String name;
    int age;

    Person (String name,int age){
        this.name=name;
        this.age=age;
    }
String visitCard(){

        String card="mr/ms ";
        card = card + name;

return card;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
