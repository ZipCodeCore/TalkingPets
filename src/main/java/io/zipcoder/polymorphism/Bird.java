package io.zipcoder.polymorphism;

public class Bird extends Pet {
        public Bird(String name){
            super(name);
        }

        @Override
        public String speak() {
            return "Chirp Chirp";
        }

    @Override
    public int compareTo(Pet o) {
        return this.getName().compareTo(o.getName());
    }
}
