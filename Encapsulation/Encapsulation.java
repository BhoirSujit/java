class Data
{
    private String name;
    private int age;

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }
}

class Main
{
    public static void main(String... args)
    {
        Data data = new Data();
        data.setName("sujit");
        data.setAge(18);

        System.out.println("Name : " + data.getName());
        System.out.println("Age : "+ data.getAge());
    }
}
