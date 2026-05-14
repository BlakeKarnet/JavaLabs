package main.java.org.example.chapter01.decimal;

public class MyBigDecimal {

    private long value;
    private int scale;

    public MyBigDecimal(long value, int scale) {
        this.value = value;
        this.scale = scale;
    }

    public static MyBigDecimal fromString(String s) {
        if (s.contains(".")) {
            int index = s.indexOf(".");
            int scale = s.length() - index - 1;
            String digits = s.substring(0, index) + s.substring(index + 1);
            return new MyBigDecimal(Long.parseLong(digits), scale);
        } else {
            return new MyBigDecimal(Long.parseLong(s), 0);
        }
    }

    private static MyBigDecimal alignScale(MyBigDecimal a, MyBigDecimal b) {
        if (a.scale > b.scale) {
            long newValue = b.value * (long)Math.pow(10, a.scale - b.scale);
            return new MyBigDecimal(newValue, a.scale);
        } else if (a.scale < b.scale) {
            long newValue = a.value * (long)Math.pow(10, b.scale - a.scale);
            return new MyBigDecimal(newValue, b.scale);
        }
        return a;
    }

    public MyBigDecimal add(MyBigDecimal other) {
        int maxScale = Math.max(this.scale, other.scale);

        long v1 = this.value * (long)Math.pow(10, maxScale - this.scale);
        long v2 = other.value * (long)Math.pow(10, maxScale - other.scale);

        return new MyBigDecimal(v1 + v2, maxScale);
    }

    public MyBigDecimal subtract(MyBigDecimal other) {
        int maxScale = Math.max(this.scale, other.scale);

        long v1 = this.value * (long)Math.pow(10, maxScale - this.scale);
        long v2 = other.value * (long)Math.pow(10, maxScale - other.scale);

        return new MyBigDecimal(v1 - v2, maxScale);
    }

    public MyBigDecimal multiply(MyBigDecimal other) {
        long resultValue = this.value * other.value;
        int resultScale = this.scale + other.scale;

        return new MyBigDecimal(resultValue, resultScale);
    }

    public MyBigDecimal divide(MyBigDecimal other, int precision) {
        long scaledDividend = this.value * (long)Math.pow(10, precision);
        long resultValue = scaledDividend / other.value;

        int resultScale = this.scale - other.scale + precision;

        return new MyBigDecimal(resultValue, resultScale);
    }

    public static void main(String[] args) {
        MyBigDecimal a = MyBigDecimal.fromString("10.5");
        MyBigDecimal b = MyBigDecimal.fromString("2.3");

        System.out.println("Add: " + a.add(b));
        System.out.println("Sub: " + a.subtract(b));
        System.out.println("Mul: " + a.multiply(b));
        System.out.println("Div: " + a.divide(b, 5));  // ~4.56521
    }
}
