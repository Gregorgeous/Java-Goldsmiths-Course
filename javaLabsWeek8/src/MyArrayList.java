public class MyArrayList {
//    a bunch of class variables and one static as well.
    private static final int SIZE_FACTOR=10;
    private Object data[];
    private int index =0;
    private int size;
//    the constructor - we initialize data array with an initial size of the SIZE_FACTOR value.
    public MyArrayList(){
        this.data=new Object[SIZE_FACTOR];
//        We also assign this.size, which will keep track of the size of the array
        this.size=SIZE_FACTOR;
    }
//    There are 2 base conditions for "add" method: if our array is empty or if it's not.
    public void add(Object obj){
//        If it is, we just add the object at index 0 and add +1 to the index.
     if (this.index == 0){
         this.data[index] = obj;
         this.index++;
     }
//     Otherwise, we check for 2 more cases
     else {
//         if there's still space in the array, we do the same as previously
         if (this.index < this.size){
             this.data[index] = obj;
             this.index++;
         }
//         but if not..
         else {
//             we create new array, make it have +10 more spaces than our array..
             Object [] temporaryArray = new Object[this.size + SIZE_FACTOR];
//             we copy all the values from our array to the new array
             for (int i = 0; i < index; i++) {
                 temporaryArray[i] = this.data[i];
             }
//             Finally, we assign our own array to the new array.
             this.data = temporaryArray;
         }
     }
    }

//      We check 4 cases when we want to get a value from our array..
    public Object get(int i) throws Exception{
//        If the argument i is more than the size of our array, we throw a s.o.p. warning and return null
        if (i > this.size) {
            System.out.println("this index exceeds the array! ");
            return null;
        }
//        If the argument i is more than the index, we throw a s.o.p. warning and return null
        else if (i > this.index){
            System.out.println("there is no item stored at that index, currently the highest index a value is stored is at index :" + this.index);
            return null;
        }
//        If the argument i is a negative value, we throw a s.o.p. warning and return null
        else if (i < 0) {
            System.out.println("there's no negative-value index");
            return null;
        }
//        Otherwise, we return a proper data.
        else {
            return this.data[i];
        }
    }
    public void remove(int i) throws Exception{
//        TODO: logical error over here!
//        If the index-argument (i.e. "i") provided is less than the index, we just throw a s.o.p warning
        if (i > this.index){
            System.out.println("there is no item stored at that index, currently the highest index a value is stored is at index :" + this.index);
        }
//        If the index-argument (i.e. "i") provided is less than 0 , we just throw a s.o.p warning
        else if (i < 0) {
            System.out.println("there's no negative-value index, try again!");
        }
//        If the index-argument (i.e. "i") provided is equal to 0 AND also there's only 1 element in the array (i.e. this.index ==0)..
        else if (this.index == 0 && i == 0) {
//            .. we just make this one element null
            this.data[i] = null;
        }
//        If the index-argument (i.e. "i") provided is equal to 0 AND the 0th index is already null, we just we just throw a s.o.p warning
        else if (this.index == 0 && this.data[this.index] == null) {
            System.out.println("this arraylist is already empty..");
        }
//        if none of the above conditions, we're good to go and we can delete the item from the array
        else {
            this.data[i] = null;
//        Bear in mind, this implementation of the array allows that after deleting the item, there's an "empty" space in the array at that index.
//        BUT we weren't explicitly told we need to handle that, so I followed the way "delete" is done in the Javascript world :)
        }
    }
    public static void main(String[] args) throws Exception {
//      We instantiate our class and test the methods
        MyArrayList mal = new MyArrayList();
        mal.add("zero");
        mal.add("one");
        mal.add("two");
        mal.add("three");
        mal.add("four");
        mal.add("five");
        mal.add("six");
        mal.add("seven");
        mal.add("eight");
        mal.add("nine");
        mal.remove(6);
        System.out.println(mal.get(6));
        System.out.println(mal.get(8));
        System.out.println(mal.get(9));
    }
}

