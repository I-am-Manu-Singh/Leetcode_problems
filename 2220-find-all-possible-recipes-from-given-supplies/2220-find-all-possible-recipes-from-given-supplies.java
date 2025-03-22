class Solution {
 public List<String> findAllRecipes(
        String[] recipes,
        List<List<String>> ingredients,
        String[] supplies
    ) {
        int n = recipes.length;  // number of recipes
        List<String> result = new ArrayList<>();

        // Initialize the set of available supplies
        Set<String> st = new HashSet<>(Arrays.asList(supplies));

        // Cooked recipes tracker
        boolean[] cooked = new boolean[n];

        int count = n;

        // Keep trying to cook recipes until no more can be cooked
        while (count > 0) {
            int prevCount = count;  // track changes to break loop if stuck

            for (int j = 0; j < n; j++) {
                if (cooked[j]) {
                    continue;  // already cooked
                }

                boolean canCook = true;

                // Check if all ingredients are available
                for (String ingredient : ingredients.get(j)) {
                    if (!st.contains(ingredient)) {
                        canCook = false;
                        break;
                    }
                }

                if (canCook) {
                    // Mark recipe as cooked
                    st.add(recipes[j]);
                    result.add(recipes[j]);
                    cooked[j] = true;
                    count--;  // cooked one more recipe
                }
            }

            // If no recipe was cooked in this iteration, break (avoids infinite loop)
            if (prevCount == count) {
                break;
            }
        }

        return result;
    }
}