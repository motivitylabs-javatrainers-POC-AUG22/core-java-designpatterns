package motivity.creational.builder;

public class BuilderMain
{
    public static void main(String[] args) {
        Animal a = new Lion().setWeight(83).setHeight(6).setGender('m').getObject();
        System.out.println(a);
    }
}
