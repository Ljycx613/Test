public class Student {
    public int num;
    public String name;
    public String sex;
    public String grade;

    public Student(int num, String name, String sex, String grade) {
        this.num = num;
        this.name = name;
        this.sex = sex;
        this.grade = grade;
    }

    public void show(){
        System.out.println(num);
        System.out.println(name);
        System.out.println(sex);
        System.out.println(grade);
        int contain=0;
        contain++;
    }


}
