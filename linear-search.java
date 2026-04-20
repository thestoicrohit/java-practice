class A {
    public static void main(String args[]) {
        int a[] = {10,20,30,40};
        int i, key = 30;

        for(i=0;i<a.length;i++) {
            if(a[i]==key) {
                System.out.println("Found at " + i);
                break;
            }
        }

        if(i==a.length) {
            System.out.println("Not found");
        }
    }
}
