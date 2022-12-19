package work6;

public interface Movable {

    public void moveUp(); //метод интерфейса
    public void moveDown();
    public void moveRight();
    public void moveLeft();
}

class MovableCircle implements Movable {
    int radius;
    MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint();
        center.x=x;
        center.y=y;
        center.xSpeed=xSpeed;
        center.ySpeed=ySpeed;
        this.radius = radius;
    }
    public void  moveUp(){
        center.y+=center.ySpeed;
    }
    public void  moveDown(){
        center.y-=center.ySpeed;
    }
    public void  moveRight(){
        center.x+=center.xSpeed;
    }
    public void  moveLeft(){
        center.x-=center.xSpeed;
    }

    public String toString(){
        return "Coordinates of the center: ("+center.x+";"+center.y+"), radius: "+radius;
    }
}
class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    public MovablePoint(){
        this.x=0;
        this.y=0;
        this.xSpeed=0;
        this.ySpeed=0;
    }
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public void  moveUp(){
        y+=ySpeed;
    }
    public void  moveDown(){
        y-=ySpeed;
    }
    public void  moveRight(){
        x+=xSpeed;
    }
    public void  moveLeft(){
        x-=xSpeed;
    }

    public String toString(){
        return "Coordinates of the point: ("+x+";"+y+")";
    }
}
