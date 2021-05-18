package cn.com.wsng.game.roler;


/**
 *
 *  适用 单例设计模式
 *
 */
public class RoleState {

    //基础坐标属性
    public int x,y;
    //移动方向
    public String vector;

    public RoleState(int x, int y, String vector) {
        this.x = x;
        this.y = y;
        this.vector = vector;
    }

    public RoleState() {
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

    public String getVector() {
        return vector;
    }

    public void setVector(String vector) {
        this.vector = vector;
    }

}
