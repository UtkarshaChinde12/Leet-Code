class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list=new ArrayList<Integer>();
		
		List<Integer> l1=new ArrayList<Integer>();
		for(int i=0;i<nums1.length;i++)
			l1.add(nums1[i]);
		
		List<Integer> l2=new ArrayList<Integer>();
		for(int i: nums2)
			l2.add(i);
		
		List<Integer> l3=new ArrayList<Integer>();
		for(int i: nums3)
			l3.add(i);
				
		for(int i=0;i<nums1.length;i++)
		{
			if(l1.contains(nums1[i])&& l2.contains(nums1[i]) || (l1.contains(nums1[i]) && l3.contains(nums1[i])) ||  (l2.contains(nums1[i])&& l3.contains(nums1[i])) ) {
				if(!list.contains(nums1[i]))
					list.add(nums1[i]);
				
			}
		}		
		for(int i=0;i<nums2.length;i++)
		{
			if(l1.contains(nums2[i])&& l2.contains(nums2[i]) || (l1.contains(nums2[i]) && l3.contains(nums2[i])) ||  (l2.contains(nums2[i])&& l3.contains(nums2[i])) ) {
				if(!list.contains(nums2[i]))
					list.add(nums2[i]);
				
			}
		}		
		for(int i=0;i<nums3.length;i++)
		{
			if(l1.contains(nums3[i])&& l2.contains(nums3[i]) || (l1.contains(nums3[i]) && l3.contains(nums3[i])) ||  (l2.contains(nums3[i])&& l3.contains(nums3[i])) ) {
				if(!list.contains(nums3[i]))
					list.add(nums3[i]);
				
			}
		}		
		return list;
    }
}