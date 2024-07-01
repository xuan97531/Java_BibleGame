package com.company.Sprite;

import javax.swing.*;
import java.awt.*;
import com.company.Main;

public abstract class Sprite {
    protected ImageIcon img;
    protected Point relativePosition;
    protected Point absolutPosition;

    public void draw(Graphics g){

        if(relativePosition != null ){
            img.paintIcon(null, g, absolutPosition.x, absolutPosition.y);
        }
    }

    public void setPosition(Point p){
        setPosition(p.x, p.y);
    }

    public void setPosition(int x, int y){
        relativePosition = new Point(x, y);
        absolutPosition = new Point((x-1) * Main.CELL, (y-1) * Main.CELL);
    }

    public void setNullPosition(){
        relativePosition = null;
        absolutPosition  = null;
    }

    public Point getRelativePosition(){
        if(relativePosition == null){
            return null;
        } else {
            return new Point(relativePosition);  // 若使用this.relativePosition 會回傳的是copy by reference
        }
    }

    public abstract String  overlap(int x, int y);
}
