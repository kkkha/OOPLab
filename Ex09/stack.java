interface stack<T>
{
    int is_empty();
    int is_full(int size);
    void push(int size,T val);
    int pop();
}