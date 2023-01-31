package programs;

public class UpperSpiralTriangle {
    static int n=11;
    static int arr[][]=new int[n][n];
    public static void main(String arg[]){

        int val=1;  
        int end=n-1;
        int r=-1,c=-1;
        do{
            int count=0;
            while(count<=end){
                arr[++r][++c]=val++;
                count++;
            }

            
            end--;
            count=0;
            while(count<=end){
                arr[--r][c]=val++;
                count++;
            }
            end--;
            count=0;
            while(count<=end){
                arr[r][--c]=val++;
                count++;
            }
            end--;
        }while(end>0);
        for(int res[]:arr){
            for(int k:res){
                if(k!=0)
                    System.out.printf("%5d",k);
                else
                    System.out.print("     ");
            }
            System.out.println();
        }
    }
}
