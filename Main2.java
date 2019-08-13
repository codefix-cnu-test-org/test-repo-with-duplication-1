class Main {
    public static void main(String[] args) {
        int result = sum1(1, 2);
        int res2 = sum2(result, 2);
        
        System.out.println(res2);
    }

    public static int sum1(int a, int b) {
        int result = a + 5;
        return result + b;
    }
    
    public static int sum2(int a, int b) {
        int result = a + 5;
        return result + b;
    }
}
