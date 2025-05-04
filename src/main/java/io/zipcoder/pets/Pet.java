package io.zipcoder.pets;

public abstract class Pet implements Animal {
    private String name;
    private Integer Id;

    public Pet(String name, Integer id) {
        this.name = name;
        this.Id = id;
    }

    public String getName() {
        return null;
    }

    public Integer getId() {
        return null;
    }

    public void setName(String givenName) {

    }

    public String speak(){
        return null;
    }

}
