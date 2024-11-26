package model.dto;

public class Dish {
    private Integer id;
    private String dishName;
    private Integer price;
    private Integer number;
    private Temperature temperature;
    private Shot shot;
    private Integer categoryId;
    private Integer unitSold;

    public Dish(Integer id, String dishName, Integer price, Integer number, Temperature temperature, Shot shot, Integer categoryId, Integer unitSold) {
        this.id = id;
        this.dishName = dishName;
        this.price = price;
        this.number = number;
        this.temperature = temperature;
        this.shot = shot;
        this.categoryId = categoryId;
        this.unitSold = unitSold;
    }

    public Integer getUnitSold() {
        return unitSold;
    }

    public void setUnitSold(Integer unitSold) {
        this.unitSold = unitSold;
    }

    public Dish() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public Shot getShot() {
        return shot;
    }

    public void setShot(Shot shot) {
        this.shot = shot;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }



    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", dishName='" + dishName + '\'' +
                ", price=" + price +
                ", number=" + number +
                ", temperature=" + temperature +
                ", shot=" + shot +
                ", categoryId=" + categoryId +
                ", unitSold=" + unitSold +
                '}';
    }
}
