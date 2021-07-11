package io.zipcoder.pets;

public class Pet implements Animal {
    private String Name;
    private final Integer Id;
    private PetOwner Owner;

    public Pet(String name, Integer id) {
        this.Name = name;
        this.Id = id;
        this.Owner = null;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public Integer getId() {
        return Id;
    }

//    public void setId(Integer id) {
//        this.Id = id;
//    }

    public PetOwner getOwner() {
        return this.Owner;
    }

    public void setOwner(PetOwner owner) {
        this.Owner = owner;
    }




    public String speak() {
        return null;
    }
}
