package com.techwave;

	public class Sample {
		static int solution(int num, int digit) {

			if (num == 0) {
				return digit * 10;
			}
			int negative = num / Math.abs(num);

			num = Math.abs(num);
			int n = num;
		
			int maxVal = num;
			int counter = 0;
			int position = 1;

			while (n > 0) {
				counter++;
				n = n / 10;
			}

			for (int i = 0; i <= counter; i++) {
				int newVal = ((num / position) * (position*  10)) + (digit * position) + (num % position);

				// if new value is greater the maxVal
				if (newVal * negative > maxVal) {
					maxVal = newVal * negative;
				}

				position = position * 10;
			}

			return maxVal;

		}

		public static void main(String[] args) {
			System.out.println(solution(268, 5));
			System.out.println(solution(670, 5));
			System.out.println(solution(0, 5));
			System.out.println(solution(-999, 5));

		}
	}
	

