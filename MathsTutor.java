
/**
 * Write a description of class MathsTutor here.
 *
 * @author (SJ LEGRENZIE)
 * @version (27361667)
 */
public class MathsTutor extends Tutor
{
    private double ratePerHour = 75.00;
    private double hoursWorked = 10.00;
    
    public MathsTutor()
    {
        this("Ashley","Venum","Female","0679992342","Johannesburg",100,75.00,10.30);
    }
    
    public MathsTutor(String name,String surname,String gender,String telephone,String city,int tutorWorkId,double ratePerHour, double hoursWorked)
    {
        super(name,surname,gender,telephone,city,tutorWorkId);
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
    }
    
  
    public double getRatePerHour()
    {
         return ratePerHour;
    }
    
    public void setRatePerHour(double ratePerHour)
    {
        this.ratePerHour = ratePerHour;
    }
    
   
    public double getHoursWorked()
    {
         return hoursWorked;
    }
    
    public void setHoursWorked(double hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }
    
    public double TutorSalary()
    {
        return getHoursWorked() * getRatePerHour();
    }
    
    
    public int compareTo(Tutor k)
    {
        if(this.getClass().equals(k.getClass()))
        {
            MathsTutor m = (MathsTutor)k;
            if(this.TutorSalary() == m.TutorSalary())
                return 0;
            else
                if(this.TutorSalary() < m.TutorSalary())
                return -1;
            else
                return 1;
           
        }else
        return this.getClass().getName().compareTo(k.getClass().getName());
    }
    
    
    public String toString()
    {
         return ("Math Tutor: "+getName()+" "+getSurname()+" from "+getCity()+"\nWorked: "+getHoursWorked()+" Hours\tRate: R"+getRatePerHour()+" Per Hour");    
    }
}
