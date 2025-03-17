
/*
     I added the func getName according to the UML diagram,
     although from the question decription I anderstood that SpecialistVeterinarian is type of GeneralVeterinarian
     because all of the attributes and methods of GeneralVeterinarian sould be also in SpecialistVeterinarian.
     in this way need SpecialistVeterinarian be drived of GeneralVeterinarian, and not explicitly implements Veterinarian 
     (and getName method, will return value from basic class + specific suffix)   */

class SpecialistVeterinarian implements Veterinarian {
    
    private String specialty;
    
    public SpecialistVeterinarian(String specialty) {
        this.specialty = specialty;
    }
    
    public String getName() {
        return "specialist veterinarian";
    }
    
    @Override
    public String examinePet(Pet pet) {
        return "The specialist veterinarian examined " + pet.getName();
    }
}

