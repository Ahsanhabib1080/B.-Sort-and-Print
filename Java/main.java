import java.util.Scanner;


public class main {

    public void highestMarks(student[] s) {
        
        int max = s[0].getMARKS();
        int maxIndex = 0;
        for (int i = 0; i < 10; i++) {
            if (s[i].getMARKS() > max) {
                max = s[i].getMARKS();
                maxIndex = i;
            }
        }
        System.out.println("The student with highest marks is: ");
        s[maxIndex].display();
    }

    public void averageMarks(student[] s) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += s[i].getMARKS();
        }
        System.out.println("The average marks of all students is: " + sum / 10);
    }

   

    public void sortByMarks(student[] s) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i - 1; j++) {
                if (s[j].getMARKS() > s[j + 1].getMARKS()) {
                    student temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }
        System.out.println("The students sorted by marks are: ");
        for (int i = 0; i < 10; i++) {
            s[i].display();
        }
    }

    public void sortByID(student[] s) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i - 1; j++) {
                if (s[j].getROLL() > s[j + 1].getROLL()) {
                    student temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }
        System.out.println("The students sorted by ID are: ");
        for (int i = 0; i < 10; i++) {
            s[i].display();
        }
    }

    public void setGrade(student[] s) {
        for (int i = 0; i < 10; i++) {
            if (s[i].getMARKS() >= 80) {
                s[i].setRESULT("A+");
            } else if (s[i].getMARKS() >= 60) {
                s[i].setRESULT("B");
            } else if (s[i].getMARKS() >= 40) {
                s[i].setRESULT("C");
            } else {
                s[i].setRESULT("F");
            }
        }
        System.out.println("The students with their grades are: ");
        for (int i = 0; i < 10; i++) {
            s[i].display();
        }
    }

    public void SearchbyROLL(student[] s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ROLL of the student you want to search: ");
        int roll = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if (s[i].getROLL() == roll) {
                s[i].display();
                System.out.println("The student is found!" + "\n" + "And His Grade is: " + s[i].getRESULT());
                break;
            }
        }
    }

    public void failedStudents(student[] s) {
        System.out.println("The students who failed are: ");
        for (int i = 0; i < 10; i++) {
            if (s[i].getRESULT().equals("F")) {
                s[i].display();
            }
        }
    }

    public void AGRadeStudents(student[] s) {
        System.out.println("The students who got A+ grade are: ");
        for (int i = 0; i < 10; i++) {
            if (s[i].getRESULT().equals("A+")) {
                s[i].display();
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        main m = new main();
        student[] s = new student[10];
        for (int i = 0; i < 10; i++) {
            s[i] = new student();
            System.out.println("Enter the details of student " + (i + 1));
            System.out.println("Enter the roll number: ");
            s[i].setROLL(sc.nextInt());
            System.out.println("Enter the name: ");
            s[i].setNAME(sc.next());
            System.out.println("Enter the marks: ");
            s[i].setMARKS(sc.nextInt());
            System.out.println("Enter the department: ");
            s[i].setDEPT(sc.next());
        }
        m.setGrade(s);

        int key = 0;
        while (key != 8) {
            System.out.println("Enter the choice: ");
            System.out.println("1.Highest marks");
            System.out.println("2.Average marks");
            System.out.println("3.Sort by marks");
            System.out.println("4.Sort by ID");
            System.out.println("5.Search by ROLL");
            System.out.println("6.Failed students");
            System.out.println("7.A+ grade students");
            System.out.println("8.Exit");

            key = sc.nextInt();
            switch (key) {
                case 1:
                    m.highestMarks(s);
                    break;
                case 2:
                    m.averageMarks(s);
                    break;
                case 3:
                    m.sortByMarks(s);
                    break;
                case 4:
                    m.sortByID(s);
                    break;
                case 5:
                    m.SearchbyROLL(s);
                    break;
                case 6:
                    m.failedStudents(s);
                    break;
                case 7:
                    m.AGRadeStudents(s);
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }

    }
}
