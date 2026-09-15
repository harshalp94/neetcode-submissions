// Definition for a pair.
// class Pair {
//     int key;
//     String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> quickSort(List<Pair> pairs) {
        quickSortHelper(pairs,0,pairs.size()-1);
        return pairs;
    }
    private void quickSortHelper(List<Pair> arr, int s, int e){
        if (e - s +1 <= 1){
            return;
        }
        Pair pivot = arr.get(e);
        int left = s;
        // [partition part]
        for (int i = s; i<e; i++){
            if(arr.get(i).key < pivot.key){ // check last element with first
                Pair tmp = arr.get(left); // add the first element to temp location
                arr.set(left, arr.get(i)); // i = 0 here, so i am swapping first element with first element?
                arr.set(i, tmp);
                left++; // move the pointer to second element
            }
        }
        arr.set(e, arr.get(left)); // set last element to 1st?
        arr.set(left, pivot); // 
        quickSortHelper(arr, s, left -1);
        quickSortHelper(arr, left + 1, e);

    }
}