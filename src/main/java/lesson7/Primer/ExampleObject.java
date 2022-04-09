package lesson7.Primer;

public class ExampleObject {
    // здесь мы создаем класс экземпляра объекта

    private String name;
    private String parameter;
    private Integer age;
    private Boolean sex;
    // создаем констуруктор, геттеры, сеттеры

    public ExampleObject(String name, String parameter, Integer age, Boolean sex) {
        this.name = name;
        this.parameter = parameter;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

   }
