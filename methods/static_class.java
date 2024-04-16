// static method trying to access instance variable
class test{
    // instance variable will generate error so declare static variable
    static int x= 55;
    // // parameterized constructor
    // test(int x){
    //     this.x = x;
    // }

    // static method accessing x value..
    static void access(){
        System.out.print("x: "+x);
    }
}

class static_class{
    public static void main(String args[]){
        test t = new test();
        t.access();
    }
}