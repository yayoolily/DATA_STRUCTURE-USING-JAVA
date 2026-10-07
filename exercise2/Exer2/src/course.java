public class course {
    private String courseName;
    private String []students;
    private int numberOfStudents;

    //constructors
    public course(String courseName){
        this.courseName=courseName;
        students=new String[10];
        numberOfStudents=0;
    }

    // get courName


    public String getCourseName() {
        return courseName;
    }

    // Add student 
    public void AddStudent(String student){
        if(numberOfStudents>=students.length){
            String[] newstudents= new String[students.length*2];

            for(int i=0; i<students.length; i++){
                newstudents[i]=students[i];
            }

            students=newstudents;
        }

        students[numberOfStudents]=student;
        numberOfStudents++;
    }

    public void dropStudent(String student){
        for(int i=0 ; i<numberOfStudents;i++){
            if(students[i].equals(student)){

                System.out.println("Dropped student: "+students[i]);
                for(int s=i; s<numberOfStudents-1;s++){
                    students[s]=students[s+1];
                }
                students[numberOfStudents-1]=null;
                numberOfStudents--;

                break;
            }
        }
    }

    public String []getStudents(){
        return students;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
}

class courseclass{
    public static void main(String[] args){
        course studentcourse = new course("english");
        studentcourse.AddStudent("aisha");
        studentcourse.AddStudent("hashi");
        studentcourse.AddStudent("hassan");
        studentcourse.AddStudent("anab");

        System.out.println("Course: "+studentcourse.getCourseName());
        System.out.println("number of student: "+studentcourse.getNumberOfStudents());

        studentcourse.dropStudent("hashi");

        System.out.println("After drop: "+studentcourse.getNumberOfStudents());
    }
}
