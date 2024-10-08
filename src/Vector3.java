/**
 * Vector3 implementation in Java
 */
public class Vector3 {

    public float  x = 0;

    public float  y = 0;

    public float  z = 0;

    private float length = -1;

    public Vector3(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Adds a vector to another
     * @param other the vector to add with
     * @return the new vector resulting from this operation
     */
    public Vector3 add(Vector3 other){
        return new Vector3(x + other.x, y + other.y, z + other.z);
    }

    /**
     * Subtracts a vector from another, this - other
     * @param other the vector to subtract with
     * @return the new vector resulting from this operation
     */
    public Vector3 sub(Vector3 other){
        return new Vector3(x - other.x, y - other.y, z - other.z);
    }

    /**
     * Multiplies a vector by a scalar
     * @param scalar the scalar to multiply with
     * @return the new vector from this multiplication
     */
    public Vector3 multiply(float scalar){
        return new Vector3(x * scalar, y * scalar, z * scalar);
    }

    /**
     * Dots two vectors together
     * @param other the vector to dot with
     * @return the dot product
     */
    public float dot(Vector3 other){
        return x * other.x + y * other.y + z * other.z;
    }

    /**
     * Returns the length of the vector
     * @return the length of the vector
     */
    public float length(){
        if (length == -1){
            length = (float) Math.sqrt(x*x + y*y + z*z);
        }
        return length;
    }

    /**
     * Projects this vector onto another vector, this is projected onto other
     * @param other the vector to project onto
     * @return the new projected vector
     */
    public Vector3 project(Vector3 other){
        return other.multiply((float) (dot(other)/Math.pow(other.length(), 2)));
    }

    /**
     * Gets the cross product of this X other
     * @param other the other vector
     * @return the cross product
     */
    public Vector3 cross(Vector3 other){
        return new Vector3(
                (y * other.z) - (z * other.y),
                (z * other.x) - (x * other.z),
                (x * other.y) - (y * other.x)
        );
    }

    /**
     * Returns the vector in unit distance
     * @return the unit vector
     */
    public Vector3 unit(){
        return new Vector3(x/length(), y/length(), z/length());
    }

    /**
     * For debugging prints out the Vector3
     * @return string representation of the object
     */
    @Override
    public String toString() {
        return "Vector3{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
