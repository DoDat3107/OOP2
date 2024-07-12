package bai3;

public class Thongtin {
    public String name;
    public int age;
    public String[] scores;

    public Thongtin(String name, int age, String[] scores) {
        this.name = name;
        this.age = age;
        this.scores = scores;
    }

    public double calculateAverageScore() {
        if (scores.length == 0) {
            return 0.0;
        }
        double sum = 0;
        for (String score : scores) {
            sum =sum + Double.parseDouble(score);
        }
        return sum / scores.length;
    }

    public void changeInfo(String name, int age, String[] scores) {
        this.name = name;
        this.age = age;
        this.scores = scores;
    }

    public static Thongtin compareStudents(Thongtin s1, Thongtin s2) {
        double avgScore1 = s1.calculateAverageScore();
        double avgScore2 = s2.calculateAverageScore();

        if (avgScore1 > avgScore2) {
            return s1;
        } else {
            return s2;
        }
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public String[] getScores() {
        return scores;
    }


}
