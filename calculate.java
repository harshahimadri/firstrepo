interface calculate{
 public int sum(int a,  int b);
 public int diff(int a,  int b);
}

class calculateImpl implements calculate{
    public int sum(int a,  int b){
        return a+b;
    }
    public int diff(int a,  int b){
        return a-b;
    } 
}