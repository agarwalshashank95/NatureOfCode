class Mover{
    Vector l;
    Vector v;
    Vector a;
    
    double mass;
    
    Mover(double mm){
        mass=mm;
        l=new Vector();
        v=new Vector();
        a=new Vector();
    }
    
    void update(){
        v.add(a);
        v.setMaxMag(40);
        l.add(v);
        a.mult(0);
    }
    
    void applyForce(Vector f){
        f.mult(1.0/mass);
        a.add(f);
    }
    
    void addAcceleration(Vector aa){
        a.add(aa);
    }
    
    void disp(Draw d){
        d.setPenColor(d.BOOK_BLUE);
        d.filledCircle(l.x,l.y,mass);
        System.out.println(l.x+" "+l.y);
    }
}