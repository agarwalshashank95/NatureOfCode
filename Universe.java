import java.util.*;
class Universe{
    public static void main(){
        Timer timer = new Timer();
        RemindTask rt=new RemindTask();
        timer.schedule(rt,
                       0,        //initial delay
                       15);  
    }

}
class RemindTask extends TimerTask {
        
        Mover m;
        Attractor a;
        Draw d;
        
        RemindTask(){
            d=new Draw();
            d.setCanvasSize(600,600);
            d.setXscale(0,300);
            d.setYscale(0,300);
            m=new Mover(7);
            a=new Attractor(150,150,14);
            m.l=new Vector(150,50);
            //m.v=new Vector(-20,
        }
        public void run() {
            d.clear();
            m.applyForce(a.attract(m));
            m.update();
            m.disp(d);
            a.disp(d);
        }
}