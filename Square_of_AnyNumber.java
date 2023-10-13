class A {
    int num = 10;
    int Square(int num) {
        int square = (num * num);
        return square;
    }
    public static void main(String[] args) {
        A obj = new A();
        int y = obj.Square(obj.num);
        System.out.println("Square of 10 is " + y);
    }
}
