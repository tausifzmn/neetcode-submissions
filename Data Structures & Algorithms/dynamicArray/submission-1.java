class DynamicArray {

    private int[] arr; // array to hold the elements
    private int size; // current number of elements
    private int capacity; // Maximum number of elements array can hold

    // Constructor init with a capaciity
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0;

    }

    // get element at index i
    public int get(int i) {
        return arr[i];
    }

    // set value of element at index i to n
    public void set(int i, int n) {
        arr[i] = n;
    }

    // Add element to the end of the array
    public void pushback(int n) {
        if (size == capacity) {
            resize(); // if array is full, resize
        } 
        arr[size] = n; // Add new element at the next available position
        size++; // Increment the size
    }

    // Remove and return the last element of the array
    public int popback() {
        
        int lastElement = arr[size - 1]; // Get the last element
        size--; // Decrease the size to remove the last element
        return lastElement;
    }

    // Resize the array (double the capacity)
    private void resize() {
        capacity *= 2; // doubles capacity
        int[] newArr = new int[capacity]; // create a new array with the increased capacity
        for (int i = 0; i <size; i++) {
            newArr[i] = arr[i]; // fill new array with elements from array
        }
        arr = newArr; // Replace old array with the new array

    }

    // return the current number of elements in the array
    public int getSize() {
        return size;
    }

    // return the capacity of the array
    public int getCapacity() {
        return capacity;
    }
}
