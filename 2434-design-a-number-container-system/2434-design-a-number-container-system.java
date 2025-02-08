class NumberContainers {

    private Map<Integer, Integer> indexToNum;
    private Map<Integer, TreeSet<Integer>> numToIndices;

    public NumberContainers() {
        indexToNum = new HashMap<>();
        numToIndices = new HashMap<>();
    }
    
    public void change(int index, int number) {
        if(indexToNum.containsKey(index)){
            int oldNum = indexToNum.get(index);
            numToIndices.get(oldNum).remove(index);

            // check if number has zero indices and remove the number
            if(numToIndices.get(oldNum).isEmpty()){
                numToIndices.remove(oldNum);
            }
        }

        indexToNum.put(index,number);
        numToIndices.putIfAbsent(number, new TreeSet<>());
        numToIndices.get(number).add(index);
    }
    
    public int find(int number) {
        return numToIndices.containsKey(number) ? numToIndices.get(number).first() : -1;
    }
}