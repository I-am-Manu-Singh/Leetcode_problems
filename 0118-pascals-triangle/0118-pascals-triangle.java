class Solution {
    public List<List<Integer>> generate(int numRows) {
        // Initialize the main list that will hold all rows of Pascal's Triangle
        List<List<Integer>> triangle = new ArrayList<>();
      
        // The first row of Pascal's Triangle is always [1]
        triangle.add(List.of(1));
      
        // Loop through each row (starting from the second row)
        for (int rowIndex = 1; rowIndex < numRows; ++rowIndex) {
            // Initialize the list to hold the current row's values
            List<Integer> row = new ArrayList<>();
          
            // The first element in each row is always 1
            row.add(1);
          
            // Compute the values within the row (excluding the first and last element)
            for (int j = 0; j < triangle.get(rowIndex - 1).size() - 1; ++j) {
                // Calculate each element as the sum of the two elements above it
                row.add(triangle.get(rowIndex - 1).get(j) + triangle.get(rowIndex - 1).get(j + 1));
            }
          
            // The last element in each row is always 1
            row.add(1);
          
            // Add the computed row to the triangle list
            triangle.add(row);
        }
      
        // Return the fully constructed list of rows of Pascal's Triangle
        return triangle;
    }
}
