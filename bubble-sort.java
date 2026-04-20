class B {
    public static void main(String args[]) {
        int a[] = {5,2,4,1};

        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a.length-1;j++) {
                if(a[j] > a[j+1]) {
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }

        for(int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
    }
}
