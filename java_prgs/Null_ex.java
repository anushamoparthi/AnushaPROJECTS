package java_prgs;


	public class Null_ex {

		public static void main(String[] args) {

			Null_ex obj = new Null_ex();
			obj.overLoad(null);
		}

		private void overLoad(int o) {
			System.out.println("Object o argument method.");
		}

		private void overLoad(double[] dArray) {
			System.out.println("double array argument method.");
		}

	}

