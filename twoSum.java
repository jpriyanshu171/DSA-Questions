import java.util.HashMap;

public class twoSum {
    public int[] sum(int nums[],int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
    public static void main(String[] args) {
        twoSum a=new twoSum();
        int result[]=a.sum(new int[]{3,4,2},6);
        System.out.println("["+result[0]+","+result[1]+"]");
    }
}