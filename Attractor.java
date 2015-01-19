class Attractor{
    Vector l;
    int mass;
    
    Attractor(int x,int y,int r){
        l=new Vector(x,y);
        mass=r;
    }
    
    void disp(Draw d){
        d.setPenColor(d.BOOK_RED);
        d.filledCircle(l.x,l.y,mass);
    }
    
    Vector attract(Mover m){
        Vector f=Vector.subtract(l,m.l);
        double dist=f.mag();
        dist=Math.max(dist,5);
        f.normalise();
        f.mult(m.mass*mass/(dist*dist));
        return f;
    }
}
    