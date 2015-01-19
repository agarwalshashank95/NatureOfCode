class AccVector{
   Vector l;
   Vector v;
   Vector a;
   Vector m;
   int topspeed;
   AccVector(){
       
       l=new Vector(150,150);
       v=new Vector(0,0);
       a=new Vector(0,0);
       topspeed = 4;
    }
    
   void nextStep(){
       m=new Vector(StdDraw.mouseX(),StdDraw.mouseY());
       a=Vector.subtract(m,l);
       a.normalise();
       a.mult(0.5);
       v.add(a);
       v.setMaxMag(topspeed);
       l.add(v);
       StdDraw.clear();
       StdDraw.circle(l.x,l.y,5);
    }

    
   public static void main(String args[]){
       StdDraw.setCanvasSize(600,600);
       StdDraw.setXscale(0,300);
       StdDraw.setYscale(0,300);
       

       AccVector w=new AccVector(); 
       while(true){
           for(int i=0;i<=60000000;i++);
            w.nextStep();
        }
    }
}
       