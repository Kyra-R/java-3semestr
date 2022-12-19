package work6;

public class MovableRectangle implements Movable {
    MovablePoint topLeft;
    MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1,int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint();
        bottomRight = new MovablePoint();
        topLeft.x=x1;
        topLeft.y=y1;
        topLeft.xSpeed=xSpeed;
        topLeft.y=ySpeed;
        bottomRight.x=x2;
        bottomRight.y=y2;
        bottomRight.xSpeed=xSpeed;
        bottomRight.ySpeed=ySpeed;
    }
    void notEqual(String message){
        System.out.println(message);
    }
    boolean ifEqual(){
        if (topLeft.xSpeed!=bottomRight.xSpeed) {
            notEqual("Unequal speed on x axis!");
            return false;
        }
        if (topLeft.ySpeed!=bottomRight.ySpeed) {
            notEqual("Unequal speed on y axis!");
            return false;
        }

            return true;

    }
    boolean ifEqual(String s){
        if (topLeft.xSpeed!=bottomRight.xSpeed && s=="x") {
            notEqual("Unequal speed on x axis!");
            return false;
        }
        else if (topLeft.ySpeed!=bottomRight.ySpeed  && s=="y") {
            notEqual("Unequal speed on y axis!");
            return false;
        }
        else {
            return true;
        }
    }

    public void  moveUp(){
        if (ifEqual("y")){
            topLeft.y+=topLeft.ySpeed;
            bottomRight.y+=bottomRight.ySpeed;
        }
    }
    public void  moveDown(){
        if (ifEqual("y")){
            topLeft.y-=topLeft.ySpeed;
            bottomRight.y-=bottomRight.ySpeed;
        }
    }
    public void  moveRight(){
        if (ifEqual("x")){
            topLeft.x+=topLeft.xSpeed;
            bottomRight.x+=bottomRight.xSpeed;
        }
    }
    public void  moveLeft(){
        if (ifEqual("x")){
            topLeft.x-=topLeft.xSpeed;
            bottomRight.x-=bottomRight.xSpeed;
        }
    }

    public String toString(){
        return "Coordinates of the top left point: ("+topLeft.x+";"+topLeft.y+"), \n " +
                "Coordinates of the bottom right point: ("+bottomRight.x+";"+bottomRight.y+")";
    }
}
