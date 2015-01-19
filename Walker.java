import java.awt.event.*;
import java.util.*;
class Walker{
    int x,y;
    
    Random r;
    
    Walker(int sx,int sy){
        x=sx;
        y=sy;
        r=new Random();
    }
    
    void nextGaussianStep(){
        /**
        int choice=(int)(Math.random()*4);
        if(choice==0)
            x+=2;
        else if(choice==1)
            x-=2;
        else if(choice==2)
            y+=2;
        else
            y-=2;
        **/
        
       
       int stepx=nextGaussian(2,1)*(r.nextInt(3)-1);
       int stepy=nextGaussian(2,1)*(r.nextInt(3)-1);
        
       StdDraw.line(x,y,x+stepx,y+stepy);
       x += stepx;
       y += stepy;
    }
    
    void nextFollowMouse(){
        double r=Math.random();
        int stepx=0;
        int stepy=0;
        
        if(r<0.6){
            int mx=(int)(StdDraw.mouseX());
            int my=(int)(StdDraw.mouseY());
            int dx=mx-x;
            int dy=my-y;
            int d=(int)Math.sqrt(dx*dx+dy*dy);
            if(d!=0){
                stepx=dx/d;
                stepy=dy/d;
            }
        }
        else{
            stepx=(int)(3*Math.random())-1;
            stepy=(int)(3*Math.random())-1;
        }
        
        StdDraw.line(x,y,x+stepx,y+stepy);
       x += stepx;
       y += stepy;
        
    }
    
    void nextLevyStep(){
        double r=Math.random();
        int stepx=0;
        int stepy=0;
        
        if(r<0.01){
            stepx=(int)(100*Math.random())-50;
            stepy=(int)(100*Math.random())-50;
        }
        else{
            stepx=(int)(3*Math.random())-1;
            stepy=(int)(3*Math.random())-1;
        }
        
        StdDraw.line(x,y,x+stepx,y+stepy);
       x += stepx;
       y += stepy;
        
    }
    
    int nextGaussian(int mean,int var){
        return mean+(int)(r.nextGaussian()*var);
    }
    
    public static void main(){
        StdDraw.setCanvasSize(600,600);
        StdDraw.setXscale(0.0,300.0);
        StdDraw.setYscale(0.0,300.0);
        
        Walker w=new Walker(150,150);
        
        while(true){
            w.nextFollowMouse();
        }
 
    }
    
       
}


    