public class MethodOverloading {
    byte show(byte a, byte b){
        return (byte)(a+b);
    }
    int show(int a, int b){
        return a*b;
    }
    float show(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        MethodOverloading ob = new MethodOverloading();
        System.out.println(ob.show(2,4));

    }
}
