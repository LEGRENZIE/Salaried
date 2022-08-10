
/**
 * Write a description of class testApartment here.
 *
 * @author (SJ LEGRENZIE)
 * @version (27361667)
 */
public class testTutor 
{
    public static void main(String args[])
    {
        
        MathsTutor mathTutor1 = new MathsTutor("Herman","Pukke","Male","0869003224","Carlton Ville",100,75.00,40.00);
        MathsTutor mathTutor2 = new MathsTutor("Thabang","Lebese","Male","0711584962","Bloemfountein",101,75.00,50.00);
        MathsTutor mathTutor3 = new MathsTutor("Karabo","Tsotetsi","Female","0871458293","Vereeniging",105,75.00,39.00);
        MathsTutor mathTutor4 = new MathsTutor("Frank","Bubesi","Male","0675849631","Johannesburg",118,75.00,32.00);
        MathsTutor mathTutor5 = new MathsTutor("Sharlote","Cooper","Female","0638452965","Vanderbijlpark",120,75.00,55.00);
        MathsTutor mathTutor6 = new MathsTutor("Sherly","Puth","Female","0658541839","Carlton Ville",110,75.00,43.00);
        MathsTutor mathTutor7 = new MathsTutor("Amanda","Mazimba","Female","0679992342","Vereeniging",108,75.00,52.00);
        MathsTutor mathTutor8 = new MathsTutor("Teboho","Mavhuku","Male","0676332448","Johannesburg",102,75.00,25.00);
        
        ScienceTutor scienceTutor1 = new ScienceTutor("Natasha","Thahane","Female","0675341582","Vanderbijlpark",120,85.00,40.00);
        ScienceTutor scienceTutor2 = new ScienceTutor("Bonnie","Clyde","Female","0658541839","Johannesburg",135,85.00,50.00);
        ScienceTutor scienceTutor3 = new ScienceTutor("Richard","Zimele","Male","0638452965","Carlton Ville",184,85.00,10.00);
        ScienceTutor scienceTutor4 = new ScienceTutor("Humbulani","Maphosa","Male","0871458293","CarltonVille",132,85.00,52.00);
        ScienceTutor scienceTutor5 = new ScienceTutor("Nthabiseng","Maphike","Female","0675341582","Vereeniging",133,85.00,44.00);
        ScienceTutor scienceTutor6 = new ScienceTutor("Palesa","Peterson","Female","0711584962","Bloemfountein",122,85.00,49.00);
        ScienceTutor scienceTutor7 = new ScienceTutor("Michell","Osmo","Female","0676332448","Vanderbijlpark",130,85.00,36.00);
        ScienceTutor scienceTutor8 = new ScienceTutor("Zuke","Mngathi","Male","0679992342","Johannesburg",128,85.00,25.00);
        
        MyArrayList<Tutor> list = new MyArrayList<>();
        
        
        list.add(0,mathTutor1);
        list.add(1,mathTutor2);
        list.add(2,mathTutor3);
        list.add(3,mathTutor4);
        list.add(4,mathTutor5);
        list.add(5,mathTutor6);
        list.add(6,mathTutor7);
        list.add(7,mathTutor8);
        list.add(8,scienceTutor1);
        list.add(9,scienceTutor2);
        list.add(10,scienceTutor3);
        list.add(11,scienceTutor4);
        list.add(12,scienceTutor5);
        list.add(13,scienceTutor6);
        list.add(14,scienceTutor7);
        list.add(15,scienceTutor8);
      
        System.out.println("Total Number of Tutors: "+list.getSize());
        
        
        if(list.sortList())
         
        for(int i = 0; i< list.getSize(); i++)
        {
            
            System.out.println("\n"+list.get(i)+"\t\nMonthly Earned Salary:  R"+list.get(i).TutorSalary());
                       
        }
        
         
        
    }
}
