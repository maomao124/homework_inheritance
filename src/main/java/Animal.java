/**
 * Project name(项目名称)：作业 继承
 * Package(包名): PACKAGE_NAME
 * Class(类名): Animal
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/12
 * Time(创建时间)： 18:22
 * Version(版本): 1.0
 * Description(描述)： 无
 */

class Animal
{
    /********* begin *********/
    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    /********* end *********/

}

class Cat extends Animal
{
    // 定义Cat类的voice()和eat()方法

    /********* begin *********/
    public void voice()
    {
        System.out.println(this.getName() + "喵喵叫");
    }

    public void eat()
    {
        System.out.println(this.getName() + "吃鱼");
    }
    /********* end *********/
}

class Dog extends Animal
{
    // 定义Dog类的voice()和eat()方法

    /********* begin *********/
    public void voice()
    {
        System.out.println(this.getName() + "汪汪叫");
    }

    public void eat()
    {
        System.out.println(this.getName() + "吃骨头");
    }
    /********* end *********/
}


