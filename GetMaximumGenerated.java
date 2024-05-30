class GetMaximumGenerated {
    public int getMaximumGenerated(int n) {
        if(n==0) return 0;
        int[] nums = new int[n+1];
        nums[1] = 1;
        int out = 1;
        for(int i=2; i<nums.length; i++){
            if(i%2 == 0){
                nums[i] = nums[i/2];
            }else{
                nums[i] = nums[(i-1)/2] + nums[((i-1)/2)+1];
            }
            out = Math.max(out,nums[i]);
        }
        return out;
    }
}
