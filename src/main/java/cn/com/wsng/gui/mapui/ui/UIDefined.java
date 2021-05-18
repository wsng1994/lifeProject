package cn.com.wsng.gui.mapui.ui;

import java.awt.*;
import java.awt.image.ImageObserver;


/**
 *
 * 地图属性实体类
 *
 */
public class UIDefined {
    public Image image;
    public Image imageBg;
    public Graphics graphics;


    public UIDefined(Graphics g,ImageObserver imageObserver,Image image){
        this.imageObserver = imageObserver;
        this.graphics = g;
        this.imageBg = image;
    }

    public String getVector() {
        return vector;
    }

    public void setVector(String vector) {
        this.vector = vector;
    }

    public String vector;

    public Graphics getGraphics() {
        return graphics;
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public Image getImageBg() {
        return imageBg;
    }

    public void setImageBg(Image imageBg) {
        this.imageBg = imageBg;
    }

    public ImageObserver imageObserver;
    public int x;
    public int y;

    public int width;
    public int height;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public ImageObserver getImageObserver() {
        return imageObserver;
    }

    public void setImageObserver(ImageObserver imageObserver) {
        this.imageObserver = imageObserver;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }



}
