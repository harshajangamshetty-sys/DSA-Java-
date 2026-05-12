public class insertion {
    public static int[] insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
        int key = arr[i];
        int j = i-1;
        while (j>=0 && key < arr[j]) {
            arr[j+1]=arr[j];
            j--;
            
        }
        arr[j+1]=key;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={3,5,2,8,1};
        insertionSort(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
