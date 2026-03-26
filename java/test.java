public class Test {
    public static void main(String[] args) {
        System.out.println("Testing JavaBeans");

        Person p = new Person();
        p.setName("Mannu");
        p.setAge(20);

        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}