package com.company.GameView;

import com.company.Sprite.TenCommandmentSprite.TenCommandment;

import javax.swing.*;
import java.util.ArrayList;

public class TenCommandmentsView extends GameView{

    public ArrayList<TenCommandment> getStones() {
        return stones;
    }

    private ArrayList<TenCommandment> stones = new ArrayList<>();
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count){
        this.count += count;
    }

    public TenCommandmentsView(){
        img = new ImageIcon("mountain.jpg");
        elements = new ArrayList<>();
        count = 0;

        stones.add(new TenCommandment(5, 5));
        stones.add(new TenCommandment(1, 5));
        stones.add(new TenCommandment(3, 4));
        stones.add(new TenCommandment(2, 5));
        stones.add(new TenCommandment(9, 4));
        stones.add(new TenCommandment(3, 5));
        stones.add(new TenCommandment(4, 5));
        stones.add(new TenCommandment(6, 7));
        stones.add(new TenCommandment(7, 1));
        stones.add(new TenCommandment(5, 7));

        elements.addAll(stones);

    }
}
