
public class PetClinic
{
	public static void main(String[] args) {
	    Pet[] arrPets = new Pet[5];
	    arrPets[0] = new Dog("dog1", 3, "male", "german shepherd");
	    arrPets[1] = new Dog("dog2", 6, "male", "german shepherd");
	    arrPets[2] = new Dog("dog3", 2, "male", "german shepherd");
	    arrPets[3] = new Dog("cat1", 8, "male", "white");
	    arrPets[4] = new Dog("cat2", 1, "male", "black");
	    
	    Veterinarian[] arrVeterinarians = new Veterinarian[3];
	    arrVeterinarians[0] = new GeneralVeterinarian("Yosef");
	    arrVeterinarians[1] = new GeneralVeterinarian("Moshe");
	    arrVeterinarians[2] = new SpecialistVeterinarian("heart");
	    
	    for (int i = 0; i < arrVeterinarians.length; i++) { 
	        
	        System.out.println("The examinations of " + arrVeterinarians[i].getName());
	        
	        for (int j = 0; j < arrPets.length; j++) {
	            System.out.println(arrVeterinarians[i].examinePet(arrPets[j]));
	        }
	    }
	    
	}
}












