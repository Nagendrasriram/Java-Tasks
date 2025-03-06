
import java.util.Scanner;

// 2.Create a class named "Car" with attributes like make, model, and year. 
// Implement methods to set and display these attributes for different car objects.
class Car
{
    String make;
    String model;
    int year;
    void setCar(String make,String model,int year)
    {
        this.make=make;
        this.model=model;
        this.year=year;
    }
    void getCar()
    {
        System.out.println("Make of the car:"+make);
        System.out.println("Model of the car:"+model);
        System.out.println("Year of the car:"+year);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the make of the car:");
        String make=sc.nextLine();
        System.out.println("Enter the model of the car:");
        String model=sc.nextLine();
        System.out.println("Enter the year of the car:");
        int year=sc.nextInt();
        Car c = new Car();
        c.setCar(make, model, year);
        c.getCar();
        sc.close();
    }
} 