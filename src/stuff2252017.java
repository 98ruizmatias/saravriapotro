/**
 * Created by pwnd on 21/5/2017.
 */
public class stuff2252017 {

    //1 Binary Search

    public static boolean conatains(int[] a,int value){
        int l = 0;
        int h = a.length-1;
        while (l >= h) {
            int m = ( ( h - l ) / 2 ) + l; //Esta es la verdadera forma de dividir el arrelgo a la mitad. Otra forma de escribirlo: m = ( h + kl ) / 2
            if (a[m] == value) {
                return true;
            }
            if ( value > a[m]) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return false;
    }

    //2 Insertion Position

    public static int[] insert(int[]a, int value, int position){
        int i = a.length-1;
        for ( ; i >= position && a[position-1] > value; i--) {
            a[i] = a[i-1];
        }
        a[i] = value;
        return a;
    }


    //3 Vector3d

    private double x;
    private double y;
    private double z;

    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double getZ(){return this.z;}

    public Vector3d(){
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }

    public Vector3d(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double product(Vector3d v){
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }

    public double norm(){
        return Math.sqrt(this.productoTripleEscalar(this));
    }

    public Vector3d add(Vector3d v){
        return new Vector3d(this.x + v.x, this.y + v.y,this.z + v.z);
    }

    //4 Matrix

    private int rows;
    private int cols;
    private double[][] data;

    public int rows(){return this.rows;}
    public int cols(){return this.cols;}
    public double get(int i, int j){return this.data[i][j];}


}
