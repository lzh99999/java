public class TestSwap {
    public static void main(String[] args) {
        Swap a = new Swap(1);
        Swap b = new Swap(2);
        System.out.println(a.value+" "+ b.value);
        swap(a, b);
        System.out.println(a.value+" "+ b.value);
    }

    public static void swap(Swap a, Swap b) {
        int tmp = a.value;
        a.value = b.value;
        b.value = tmp;
    }
}
class Swap{
    int value;
    Swap(int value){
        this.value=value;
    }
}
