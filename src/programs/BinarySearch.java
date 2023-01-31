package programs;
public class BinarySearch {
    static int search(int arr[],int l,int h,int key){
        if (l > h)
            return -1;
        int mid = (l + h) / 2;
        if (arr[mid] == key)
            return mid;
        if (arr[l] <= arr[mid]) {
            if (key >= arr[l] && key <= arr[mid])
                return search(arr, l, mid - 1, key);
            return search(arr, mid + 1, h, key);
        }
        if (key >= arr[mid] && key <= arr[h])
            return search(arr, mid + 1, h, key);
        return search(arr, l, mid - 1, key);
    }
    public static void main(String arg[]){
        int arr[]={8,9,1,2,3,4,5,6,7};
        int key=9;
        System.out.println(search(arr,0,arr.length-1,key));
    }
}