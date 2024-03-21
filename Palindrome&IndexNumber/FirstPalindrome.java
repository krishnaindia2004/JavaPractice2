public class firstpalindrome{
    public static void main(String[] args) {
        String[] arr={"abc","bcd" , "aba","cfg","madam"};
        for(int i=0;i<arr.length;i++){
        	StringBuilder temp=new StringBuilder(arr[i]);
        	String ans=temp.reverse().toString();  
        	if(ans.equals(arr[i])){
        		System.out.println(ans);
                break;
            }
       }
    }
}
