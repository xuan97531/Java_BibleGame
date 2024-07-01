package com.company.GameView;

import com.company.Sprite.Door;
import com.company.Sprite.RedSeaGameView.Anubis;
import com.company.Sprite.RedSeaGameView.Cat;
import com.company.Sprite.RedSeaGameView.Pharaoh;

import javax.swing.*;
import java.util.ArrayList;

public class RedSeaGameView extends GameView{

    private ArrayList<Cat> cats = new ArrayList<>();
    private ArrayList<Anubis> anubis = new ArrayList<>();
    private ArrayList<Pharaoh> pharaohs = new ArrayList<>();

    public ArrayList<Cat> getCats() {
        return cats;
    }

    public ArrayList<Anubis> getAnubis() {
        return anubis;
    }

    public ArrayList<Pharaoh> getPharaohs() {
        return pharaohs;
    }

    public RedSeaGameView(){
        img = new ImageIcon("sea.jpg");
        elements = new ArrayList<>();
        door = new Door(10, 10);

        cats.add(new Cat(6, 3));
        cats.add(new Cat(6, 4));
        cats.add(new Cat(6, 5));
        cats.add(new Cat(8, 3));
        cats.add(new Cat(1, 3));
        cats.add(new Cat(6, 9));
        cats.add(new Cat(2, 7));
        cats.add(new Cat(2, 5));

        pharaohs.add(new Pharaoh(5, 4));
        pharaohs.add(new Pharaoh(6, 1));
        pharaohs.add(new Pharaoh(5, 1));
        pharaohs.add(new Pharaoh(4, 1));
        pharaohs.add(new Pharaoh(3, 1));
        pharaohs.add(new Pharaoh(1, 4));

        anubis.add(new Anubis(2, 6));
        anubis.add(new Anubis(7, 6));
        anubis.add(new Anubis(7, 7));
        anubis.add(new Anubis(7, 8));
        anubis.add(new Anubis(10, 1));

        elements.add(door);
        elements.addAll(cats);
        elements.addAll(anubis);
        elements.addAll(pharaohs);
    }

}
