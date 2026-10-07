
public class MBI {
    private String name;
    private int age ;
    private double weight;
    private double height;

    //contructor

    public MBI(String name,int age, double weight , double height){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.height=height;
    }

    //constructor default age

    public MBI(String name,double weight , double height){
        this.name=name;
        this.age=20;
        this.weight=weight;
        this.height=height;
    }
    //getters


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
    //calculate BMI
    public double getMBI(){
        return weight*703/(height*height);
    }

    //return MBI status

    public String getStatus(){
        double bmi=getMBI();

        if(bmi<18.5){
            return "Underweight";
        } else if (bmi<25.0) {
            return "Normal";
        } else if (bmi<30.0) {
            return "Overweight";
        }else {
            return "obese";
        }
    }
}

class MyMBI{
    public static void main(String[] args){
        MBI obj = new MBI("hafsa",20,47,158);

        System.out.println("NAME: "+obj.getName());
        System.out.println("AGE: "+obj.getAge());
        System.out.println("WEIGHT: "+obj.getWeight());
        System.out.println("HEIGHT: "+obj.getHeight());

        System.out.println();

        System.out.println("MBI: "+obj.getMBI());
        System.out.println("STATUS: "+obj.getStatus());



    }
}

