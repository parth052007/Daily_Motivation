class box<T>{
    T t;
    box(T t){
        this.t=t;
    }
    void display(){
        System.out.println("value is :"+t);
    }

public static void main (String[]args){
    box<Integer> b = new box<>(34);
    box<String> b1 = new box<>("parth");
    b.display();
    b1.display();
}
}