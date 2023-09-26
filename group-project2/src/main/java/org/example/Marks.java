package org.example;

public abstract class Marks {

    public abstract double getPercentage();

}

class StudentA extends Marks{

    double subject1Marks;
    double subject2Marks;
    double subject3Marks;

    StudentA(double subject1, double subject2, double subject3){
        this.subject1Marks = subject1;
        this.subject2Marks = subject2;
        this.subject3Marks = subject3;
    }

    @Override
    public double getPercentage(){
        double averagePercentage = (subject1Marks + subject2Marks + subject3Marks)/3;
        return averagePercentage;
    }
}

class StudentB extends Marks{

    double Subject1Marks;
    double Subject2Marks;
    double Subject3Marks;
    double Subject4Marks;

    StudentB(double Subject1, double Subject2, double Subject3, double Subject4){
        this.Subject1Marks = Subject1;
        this.Subject2Marks = Subject2;
        this.Subject3Marks = Subject3;
        this.Subject4Marks = Subject4;
    }

    @Override
    public double getPercentage(){
        double averagePercentage = (Subject1Marks + Subject2Marks + Subject3Marks + Subject4Marks)/4;
        return averagePercentage;
    }
}

class TestMarks{
    public static void main(String[] args) {

        StudentA sa = new StudentA(78, 89, 47);
        StudentB sb = new StudentB(89,57, 78, 82);

        System.out.println(sa.getPercentage());
        System.out.println(sb.getPercentage());

    }
}
