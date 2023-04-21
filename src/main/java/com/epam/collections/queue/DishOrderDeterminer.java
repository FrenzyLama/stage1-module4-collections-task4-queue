package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> dishes = new ArrayList<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            dishes.add(i);
        }
        List<Integer> result = new ArrayList<>();
        int currentDishIndex = everyDishNumberToEat - 1;
        while (!dishes.isEmpty()) {
            result.add(dishes.remove(currentDishIndex));
            if (!dishes.isEmpty()) {
                currentDishIndex = (currentDishIndex + everyDishNumberToEat - 1) % dishes.size();
            }
        }
        return result;
    }
}
