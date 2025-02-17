public class Solution
{
    // Step 1: Backtracking function
    public static int backtrack(HashMap<Character, Integer> freqMap)
    {
        int count = 0;

        // Step 2: Iterate through each character in the frequency map
        for (char ch : freqMap.keySet())
        {
            if (freqMap.get(ch) > 0)
            {
                // Step 3: Pick a letter
                freqMap.put(ch, freqMap.get(ch) - 1); // Reduce the frequency
                
                count += 1 + backtrack(freqMap); // Recursive call
                
                // Step 4: Backtrack (restore count)
                freqMap.put(ch, freqMap.get(ch) + 1);
            }
        }

        return count;
    }

    // Step 5: Main function to compute tile possibilities
    public static int numTilePossibilities(String tiles)
    {
        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Step 6: Build frequency map
        for (char ch : tiles.toCharArray())
        {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Step 7: Call backtracking function
        return backtrack(freqMap);
    }
}