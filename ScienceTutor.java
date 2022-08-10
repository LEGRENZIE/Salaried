
/**
 * Write a description of class ScienceTutor here.
 *
 * @author (SJ LEGRENZIE)
 * @version (27361667)
 */
public class ScienceTutor extends Tutor
{
    private double ratePerHour = 85.00;
    private double hoursWorked = 16.00;
    
    public ScienceTutor()
    {
        this("Natasha","Thahane","Female","0675341582","Vanderbijlpark",105,85.00,16.00);
    }
    
    public ScienceTutor(String name,String surname,String gender,String telephone,String city,int tutorWorkId,double ratePerHour, double hoursWorked)
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
            ScienceTutor s = (ScienceTutor)k;
            if(this.TutorSalary() == s.TutorSalary())
                return 0;
            else
                if(this.TutorSalary() < s.TutorSalary())
                return -1;
            else
                return 1;
           
        }else
        return this.getClass().getName().compareTo(k.getClass().getName());
    }
    
     public String toString()
    {
          return ("Science Tutor: "+getName()+" "+getSurname()+" from "+getCity()+"\nWorked: "+getHoursWorked()+" Hours\tRate: R"+getRatePerHour()+" Per Hour");      
    }
}
