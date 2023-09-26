// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Sum {
    public static void main(String[] args) {
        int sum = 0;
        int odd = 0;
        for(int i = 7;i<=21;i++){
            if(i%2!=0){
                odd = i;
                sum = i+odd;
                System.out.println("even number is:"+odd);
            }
        }
        System.out.println("sum of the number is"+sum);
    }
}