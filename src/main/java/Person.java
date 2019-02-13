public class Person {
    private int age;
    private String name;
    private String jobTitle;

    public Person(int age, String name, String jobTitle) {
        this.age = age;
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public String findByName(String namme){

        if(name.contains(namme)){
            return name;
        }

        return "user not found";

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return name + age + jobTitle;
    }
}
