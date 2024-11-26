package model.dto;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private Integer id;
    private Integer status;
    private LocalDate orderTime;
    private LocalDate endTime;
    private List<ShoppingCart> shoppingCarts;
}
