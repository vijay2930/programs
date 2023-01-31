package programs;

public class CheckArrayIsSorted {
    static boolean isarraysorted(int arr[]){
        int diff=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1] || arr[i]<arr[i+1])
                continue;
            diff++;
        }
        if(diff==1){
            if(!(arr[arr.length-1]<=arr[0]))
                diff++;
            if(diff==1)
                return true;
        }
        return false;
    }
    
    public static void main(String arg[]){
        int arr[]={2,1};
        System.out.print(isarraysorted(arr));
    }
}
