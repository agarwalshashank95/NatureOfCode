public class PVector{

  public float x;
  public float y;
  public float z;
  protected transient float[] array;

  public PVector()
  {
  }

  public PVector(float x, float y, float z)
  {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public PVector(float x, float y)
  {
    this.x = x;
    this.y = y;
    this.z = 0.0F;
  }

  public void set(float x, float y, float z)
  {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public void set(PVector v)
  {
    this.x = v.x;
    this.y = v.y;
    this.z = v.z;
  }

  public void set(float[] source)
  {
    if (source.length >= 2) {
      this.x = source[0];
      this.y = source[1];
    }
    if (source.length >= 3)
      this.z = source[2];
  }

  public PVector get()
  {
    return new PVector(this.x, this.y, this.z);
  }

  public float[] get(float[] target)
  {
    if (target == null) {
      return new float[] { this.x, this.y, this.z };
    }
    if (target.length >= 2) {
      target[0] = this.x;
      target[1] = this.y;
    }
    if (target.length >= 3) {
      target[2] = this.z;
    }
    return target;
  }

  public float mag()
  {
    return (float)Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
  }

  public float magSq()
  {
    return this.x * this.x + this.y * this.y + this.z * this.z;
  }

  public void add(PVector v)
  {
    this.x += v.x;
    this.y += v.y;
    this.z += v.z;
  }

  public void add(float x, float y, float z)
  {
    this.x += x;
    this.y += y;
    this.z += z;
  }

  public static PVector add(PVector v1, PVector v2)
  {
    return add(v1, v2, null);
  }

  public static PVector add(PVector v1, PVector v2, PVector target)
  {
    if (target == null)
      target = new PVector(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
    else {
      target.set(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
    }
    return target;
  }

  public void sub(PVector v)
  {
    this.x -= v.x;
    this.y -= v.y;
    this.z -= v.z;
  }

  public void sub(float x, float y, float z)
  {
    this.x -= x;
    this.y -= y;
    this.z -= z;
  }

  public static PVector sub(PVector v1, PVector v2)
  {
    return sub(v1, v2, null);
  }

  public static PVector sub(PVector v1, PVector v2, PVector target)
  {
    if (target == null)
      target = new PVector(v1.x - v2.x, v1.y - v2.y, v1.z - v2.z);
    else {
      target.set(v1.x - v2.x, v1.y - v2.y, v1.z - v2.z);
    }
    return target;
  }

  public void mult(float n)
  {
    this.x *= n;
    this.y *= n;
    this.z *= n;
  }

  public static PVector mult(PVector v, float n)
  {
    return mult(v, n, null);
  }

  public static PVector mult(PVector v, float n, PVector target)
  {
    if (target == null)
      target = new PVector(v.x * n, v.y * n, v.z * n);
    else {
      target.set(v.x * n, v.y * n, v.z * n);
    }
    return target;
  }

  public void mult(PVector v) {
    this.x *= v.x;
    this.y *= v.y;
    this.z *= v.z;
  }

  public static PVector mult(PVector v1, PVector v2)
  {
    return mult(v1, v2, null);
  }

  public static PVector mult(PVector v1, PVector v2, PVector target)
  {
    if (target == null)
      target = new PVector(v1.x * v2.x, v1.y * v2.y, v1.z * v2.z);
    else {
      target.set(v1.x * v2.x, v1.y * v2.y, v1.z * v2.z);
    }
    return target;
  }

  public void div(float n)
  {
    this.x /= n;
    this.y /= n;
    this.z /= n;
  }

  public static PVector div(PVector v, float n)
  {
    return div(v, n, null);
  }

  public static PVector div(PVector v, float n, PVector target)
  {
    if (target == null)
      target = new PVector(v.x / n, v.y / n, v.z / n);
    else {
      target.set(v.x / n, v.y / n, v.z / n);
    }
    return target;
  }

  public void div(PVector v)
  {
    this.x /= v.x;
    this.y /= v.y;
    this.z /= v.z;
  }

  public static PVector div(PVector v1, PVector v2)
  {
    return div(v1, v2, null);
  }

  public static PVector div(PVector v1, PVector v2, PVector target) {
    if (target == null)
      target = new PVector(v1.x / v2.x, v1.y / v2.y, v1.z / v2.z);
    else {
      target.set(v1.x / v2.x, v1.y / v2.y, v1.z / v2.z);
    }
    return target;
  }

  public float dist(PVector v)
  {
    float dx = this.x - v.x;
    float dy = this.y - v.y;
    float dz = this.z - v.z;
    return (float)Math.sqrt(dx * dx + dy * dy + dz * dz);
  }

  public static float dist(PVector v1, PVector v2)
  {
    float dx = v1.x - v2.x;
    float dy = v1.y - v2.y;
    float dz = v1.z - v2.z;
    return (float)Math.sqrt(dx * dx + dy * dy + dz * dz);
  }

  public float dot(PVector v)
  {
    return this.x * v.x + this.y * v.y + this.z * v.z;
  }

  public float dot(float x, float y, float z)
  {
    return this.x * x + this.y * y + this.z * z;
  }

  public static float dot(PVector v1, PVector v2)
  {
    return v1.x * v2.x + v1.y * v2.y + v1.z * v2.z;
  }

  public PVector cross(PVector v)
  {
    return cross(v, null);
  }

  public PVector cross(PVector v, PVector target)
  {
    float crossX = this.y * v.z - v.y * this.z;
    float crossY = this.z * v.x - v.z * this.x;
    float crossZ = this.x * v.y - v.x * this.y;

    if (target == null)
      target = new PVector(crossX, crossY, crossZ);
    else {
      target.set(crossX, crossY, crossZ);
    }
    return target;
  }

  public static PVector cross(PVector v1, PVector v2, PVector target)
  {
    float crossX = v1.y * v2.z - v2.y * v1.z;
    float crossY = v1.z * v2.x - v2.z * v1.x;
    float crossZ = v1.x * v2.y - v2.x * v1.y;

    if (target == null)
      target = new PVector(crossX, crossY, crossZ);
    else {
      target.set(crossX, crossY, crossZ);
    }
    return target;
  }

  public void normalize()
  {
    float m = mag();
    if ((m != 0.0F) && (m != 1.0F))
      div(m);
  }

  public PVector normalize(PVector target)
  {
    if (target == null) {
      target = new PVector();
    }
    float m = mag();
    if (m > 0.0F)
      target.set(this.x / m, this.y / m, this.z / m);
    else {
      target.set(this.x, this.y, this.z);
    }
    return target;
  }

  public void limit(float max)
  {
    if (mag() > max) {
      normalize();
      mult(max);
    }
  }

  public void setMag(float len)
  {
    normalize();
    mult(len);
  }

  public PVector setMag(PVector target, float len)
  {
    target = normalize(target);
    target.mult(len);
    return target;
  }

  public float heading2D()
  {
    float angle = (float)Math.atan2(-this.y, this.x);
    return -1.0F * angle;
  }

  public void rotate(float theta)
  {
    float xTemp = this.x;

    //this.x = (this.x * Math.cos(theta) - this.y * PApplet.sin(theta));
    //this.y = (xTemp * PApplet.sin(theta) + this.y * PApplet.cos(theta));
  }

  public void lerp(PVector v, float amt)
  {
    //this.x = PApplet.lerp(this.x, v.x, amt);
   // this.y = PApplet.lerp(this.y, v.y, amt);
  }

  public void lerp(float x, float y, float z, float amt) {
    //this.x = PApplet.lerp(this.x, x, amt);
    //this.y = PApplet.lerp(this.y, y, amt);
  }

  public static float angleBetween(PVector v1, PVector v2)
  {
    double dot = v1.x * v2.x + v1.y * v2.y + v1.z * v2.z;
    double v1mag = Math.sqrt(v1.x * v1.x + v1.y * v1.y + v1.z * v1.z);
    double v2mag = Math.sqrt(v2.x * v2.x + v2.y * v2.y + v2.z * v2.z);

    double amt = dot / (v1mag * v2mag);

    if (amt <= -1.0D)
      return 3.141593F;
    if (amt >= 1.0D)
    {
      return 0.0F;
    }
    return (float)Math.acos(amt);
  }

  public String toString()
  {
    return "[ " + this.x + ", " + this.y + ", " + this.z + " ]";
  }

  public float[] array()
  {
    if (this.array == null) {
      this.array = new float[3];
    }
    this.array[0] = this.x;
    this.array[1] = this.y;
    this.array[2] = this.z;
    return this.array;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof PVector))
      return false;
    PVector p = (PVector)obj;
    return (this.x == p.x) && (this.y == p.y) && (this.z == p.z);
  }

  public int hashCode()
  {
    int result = 1;
    result = 31 * result + Float.floatToIntBits(this.x);
    result = 31 * result + Float.floatToIntBits(this.y);
    result = 31 * result + Float.floatToIntBits(this.z);
    return result;
  }
}