interface calculate{
 public int sum(int a,  int b);
 public int diff(int a,  int b);
 public int multi(int a, int b);
}

class calculateImpl implements calculate{
    public int sum(int a,  int b){
        return a+b;
    }
    public int diff(int a,  int b){
        return a-b;
    } 
    public int multi(int a, int b){
        return a*b;
    }
}
class CalculateDriver {
    public static void main(String[] args){
        calculateImpl s = new calculateImpl();
        Scanner c = new Scanner(System.in);
        System.out.println("Enter num 1");
        int n1 = c.nextInt();
        System.out.println("Enter num 2");
        int n2 = c.nextInt();

        System.out.println(c.sum(n1,n2));
        System.out.println(c.diff(n1,n2));
        System.out.println(c.multi(n1,n2));

    }
}