package com.nazirov.friendlyeats.model;

public class Food {
    String name;
    String foodName;
    String description;
    int image;

    public Food(String name, String foodName, String description, int image) {
        this.name = name;
        this.foodName = foodName;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", foodName='" + foodName + '\'' +
                ", description='" + description + '\'' +
                ", image=" + image +
                '}';
    }
}
