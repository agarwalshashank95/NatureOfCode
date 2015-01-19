class Vector{
    double x,y;
    
    Vector(double xx,double yy){
        x=xx;
        y=yy;
    }
    
    Vector(){
        x=0;
        y=0;
    }
    
    void add(Vector v){
        x=x+v.x;
        y=y+v.y;
    }
    
    void subtract(Vector v){
        x=x-v.x;
        y=y-v.y;
    }
    
    void mult(double n){
        x=x*n;
        y=y*n;
    }
    
    void mult(double xx, double yy){
        x=x*xx;
        y=y*yy;
    }
    
    void setMag(double m){
        normalise();
        mult(m);
    }
    
    void normalise(){
        double d=Math.sqrt(x*x+y*y);
        x=x/d;
        y=y/d;
    }
    
    double dot(Vector v){
        return x*v.x+y*v.y;
    }
    
    double mag(){
        return Math.sqrt(x*x+y*y);
    }
    
    void setMaxMag(double m){
        double d=Math.sqrt(x*x+y*y);
        if(d>m){
            normalise();
            mult(m);
        }
    }
    
    Vector get(){
        return new Vector(x,y);
    }
              
    
    static Vector add(Vector a, Vector b){
        Vector v=new Vector(a.x+b.x,a.y+b.y);
        return v;
    }
    
    static Vector subtract(Vector a, Vector b){
        Vector v=new Vector(a.x-b.x,a.y-b.y);
        return v;
    }
}