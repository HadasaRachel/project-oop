class Cat extends Pet {
    
    private String color;
    
    public Cat(String name, int age, String species, String color) {
        super(name, age, species);
        this.color = color;
    }
    
    @Override
    public String makeSound() {
        return "Cats meow";
    }
    
    @Override
    public String eat() {
        return "Cats eat cat food";
    }
}