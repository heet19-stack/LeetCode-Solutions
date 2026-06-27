class Solution {
   public static int[] twoSum(int arr[],int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int need = target - current;

            if (map.containsKey(need)) {
                int[] arrAns ={map.get(need),i};
                return arrAns;
            }
            map.put(current,i);

        }
        return null;
    }
}