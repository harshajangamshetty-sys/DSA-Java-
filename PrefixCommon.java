public class PrefixCommon {
        public int[] findThePrefixCommonArray(int[] A, int[] B) {
            int n = A.length;
            int[] count = new int[n + 1]; // freq of seen numbers
            int[] C = new int[n];
            int common = 0;

            for (int i = 0; i < n; i++) {
                // process A[i]
                count[A[i]]++;
                if (count[A[i]] == 2) common++;

                // process B[i]
                count[B[i]]++;
                if (count[B[i]] == 2) common++;

                C[i] = common;
            }

            return C;
        }
    }

