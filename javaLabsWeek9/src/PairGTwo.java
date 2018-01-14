public class PairGTwo<T extends Number,S extends Number>
{
    private T first;
    private S second;
    public PairGTwo(T firstElement, S secondElement)
    {
        first = firstElement;
        second = secondElement;
    }
    public T getFirst() { return first; }
    public S getSecond() { return second; }
    public boolean swap (){
        if (this.first == this.second){
            System.out.println("both first and second are equal, thus I return false");
            return false;
        }
        try {
            S temp = (S) this.first;
            this.first = (T) this.second;
            this.second = temp;
            return true;
        } catch (ClassCastException castingE){
            System.out.println("Those two types are can't be swapped, because they are incompatible");
            return false;
        }
    }

    public boolean equal (T arg){
        return this.first == this.second;
    }
}