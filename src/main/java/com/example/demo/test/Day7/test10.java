//package com.example.demo.test.Day7;
//
//import java.util.PriorityQueue;
//
//public class test10 {
//    public static void main(String[] args) {
//        //[3,2,1,5,6,4]
//
//        int[] nums = null;
//        nums[0] = 3;
//        nums[1] = 2;
//        nums[2] = 1;
//        nums[3] = 5;
//        nums[4] = 6;
//        nums[5] = 4;
//        int k = 2;
//        int kthLargest = findKthLargest(nums, k);
//
//
//    }
//
//    public int findKthLargest(int[] nums,int k){
//        final PriorityQueue<Integer> queue = new PriorityQueue<>();
//        for (int val : nums) {
//            queue.add(val);
//            if(queue.size() > k) {
//                queue.poll();
//            }
//        }
//        return queue.peek();
//    }
//}
