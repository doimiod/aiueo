class Solution {
    public int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        int[] res = new int[n];
        int[][] enrichedTasks = new int[n][3];  // [enqueue_time, processing_time, original_index]

        for (int i = 0; i < n; i++) {
            enrichedTasks[i] = new int[]{tasks[i][0], tasks[i][1], i};
        }

        Arrays.sort(enrichedTasks, (x, y) -> {
            if(x[0] != y[0])return x[0] - y[0];
            if(x[1] != y[1])return x[1] - y[1];
            return x[2] - y[2];
        });

        PriorityQueue<int[]> heap = new PriorityQueue<>((x, y) -> {
            if(x[1] != y[1])return x[1] - y[1];
            return x[2] - y[2];
        });

        int time = enrichedTasks[0][0];
        int i = 0, j = 0;

        while (j < n) {
            // Push all tasks that can be started at `time`
            while (i < n && enrichedTasks[i][0] <= time) {
                heap.offer(enrichedTasks[i++]);
            }

            // If there are no tasks in the heap, move time to the enqueue time of the next task and continue
            if (heap.isEmpty()) {
                time = enrichedTasks[i][0];
                continue;
            }

            // Process a task from the heap
            int[] task = heap.poll();  // this is because task is set for array.
            time += task[1];
            res[j++] = task[2];
        }

        return res;
    }
}
