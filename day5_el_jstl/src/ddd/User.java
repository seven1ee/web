package ddd;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User
{
    private String name;
    private int age;
    private Date birth;

    public User()
    {
    }

    public User(String name, int age, Date birth)
    {
        this.name = name;
        this.age = age;
        this.birth = birth;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getBirth()
    {
        if (this.birth!=null){
            SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
            return sd.format(birth);
        }
        return "";
    }

    public void setBirth(Date birth)
    {
        this.birth = birth;
    }
}
