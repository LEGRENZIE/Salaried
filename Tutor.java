
/**
 * Abstract class Tutor - write a description of the class here
 *
 * @author (SJ LEGRENZIE)
 * @version (27361667)
 */
public abstract class Tutor implements Comparable<Tutor> 
{
    private String name = " ";
    private String surname = " ";
    private String gender = "";
    private String telephone = " ";
    private String city = " ";
    private int tutorWorkId = 100;
    
    protected Tutor(){}
    
    protected Tutor(String name,String surname,String gender,String telephone,String city,int tutorWorkId)
    {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.telephone = telephone;
        this.city = city;
        this.tutorWorkId = tutorWorkId;
    }
    
  
    public String getName()
    {
         return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
   
    public String getSurname()
    {
         return surname;
    }
    
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    
   
    public String getGender()
    {
         return gender;
    }
    
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    
    
    public String getTelephone()
    {
         return telephone;
    }
    
    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }
    
   
    public String getCity()
    {
         return city;
    }
    
    public void setCity(String city)
    {
        this.city = city;
    }
    
  
    public int getTutorId()
    {
         return tutorWorkId;
    }
    
    public void setTutorId(int tutorWorkId)
    {
        this.tutorWorkId = tutorWorkId;
    }
    
    public abstract double TutorSalary();
    
    
    
}

