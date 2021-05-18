package cn.com.wsng.game.core;

/**
 * defined all actions
 * 暂时未用到
 */
public interface RolerAction {

    //自动移动
    public void move();

    //条件移动
    public void move(int x, int y);

    //普通攻击
    public void attack();

    //特殊攻击
    public void attack(String type);

    //语言交流
    public void say();

    //条件语言
    public void say(String message);

    //询问
    public void ask();

    //条件询问
    public void ask(String condition);

    //回答
    public void answer();

    //回答
    public void answer(String type);



}
