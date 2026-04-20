class D {
    public static void main(String args[]) {
        int q[] = new int[5];
        int f = 0, r = -1;

        r++;
        q[r] = 10;

        r++;
        q[r] = 20;

        System.out.println("Deleted " + q[f]);
        f++;
    }
}
