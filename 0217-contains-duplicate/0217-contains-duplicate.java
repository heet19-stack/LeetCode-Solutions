class Solution {

    public static HashMap<Integer, Integer> frequencyHashMap(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        return map;
    }

    public boolean containsDuplicate(int arr[]) {

        HashMap<Integer, Integer> map = frequencyHashMap(arr);

        for (Integer frequency : map.values()) {
            if (frequency > 1) {
                return true;
            }
        }

        return false;
    }
}