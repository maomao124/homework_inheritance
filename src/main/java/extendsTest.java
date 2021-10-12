/**
 * Project name(项目名称)：作业 继承
 * Package(包名): PACKAGE_NAME
 * Class(类名): extendsTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/12
 * Time(创建时间)： 18:24
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class extendsTest
{
    public static void main(String[] args)
    {
        // 实例化一个Cat对象，设置属性name和age，调用voice()和eat()方法，再打印出名字和年龄信息
        /********* begin *********/
        Cat cat = new Cat();
        cat.setName("大花猫");
        cat.setAge(6);
        cat.voice();
        cat.eat();
        System.out.println(cat.getName() + cat.getAge() + "岁");
        /********* end *********/

        // 实例化一个Dog对象，设置属性name和age，调用voice()和eat()方法，再打印出名字和年龄信息
        /********* begin *********/
        Dog dog = new Dog();
        dog.setName("大黑狗");
        dog.setAge(8);
        dog.voice();
        dog.eat();
        System.out.println(dog.getName() + dog.getAge() + "岁");
        /********* end *********/

    }
}