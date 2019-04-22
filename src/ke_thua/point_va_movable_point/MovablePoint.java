package ke_thua.point_va_movable_point;

public class MovablePoint  extends Point{
    private  float xSpeed=0.0f;
    private  float ySpeed=0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed= xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] arr = new float[2];
        arr[0]=xSpeed;
        arr[1]=ySpeed;
        return arr;
    }

    @Override
    public String toString() {
        float arrS[]= getSpeed();
        float arr[]= getXY();
        return "(x,y)= ("+getX()+", "+getY()+"); speed=(xs,ys)=( "+xSpeed+", "+ySpeed+ ")";
    }
    public boolean move(){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return
    }
}
