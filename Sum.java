class Sum {
    public static void main(String[] args) {
        int n=5489;
        int sum=0,r;
        while(n!=0){
            r=n%10;
            sum+=r;
            n=n/10;
        }
        System.out.println(sum);
    }
}