class Main {
    static void foo(){
        System.out.println("hello !");
    }
    static void foo(int a){
        System.out.println(a);
    }
    static void foo(int b, int c){
        System.out.println(b + c);
    }
    public static void main(String[] args) {
        System.out.println("method overload");
        foo();
        foo(12);
        foo(11,34);
    }
}
