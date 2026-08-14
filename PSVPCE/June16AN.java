class Caluclator {
    int res;

    public Caluclator() {
        this(0);
    }

    public Caluclator(int res) {
        this.res = res;
    }

    public Caluclator add(int val) {
        res += val;
        return this;
    }

    public Caluclator sub(int val) {
        res -= val;
        return this;
    }

    public Caluclator mul(int val) {
        res *= val;
        return this;
    }

    public int getValue() {
        return res;
    }
}

public class June16AN {
    public static void main(String[] args) {
        Caluclator c1 = new Caluclator(10);
        int res = c1.add(10).add(15).mul(2).getValue();
        System.out.println(res);
    }
}