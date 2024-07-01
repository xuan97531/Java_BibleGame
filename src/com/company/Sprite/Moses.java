package com.company.Sprite;

import com.company.GameView.DisasterView;
import com.company.GameView.RedSeaGameView;
import com.company.GameView.TenCommandmentsView;
import com.company.Main;
import com.company.Sprite.DisasterViewSprite.Bug;
import com.company.Sprite.DisasterViewSprite.Frog;
import com.company.Sprite.DisasterViewSprite.Ice;
import com.company.Sprite.DisasterViewSprite.Tombstone;
import com.company.Sprite.RedSeaGameView.Anubis;
import com.company.Sprite.RedSeaGameView.Cat;
import com.company.Sprite.RedSeaGameView.Pharaoh;
import com.company.Sprite.TenCommandmentSprite.TenCommandment;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Moses extends Sprite{

    public Moses(int x, int y){
        setPosition(x, y);
        img = new ImageIcon("Moses.png");
    }

    @Override
    public String overlap(int x, int y){
        if(Main.gameView instanceof DisasterView){
            // check for bugs and frogs
            ArrayList<Bug> bugs = ((DisasterView) Main.gameView).getBugs();
            ArrayList<Frog> frogs = ((DisasterView) Main.gameView).getFrogs();
            for(Bug b : bugs){
                if(b.getRelativePosition()!=null && x == b.getRelativePosition().x && y == b.getRelativePosition().y){
                    return "Die";
                }
            }
            for(Frog f : frogs){
                if(f.getRelativePosition()!=null && x == f.getRelativePosition().x && y == f.getRelativePosition().y){
                    return "Die";
                }
            }

            // check for ice and tombstones
            ArrayList<Ice> ices = ((DisasterView) Main.gameView).getIces();
            ArrayList<Tombstone> tombstones = ((DisasterView) Main.gameView).getTombstones();
            for(Ice i : ices){
                if(i.getRelativePosition()!=null && x == i.getRelativePosition().x && y == i.getRelativePosition().y){
                    return "Cannot move";
                }
            }
            for(Tombstone t : tombstones){
                if(t.getRelativePosition()!=null && x == t.getRelativePosition().x && y == t.getRelativePosition().y){
                    return "Cannot move";
                }
            }

            // check for door
            Door door = Main.gameView.getDoor();
            if(x == door.getRelativePosition().x && y == door.getRelativePosition().y){
                return "Next Level";
            }
        } else if (Main.gameView instanceof RedSeaGameView) {
            // check for cats
            ArrayList<Cat> cats = ((RedSeaGameView) Main.gameView).getCats();
            for(Cat c : cats){
                if(c.getRelativePosition() != null && x == c.getRelativePosition().x && y == c.getRelativePosition().y){
                    return "Cannot move";
                }
            }

            // check for pharaoh and anubis
            ArrayList<Pharaoh> pharaohs = ((RedSeaGameView) Main.gameView).getPharaohs();
            ArrayList<Anubis> anubis = ((RedSeaGameView) Main.gameView).getAnubis();
            for(Pharaoh p : pharaohs){
                if(p.getRelativePosition() != null && x == p.getRelativePosition().x && y == p.getRelativePosition().y){
                    return "Die";
                }
            }
            for(Anubis a : anubis){
                if(a.getRelativePosition() != null && x == a.getRelativePosition().x && y == a.getRelativePosition().y){
                    return "Die";
                }
            }

            // check for door
            Door door = Main.gameView.getDoor();
            if(x == door.getRelativePosition().x && y == door.getRelativePosition().y){
                return "Next Level";
            }
        } else if (Main.gameView instanceof TenCommandmentsView){
            ArrayList<TenCommandment> stones = ((TenCommandmentsView) Main.gameView).getStones();
            for(TenCommandment stone : stones){
                if(stone.getRelativePosition() != null && stone.getRelativePosition().x == x && stone.getRelativePosition().y == y){
                    stone.setNullPosition();
                    ((TenCommandmentsView) Main.gameView).setCount(1);
                    if(((TenCommandmentsView) Main.gameView).getCount() == 10){
                        return "Game Over";
                    } else {
                        return "none";
                    }
                }
            }
        }
        return "none";
    }
}
