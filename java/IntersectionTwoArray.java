package LeetCodeSol.java;

import java.util.HashMap;
/**
 * Given two arrays, write a function to compute their intersection.
 * 
 * Example:
 *  Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 *  
 *  Solution : consider Hash Map
 *  
 * @author caomi
 *
 */
public class IntersectionTwoArray {
	public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] shortArr = nums1.length > nums2.length ? nums2 : nums1;
        int[] longArr  = nums1.length > nums2.length ? nums1 : nums2;
        int minLength = nums1.length <= nums2.length ? nums1.length : nums2.length;
        int[] temp = new int[minLength];
        for(int i =0; i<shortArr.length;i++){
          if(!map.containsKey(shortArr[i])){map.put(shortArr[i],1);}
          }
        int id = 0;
        for(int i=0;i<longArr.length;i++){
           if(map.containsKey(longArr[i])){
              int count = map.get(longArr[i]);
              if(count>0){
                 temp[id++] = longArr[i];
                 map.put(longArr[i],0);}
             }
         }
         int[] result = new int[id];
         for(int i=0; i<id;i++){
             result[i]=temp[i];
         }
         return result;
        }
}
