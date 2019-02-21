class Hello{

    public static void main(String args[]){
        
        // Hello h=new Hello();
        display();
        System.out.println("Hello World!!!");
        display();
        System.out.println(add(5,6));
        System.out.println(sub(10,4));
        System.out.println(mul(10,2));
        System.out.println(div(10,3));

    }

    static void display(){
        System.out.println("This");
    }

    static double add(double a,double b){
        return a+b;
    }
    
    static double sub(double a,double b){
        return a-b;
    }

    static double mul(double a,double b){
        return a*b;
    }
    static double div(double a, double b){
        return a/b;
    }
    
}