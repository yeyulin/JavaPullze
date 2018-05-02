package fivePuzzle.fivetyOne;

 class Point2 {
	 protected final int x, y;
	 private String name; 
	 Point2(int x, int y) {
		 this.x = x;
		 this.y = y;
	}
	 protected String makeName() {
		 return "[" + x + "," + y + "]";
		}
	 public final synchronized String toString() {
		 if (name == null)
			 name = makeName();
		 
		 return name;
	}
}
