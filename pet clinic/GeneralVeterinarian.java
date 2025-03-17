class GeneralVeterinarian implements Veterinarian {
    
    private String name;
    
    public GeneralVeterinarian(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public String examinePet(Pet pet) {
        return "The veterinarian examined " + pet.getName();
    }
}