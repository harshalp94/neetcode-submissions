class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> stuQueue = new LinkedList<>();
        for (int stu : students) {
            stuQueue.add(stu);
        }
        int sanIndex = 0;
        int rotations = 0;
        while (!stuQueue.isEmpty() && rotations < stuQueue.size()) {
            if (stuQueue.peek() == sandwiches[sanIndex]) {
                stuQueue.poll();
                sanIndex++;
                rotations = 0;
            } else {
                int eolStu = stuQueue.poll();
                stuQueue.add(eolStu);
                rotations++;
            }
        }
        return stuQueue.size();
    }
}