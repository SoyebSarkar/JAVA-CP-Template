class BIT {
            int[] val;

            BIT(int n) {
                val = new int[n + 1];
            }

            void update(int i, int x) {
                while (i < val.length) {
                    val[i] += x;
                    i += i & -i;
                }
            }

            int get(int i) {
                int sum = 0;
                while (i > 0) {
                    sum += val[i];
                    i -= i & -i;
                }
                return sum;
            }

            int get(int l, int r) {// sum of [l , r]
                return get(r) - get(l - 1);
            }
        }