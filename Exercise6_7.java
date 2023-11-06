class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(int x, int y) {
        return Math.sqrt((x - this.x)*(x - this.x) + (y - this.y)*(y - this.y));
    }

}

class Exercise6_7 {
    public static void main(String args[]) {
        MyPoint p = new MyPoint(1,1);

        System.out.println(p.getDistance(2,2));
    }
}
