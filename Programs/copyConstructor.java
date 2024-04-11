class copyConstructor {
    int num ;
    copyConstructor( int a){
        num = a;
    }
    void print(){System.out.println(num);}
    public static void main(String[] args) {
        copyConstructor c1 = new copyConstructor(10);
        copyConstructor c2 = c1;
        c2.print();
    }
}
