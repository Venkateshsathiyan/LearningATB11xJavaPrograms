package Daywise_task;

public class square_cube_root_fns {
    public static void main(String[] args) {
//        cuberoot(3)(x.sq+y.sq-|z|.sq)
        int x=10, y=10, z=10;
        System.out.println(Math.pow(x,2));
        System.out.println(Math.pow(y,2));
        System.out.println(Math.abs(z)); // make the neg value to absolute positive
        System.out.println(Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z)));
    }
}
