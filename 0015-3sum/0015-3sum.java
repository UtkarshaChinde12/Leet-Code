class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /*
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> list=Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(list);
                        set.add(list);
                    }
                }

            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        ans.addAll(set);
        return ans;
        */
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            Set<Integer> hashSet=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int third=-(nums[i]+nums[j]);
                if(hashSet.contains(third)){
                    List<Integer> list=Arrays.asList(nums[i],nums[j],third);
                    Collections.sort(list);
                    set.add(list);
                }
                else{
                    hashSet.add(nums[j]);
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>(set);
        return ans;
    }
}