public class sortColors {
    public void sort(int nums[]){
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        sortColors a=new sortColors();
        int nums[]={2,0,2,1,1,0};
        a.sort(nums);
        printArray(nums);
    }
    public static void printArray(int nums[]){
        System.out.print("[");
        for(int i=0;i<nums.length;i++){
            if (i>0) {
                System.out.print(",");
            }   
            System.out.print(nums[i]);
        }
        System.out.println("]");
    }
}