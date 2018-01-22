public class PairG <T>
{
    private T first;
    private T second;
    public PairG(T firstElement, T secondElement)
    {
        first = firstElement;
        second = secondElement;
    }
    public T getFirst() { return first; }
    public T getSecond() { return second; }
    public boolean swap (){
        if (this.first == this.second){
            System.out.println("both first and second are equal, thus I return false");
            return false;
        }
        T temp = this.first;
        this.first = this.second;
        this.second = temp;
        if ( this.second == this.first){
            return false;
        }
        else {
            return true;
        }
    }

    public boolean equal (T arg){
        return this.first == this.second;
    }
}