package model.dto;

import java.util.List;

public class ShoppingCart {
    private Integer id;
    private Integer userId;
    private double totalAmount;
    private Integer point;
    private Type type;
    private List<Dish> dishes;
}
