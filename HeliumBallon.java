import java.util.*;
class HeliumBallon{
    Vector l;
    Vector v;
    Vector a;
    Draw d;
    int r;
    HeliumBallon(){
        l=new Vector(0,230);
        v=new Vector(0,0);
        a=new Vector();
        d=new Draw();
        d.setCanvasSize(600,600);
        d.setXscale(0,300);
        d.setYscale(0,300);
        d.setPenColor(d.BOOK_BLUE);
    }
    
    void addAcceleration(Vector v){
        a.add(v);
    }
    
    void update(){
        v.add(a);
        v.setMaxMag(30);
        l.add(v);
        if(l.x>300){
            v.mult(-1,1);
        }
        else if(l.x<0){
            v.mult(-1,1);
        }
        else if(l.y>300){
            v.mult(1,-1);
        }
        else if(l.y<0){
            v.mult(1,-1);
        }
        a.mult(0);
    }
    
    void disp(){
       d.clear();
      
       d.filledCircle(l.x,l.y,7);
    }
    
    public static void main(){
        Timer timer = new Timer();
        RemindTask rt=new RemindTask();
        timer.schedule(rt,
                       0,        //initial delay
                       15);  //subsequent rate
        
        
    }
    
    
}

class RemindTask extends TimerTask {
        HeliumBallon hb=new HeliumBallon();
        Vector grav=new Vector(0,-0.09);
        Vector wind=new Vector(0.01,0);
        public void run() {
            hb.addAcceleration(grav);
            //wind=new Vector(Math.random(),0);
            hb.addAcceleration(wind);
            hb.update();
            hb.disp();
        }
}